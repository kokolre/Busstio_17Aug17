package com.example.toto.projertbutstop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class input_offline extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_offline);

        //Start Controller
        startController();


        //End Controller
        endController();


    }   // Main Method

    @Override
    protected void onActivityResult(int requestCode,
                                    int resultCode,
                                    Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        String tag = "18AugV2";

        try {
            Log.d(tag, "requestCode ==> " + requestCode);
            switch (requestCode) {
                case 1000:
                    break;
                case 1100:
                    break;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void endController() {
        Button button = (Button) findViewById(R.id.InputbusEnd);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(input_offline.this, MySearchView.class);
                startActivityForResult(intent, 1100);
            }
        });
    }

    private void startController() {
        Button button = (Button) findViewById(R.id.InputbusStart);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(input_offline.this, MySearchView.class);
                startActivityForResult(intent, 1000);

            }   // onClick
        });
    }

}   // Main Class
