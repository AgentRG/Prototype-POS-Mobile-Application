package com.agentrg.Adidas_mPosPrototype.MainMenu.BOH;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.agentrg.Adidas_mPosPrototype.R;

public class Inventory extends AppCompatActivity implements View.OnClickListener {

    private ImageView shoeBlack, shoeBlue, shoeMaroon;

    private ImageButton shoeBlackTick, shoeBlackNoTick, shoeBlueTick, shoeBlueNoTick, shoeMaroonTick, shoeMaroonNoTick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        shoeBlack = findViewById(R.id.shoeblack);
        shoeBlue = findViewById(R.id.shoeblue);
        shoeMaroon = findViewById(R.id.shoemaroon);

        shoeBlackTick = findViewById(R.id.shoeblacktick);
        shoeBlackTick.setOnClickListener(this);
        shoeBlackNoTick = findViewById(R.id.shoeblacknotick);
        shoeBlackNoTick.setOnClickListener(this);

        shoeBlueTick = findViewById(R.id.shoebluetick);
        shoeBlueTick.setOnClickListener(this);
        shoeBlueNoTick = findViewById(R.id.shoebluenotick);
        shoeBlueNoTick.setOnClickListener(this);

        shoeMaroonTick = findViewById(R.id.shoemaroontick);
        shoeMaroonTick.setOnClickListener(this);
        shoeMaroonNoTick = findViewById(R.id.shoemaroonnotick);
        shoeMaroonNoTick.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.shoeblacktick:
                shoeBlack.setVisibility(View.VISIBLE);
                shoeBlue.setVisibility(View.INVISIBLE);
                shoeMaroon.setVisibility(View.INVISIBLE);

                shoeBlackTick.setVisibility(View.VISIBLE);
                shoeBlackNoTick.setVisibility(View.INVISIBLE);

                shoeMaroonNoTick.setVisibility(View.VISIBLE);
                shoeMaroonTick.setVisibility(View.INVISIBLE);

                shoeBlueNoTick.setVisibility(View.VISIBLE);
                shoeBlueTick.setVisibility(View.INVISIBLE);
                break;
            case R.id.shoeblacknotick:
                shoeBlack.setVisibility(View.VISIBLE);
                shoeBlue.setVisibility(View.INVISIBLE);
                shoeMaroon.setVisibility(View.INVISIBLE);

                shoeBlackTick.setVisibility(View.VISIBLE);
                shoeBlackNoTick.setVisibility(View.INVISIBLE);

                shoeMaroonNoTick.setVisibility(View.VISIBLE);
                shoeMaroonTick.setVisibility(View.INVISIBLE);

                shoeBlueNoTick.setVisibility(View.VISIBLE);
                shoeBlueTick.setVisibility(View.INVISIBLE);
                break;
            case R.id.shoebluetick:
                shoeBlack.setVisibility(View.INVISIBLE);
                shoeBlue.setVisibility(View.VISIBLE);
                shoeMaroon.setVisibility(View.INVISIBLE);

                shoeBlackTick.setVisibility(View.INVISIBLE);
                shoeBlackNoTick.setVisibility(View.VISIBLE);

                shoeMaroonNoTick.setVisibility(View.VISIBLE);
                shoeMaroonTick.setVisibility(View.INVISIBLE);

                shoeBlueNoTick.setVisibility(View.INVISIBLE);
                shoeBlueTick.setVisibility(View.VISIBLE);
                break;
            case R.id.shoebluenotick:
                shoeBlack.setVisibility(View.INVISIBLE);
                shoeBlue.setVisibility(View.VISIBLE);
                shoeMaroon.setVisibility(View.INVISIBLE);

                shoeBlackTick.setVisibility(View.INVISIBLE);
                shoeBlackNoTick.setVisibility(View.VISIBLE);

                shoeMaroonNoTick.setVisibility(View.VISIBLE);
                shoeMaroonTick.setVisibility(View.INVISIBLE);

                shoeBlueNoTick.setVisibility(View.INVISIBLE);
                shoeBlueTick.setVisibility(View.VISIBLE);
                break;
            case R.id.shoemaroontick:
                shoeBlack.setVisibility(View.INVISIBLE);
                shoeBlue.setVisibility(View.INVISIBLE);
                shoeMaroon.setVisibility(View.VISIBLE);

                shoeBlackTick.setVisibility(View.INVISIBLE);
                shoeBlackNoTick.setVisibility(View.VISIBLE);

                shoeMaroonNoTick.setVisibility(View.INVISIBLE);
                shoeMaroonTick.setVisibility(View.VISIBLE);

                shoeBlueNoTick.setVisibility(View.VISIBLE);
                shoeBlueTick.setVisibility(View.INVISIBLE);
                break;
            case R.id.shoemaroonnotick:
                shoeBlack.setVisibility(View.INVISIBLE);
                shoeBlue.setVisibility(View.INVISIBLE);
                shoeMaroon.setVisibility(View.VISIBLE);

                shoeBlackTick.setVisibility(View.INVISIBLE);
                shoeBlackNoTick.setVisibility(View.VISIBLE);

                shoeMaroonNoTick.setVisibility(View.INVISIBLE);
                shoeMaroonTick.setVisibility(View.VISIBLE);

                shoeBlueNoTick.setVisibility(View.VISIBLE);
                shoeBlueTick.setVisibility(View.INVISIBLE);
                break;
        }

    }
}
