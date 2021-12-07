package com.example.cse535groupproject;

import java.util.ArrayList;
import java.util.Iterator;

public class Client_manage {

    protected ArrayList<client> client_manager = new ArrayList<client>();


    public void add(String ip){

        client_manager.add(new client(ip));
    }
    public void delete(int index){
        if (index == -1){
            return;
        }else{
            client_manager.remove(index);
        }
    }

    public int index(String ip){
        for(int i =0; i < client_manager.size(); i ++){
            if(client_manager.get(i).get_ip().equals(ip)){
                return i;
            }
        }
        return -1;
    }

    public void set_participate(int index, boolean status){
        client_manager.get(index).participate = status;

    }

    public int get_number_of_participate_client() {
        int ans = 0;
        for (int i = 0; i < client_manager.size(); i++) {
            if (client_manager.get(i).participate) {
                ans++;
            }
        }
        return ans;
    }

    public int get_number_of_working_client() {
        int ans = 0;
        for (int i = 0; i < client_manager.size(); i++) {
            if (client_manager.get(i).participate) {
                ans++;
            }
        }
        return ans;
    }
}

class client{

    public String IP;
    public int battery_level;
    public boolean participate = false;
    public double longitude = 0.0;
    public double latitude = 0.0;
    public boolean working = false;

    public client(String ip){
        IP = ip;
    }

    public String get_ip(){
        return IP;
    }

    public void set_battery_lvl(int bl){
        battery_level = bl;
    }


}