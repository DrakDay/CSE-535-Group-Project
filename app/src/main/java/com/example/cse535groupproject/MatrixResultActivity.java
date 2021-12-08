package com.example.cse535groupproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MatrixResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matrix_result);

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.MATRIX_RESULT);

        TextView textView = findViewById(R.id.textView);

        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText(text);
    }
}