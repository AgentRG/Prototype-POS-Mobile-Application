package com.agentrg.Adidas_mPosPrototype.LaunchOptions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.agentrg.Adidas_mPosPrototype.R;

public class SalesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition( R.anim.no_animation, R.anim.no_animation);
    }
}
