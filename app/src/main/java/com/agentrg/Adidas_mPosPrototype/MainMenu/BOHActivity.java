package com.agentrg.Adidas_mPosPrototype.MainMenu;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.agentrg.Adidas_mPosPrototype.MainMenu.BOH.Inventory;
import com.agentrg.Adidas_mPosPrototype.R;

public class BOHActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boh);

        Button inventory = findViewById(R.id.inventory);
        inventory.setOnClickListener(this);

        Button shipment = findViewById(R.id.shipment);
        shipment.setOnClickListener(this);

        Button transfers = findViewById(R.id.transfers);
        transfers.setOnClickListener(this);

        Button reports = findViewById(R.id.reports);
        reports.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.inventory:
                startActivity(new Intent(BOHActivity.this, Inventory.class));
                overridePendingTransition( R.anim.slide_up, R.anim.slide_down);
                break;

            case R.id.shipment:
                showMessage(v);
                break;

            case R.id.transfers:
                showMessage(v);
                break;

            case R.id.reports:
                showMessage(v);
                break;

        }
    }

    public static void showMessage(final View view) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(view.getContext());
        alertDialog.setTitle("Confirm");
        alertDialog.setMessage("Currently not set up.");
        alertDialog.show();
    }
}
