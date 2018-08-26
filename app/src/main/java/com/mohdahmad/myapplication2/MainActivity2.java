package com.mohdahmad.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        View view=this.findViewById(R.id.action_settings);
    }
}