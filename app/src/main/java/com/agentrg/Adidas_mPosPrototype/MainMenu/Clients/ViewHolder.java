package com.agentrg.Adidas_mPosPrototype.MainMenu.Clients;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.agentrg.Adidas_mPosPrototype.R;

public abstract class ViewHolder extends RecyclerView.ViewHolder {


    public TextView title;


    public ViewHolder(View view) {
        super(view);


        this.title = (TextView) view.findViewById(R.id.cardTitle);

    }


}
