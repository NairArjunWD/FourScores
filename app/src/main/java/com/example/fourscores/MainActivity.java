package com.example.fourscores;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button bt_restart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_restart=(Button)findViewById(R.id.resetButton);
        bt_restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restartIntent = getBaseContext().getPackageManager()
                        .getLaunchIntentForPackage(getBaseContext().getPackageName());
                restartIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(restartIntent);
            }
        });
    }

    public void gone (View view) {
        Button base = findViewById(R.id.baseballButton);
        base.setVisibility(View.GONE);
        Button basket = findViewById(R.id.basketballButton);
        basket.setVisibility(View.GONE);
        Button foot = findViewById(R.id.footballButton);
        foot.setVisibility(View.GONE);
        Button socc = findViewById(R.id.soccerButton);
        socc.setVisibility(View.GONE);
        Button restart = findViewById(R.id.resetButton);
        restart.setVisibility(View.VISIBLE);
        TextView textV = findViewById(R.id.world);
        textV.setVisibility(View.VISIBLE);

    }
}