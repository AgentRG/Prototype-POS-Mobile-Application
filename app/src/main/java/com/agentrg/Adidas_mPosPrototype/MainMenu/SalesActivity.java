package com.agentrg.Adidas_mPosPrototype.MainMenu;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.agentrg.Adidas_mPosPrototype.MainMenu.SalesMenu.Transactions;
import com.agentrg.Adidas_mPosPrototype.R;

public class SalesActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales);

        Button transaction = findViewById(R.id.transactions);
        transaction.setOnClickListener(this);

        Button reports = findViewById(R.id.reports);
        reports.setOnClickListener(this);

        Button giftCardBalance = findViewById(R.id.giftCardBalance);
        giftCardBalance.setOnClickListener(this);

        Button admin = findViewById(R.id.admin);
        admin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.transactions:
                startActivity(new Intent(SalesActivity.this, Transactions.class));
                overridePendingTransition( R.anim.slide_up, R.anim.slide_down);
                break;

            case R.id.reports:
                showMessage(v);
                break;

            case R.id.giftCardBalance:
                showMessage(v);
                break;

            case R.id.admin:
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