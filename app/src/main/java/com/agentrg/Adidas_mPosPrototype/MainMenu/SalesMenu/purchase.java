package com.agentrg.Adidas_mPosPrototype.MainMenu.SalesMenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.agentrg.Adidas_mPosPrototype.MainMenu.SalesActivity;
import com.agentrg.Adidas_mPosPrototype.R;

public class purchase extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase);

        Button done = findViewById(R.id.done);
        done.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.done:
                startActivity(new Intent(purchase.this, SalesActivity.class));
                break;
        }
    }
}
