package com.example.ioedu.adr_matdesign;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.colocarFAB();
    }

    public void colocarFAB(){
        //ejemplo: https://youtu.be/KF-OddyWamg?t=5763
        FloatingActionButton oFab = (FloatingActionButton) findViewById(R.id.fab);
        //explicación: Herancia Abstracta:
        // https://stackoverflow.com/questions/30552028/how-to-understand-new-class-methodsome-code-in-android
        oFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("edunoob","onClick");
                Toast.makeText(MainActivity.this, "Diste Click :D",Toast.LENGTH_LONG).show();
            }
        });
    }
}
