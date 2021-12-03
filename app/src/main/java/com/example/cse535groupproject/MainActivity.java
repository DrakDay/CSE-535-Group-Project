package com.example.cse535groupproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.BatteryManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    // data section
    Client_manage client_manage = new Client_manage();
    private int n_client = 0;
    private int battery_level;

    //setting up a server
    private ServerSocket serverSocket;
    ArrayList<Socket> tempClientSockets = new ArrayList<Socket>();
    Thread serverThread = null;
    public static String SERVER_IP = "";
    public static final int SERVER_PORT = 8888;

    public int[][] matrixResult = new int[2][2]; //CHANGE TO MATCH SIZE OF MATRICES USED

    //ui element
    TextView server_ip_address;
    TextView n_client_view;
    TextView number_of_participate_client;
    TextView number_of_non_participate_client;
    Button confirm_participation;
    Button start_matrix_computation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ui
        server_ip_address = findViewById(R.id.server_ip_address);
        n_client_view = findViewById(R.id.N_client);
        number_of_participate_client = findViewById(R.id.client_participate);
        number_of_non_participate_client = findViewById(R.id.clien_not_participate);
        confirm_participation = findViewById(R.id.confirm_participation);
        start_matrix_computation = findViewById(R.id.send_matrix);

        //listening batter level check
        this.registerReceiver(this.batterylevelReciver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));


        //set up server ip
        try{
            SERVER_IP = getLocalIPaddress();
            server_ip_address.setText("master server ip address : " + SERVER_IP);
        } catch (UnknownHostException e){
            e.printStackTrace();
        }

        //starting server
        this.serverThread = new Thread(new ServerThread());
        this.serverThread.start();


        confirm_participation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessage("participate");
            }
        });

        start_matrix_computation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[][] matrix1 = MatrixValues.matrix1;
                int[][] matrix2 = MatrixValues.matrix2;

                int[][][] splitMatrices = getSplits(matrix1, matrix2);

                int splitIndex = 0;
                String message = "";

                for(client i : client_manage.client_manager){
                    Log.i("TAG", i.IP );
                    Log.i("TAG", String.valueOf(i.battery_level));
                    Log.i("TAG", String.valueOf(i.participate));
                    Log.i("TAG", String.valueOf(i.latitude) + ' ' + String.valueOf(i.longitude));

                    if (i.participate == true) {
                        int[][] clientMatrix1 = splitMatrices[splitIndex];
                        int[][] clientMatrix2 = splitMatrices[2];


                        message += "IP:" + i.IP + ",";

                        // Copy first matrix
                        for(int rowIndex = 0; rowIndex < clientMatrix1.length; rowIndex++) {
                            for(int columnIndex = 0; columnIndex < clientMatrix1[0].length; columnIndex++) {
                                message += Integer.toString(clientMatrix1[rowIndex][columnIndex]);
                                if (columnIndex != clientMatrix1[0].length-1)
                                    message += "@";
                            }
                            if (rowIndex != clientMatrix1.length-1)
                                message += ".";
                        }

                        // Copy second matrix
                        message += ",";
                        for(int rowIndex = 0; rowIndex < clientMatrix2.length; rowIndex++) {
                            for(int columnIndex = 0; columnIndex < clientMatrix2[0].length; columnIndex++) {
                                message += Integer.toString(clientMatrix2[rowIndex][columnIndex]);
                                if (columnIndex != clientMatrix2[0].length-1)
                                    message += "@";
                            }
                            if (rowIndex != clientMatrix2.length-1)
                                message += ".";
                        }

                        message += "," + splitIndex;
                        sendMessage(message);
                        Log.i("MESSAGE", message);
                        splitIndex++;
                    }
                }
            }
        });
    }

    // battery level check
    private BroadcastReceiver batterylevelReciver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            battery_level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0);
            Log.i("TAG", "battery level: " + Integer.toString(battery_level));
        }
    };

    // get master local ip address
    private String getLocalIPaddress() throws UnknownHostException{
        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
        assert wifiManager != null;
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
        int ipInt = wifiInfo.getIpAddress();
        return InetAddress.getByAddress(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(ipInt).array()).getHostAddress();
    }

    // server thread
    class ServerThread implements Runnable {

        public void run() {
            Socket socket;
            try {
                serverSocket = new ServerSocket(SERVER_PORT);
                Log.i("TAG", "Starting Server :");
            } catch (IOException e) {
                e.printStackTrace();
                Log.i("TAG", "Starting Server failed:" + e.getMessage());
            }
            if (null != serverSocket) {
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        socket = serverSocket.accept();
                        n_client ++;
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                n_client_view.setText("Number of Client: " + Integer.toString(n_client));
                            }
                        });

                        CommunicationThread commThread = new CommunicationThread(socket);
                        new Thread(commThread).start();
                    } catch (IOException e) {
                        e.printStackTrace();
                        Log.i("TAG", "Communicating to Client failed:" + e.getMessage());
                    }
                }
            }
        }
    }

    // communication thread
    class CommunicationThread implements Runnable {

        private Socket clientSocket;
        private BufferedReader input;

        public CommunicationThread(Socket clientSocket) {
            this.clientSocket = clientSocket;
            tempClientSockets.add(clientSocket);
            try {
                this.input = new BufferedReader(new InputStreamReader(this.clientSocket.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();

                Log.i("TAG", "Connecting to Client failed");
            }
            Log.i("TAG", "Connected to Client");
        }

        public void run() {

            while (!Thread.currentThread().isInterrupted()) {
                try {
                    String message = input.readLine();
                    if (null == message || message.contains("Disconnect")) {
                        Thread.interrupted();
                        n_client --;
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                n_client_view.setText("Number of Client: " + Integer.toString(n_client));
                                update_participation();
                            }
                        });

                        Log.i("TAG", "Client : (most time is Client Disconnected )" + message);
                        if(client_manage.client_manager.size() != 0){
                            client_manage.delete(client_manage.index(message.split(":")[1]));
                        }
                        break;
                    }
                    Log.i("TAG", "Client:" + message);
                    request_handler(message);

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }

    public void request_handler(String msg){

        if(msg.startsWith("IP")){
            String ip = msg.split(":")[1];
            client_manage.add(ip);
        }
        //see how many client want practice
        if(msg.startsWith("YES")){
            String[] split_msg = msg.split(",");
            String ip = split_msg[0].split(":")[1];
            String bl = split_msg[1].split(":")[1];
            Log.i("TAG", ip+ " " + bl);
            client_manage.set_participate(client_manage.index(ip),true);
            client_manage.client_manager.get(client_manage.index(ip)).set_battery_lvl(Integer.parseInt(bl));
            update_participation();
        }
        if(msg.startsWith("NO")){
            String ip = msg.split(":")[1];
            client_manage.set_participate(client_manage.index(ip),false);
            update_participation();
        }
        if(msg.startsWith("Lat")){
            String[] split_msg = msg.split(",");
            Double lat = Double.parseDouble(split_msg[0].split(":")[1]);
            Double lon = Double.parseDouble(split_msg[1].split(":")[1]);
            String ip = split_msg[2].split(":")[1];
            client_manage.client_manager.get(client_manage.index(ip)).latitude = lat;
            client_manage.client_manager.get(client_manage.index(ip)).longitude = lon;
        }

        if(msg.startsWith("RESULT")) {
            Log.i("TEST", msg);
            String[] splitMessage = msg.split(",");
            int index = Integer.valueOf(splitMessage[3]);

            String[] tempResult = splitMessage[2].split("@");

            for (int i = 0; i < tempResult.length; i++) {
                    matrixResult[index][i] = Integer.valueOf(tempResult[i]);
                }
        }

    }
    public void update_participation(){
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                int n = client_manage.get_number_of_participate_client();
                number_of_participate_client.setText("Client participate: " +Integer.toString(n));
                number_of_non_participate_client.setText("Client not participate: " + Integer.toString(n_client - n));
            }
        });
    }

    private void sendMessage(final String message) {
        try {
            for(Socket i: tempClientSockets){

                if (null != i) {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            PrintWriter out = null;
                            try {
                                out = new PrintWriter(new BufferedWriter(
                                        new OutputStreamWriter(i.getOutputStream())),
                                        true);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            out.println(message);
                        }
                    }).start();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (null != serverThread) {
            serverThread.interrupt();
            serverThread = null;
        }
    }


    // This method splits two matrices into 4 matrices
    // This works for two clients which is what we'll be using it for
    // Returns a list of 2-D matrices: The first two go to client 1, the next to go to client 2
    public static int[][][] getSplits(int[][] matrix1, int[][] matrix2) {
        int[][] m1 = new int[matrix1.length/2][matrix1[0].length];
        int[][] m2 = new int[matrix1.length/2][matrix1[0].length];
        int[][] m3 = new int[matrix2.length][matrix2[0].length];

        for (int i = 0; i < matrix1.length/2; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                m1[i][j] = matrix1[i][j];
                m2[i][j] = matrix1[i+matrix1.length/2][j];
            }
        }

        for (int i = 0; i < matrix2.length; i++)
            for (int j =0; j < matrix2[0].length; j++)
                m3[i][j] = matrix2[i][j];

        int[][][] result = new int[3][][];
        result[0] = m1;
        result[1] = m2;
        result[2] = m3;
        return result;
    }

    // Method for multiplying two matrices together
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2[0].length];
        if (matrix1[0].length != matrix2.length)
            System.out.println("ERROR: Dimensions of matrices do not match!");
        else {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    result[i][j] = 0;
                    for (int k = 0; k < matrix1[0].length; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
        }
        return result;
    }
}