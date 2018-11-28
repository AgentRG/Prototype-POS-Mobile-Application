package com.agentrg.Adidas_mPosPrototype;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.agentrg.Adidas_mPosPrototype.MainMenu.BOHActivity;
import com.agentrg.Adidas_mPosPrototype.MainMenu.ClientsActivity;
import com.agentrg.Adidas_mPosPrototype.MainMenu.SalesActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private boolean doubleBackToExitPressedOnce = false;

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
                startActivity(new Intent(MainActivity.this, BOHActivity.class));
                overridePendingTransition( R.anim.slide_up, R.anim.slide_down);
                break;

            case R.id.clients:
                startActivity(new Intent(MainActivity.this, ClientsActivity.class));
                overridePendingTransition( R.anim.slide_up, R.anim.slide_down);
                break;
        }
    }
    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Click back again to exit.", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }
}
