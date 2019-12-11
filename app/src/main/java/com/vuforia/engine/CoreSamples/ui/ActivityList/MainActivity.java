package com.vuforia.engine.CoreSamples.ui.ActivityList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.vuforia.engine.CoreSamples.R;

public class MainActivity extends Activity {

    Button btnAR, btnHair, btnAlarm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAR= findViewById(R.id.btnAR);
        btnHair=findViewById(R.id.btnHair);
        btnAlarm=findViewById(R.id.btnAlarm);

        btnAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,ActivityLauncher.class);
                startActivity(i);
            }
        });
    }
}
