package com.agentrg.Adidas_mPosPrototype.MainMenu.SalesMenu;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.agentrg.Adidas_mPosPrototype.R;

public class Transactions extends AppCompatActivity implements View.OnClickListener {

    public static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);

        Button submitTransaction = findViewById(R.id.button);
        submitTransaction.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button:
                paymentOptions(v);
                break;

        }
    }

    public static void paymentOptions(final View view) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(view.getContext());
        alertDialog.setTitle("Submit");
        alertDialog.setItems(new CharSequence[]
                        {"Cash", "Credit/Debit Card", "Check"},
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // The 'which' argument contains the index position
                        // of the selected item
                        switch (which) {
                            case 0:
                                Toast.makeText(context, "Cash", Toast.LENGTH_SHORT).show();
                                break;
                            case 1:
                                Toast.makeText(context, "Credit Card", Toast.LENGTH_SHORT).show();
                                break;
                            case 2:
                                Toast.makeText(context, "Check", Toast.LENGTH_SHORT).show();
                                break;
                        }
                    }
                });
        alertDialog.create().show();
    }

}
