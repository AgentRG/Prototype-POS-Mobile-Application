package com.agentrg.Adidas_mPosPrototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.agentrg.Adidas_mPosPrototype.LaunchOptions.BOH;
import com.agentrg.Adidas_mPosPrototype.LaunchOptions.Clients;
import com.agentrg.Adidas_mPosPrototype.LaunchOptions.SalesActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton sales = findViewById(R.id.sales);
        sales.setOnClickListener(this);

        ImageButton boh = findViewById(R.id.boh);
        boh.setOnClickListener(this);

        ImageButton clients = findViewById(R.id.clients);
        clients.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sales:
                startActivity(new Intent(MainActivity.this, SalesActivity.class));
                overridePendingTransition( R.anim.slide_up, R.anim.slide_down);
                break;

            case R.id.boh:
                startActivity(new Intent(MainActivity.this, BOH.class));
                overridePendingTransition( R.anim.slide_up, R.anim.slide_down);
                break;

            case R.id.clients:
                startActivity(new Intent(MainActivity.this, Clients.class));
                overridePendingTransition( R.anim.slide_up, R.anim.slide_down);
                break;
        }
    }
}
