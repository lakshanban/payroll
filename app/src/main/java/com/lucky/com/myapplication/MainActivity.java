package com.lucky.com.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {


    RelativeLayout rellay1,rellay2;

    Handler handler=new Handler();
    Runnable runnable=new Runnable() {
        @Override
        public void run() {

            rellay1.setVisibility(View.VISIBLE);
            rellay2.setVisibility(View.VISIBLE);

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rellay1=findViewById(R.id.rellay1);
        rellay2=findViewById(R.id.rellay2);

        handler.postDelayed(runnable,2000);

    }
}
