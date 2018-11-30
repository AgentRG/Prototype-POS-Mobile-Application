package com.agentrg.Adidas_mPosPrototype.MainMenu;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.agentrg.Adidas_mPosPrototype.MainMenu.Clients.ClientList;
import com.agentrg.Adidas_mPosPrototype.R;

public class ClientsActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clients);

        ImageButton clientList = findViewById(R.id.clientList);
        clientList.setOnClickListener(this);

        ImageButton tasks = findViewById(R.id.tasks);
        tasks.setOnClickListener(this);

        ImageButton messages = findViewById(R.id.messages);
        messages.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
     switch(v.getId()) {
         case R.id.clientList:
             startActivity(new Intent(ClientsActivity.this, ClientList.class));
             overridePendingTransition( R.anim.slide_up, R.anim.slide_down);
             break;

         case R.id.tasks:
             showMessage(v);
             break;

         case R.id.messages:
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
