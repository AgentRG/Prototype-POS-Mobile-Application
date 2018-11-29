package com.agentrg.Adidas_mPosPrototype.MainMenu.SalesMenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.agentrg.Adidas_mPosPrototype.R;

public class Transactions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);

        EditText editText = findViewById(R.id.editText3);
        editText.setFocusable(false);
        editText.setClickable(false);
    }
}
