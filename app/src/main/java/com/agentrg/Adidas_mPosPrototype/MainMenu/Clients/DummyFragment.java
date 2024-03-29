package com.agentrg.Adidas_mPosPrototype.MainMenu.Clients;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.agentrg.Adidas_mPosPrototype.R;

import java.util.ArrayList;

public class DummyFragment extends Fragment {
    private View view;

    private String title;//String for tab title

    private static RecyclerView recyclerView;

    public DummyFragment() {
    }

    @SuppressLint("ValidFragment")
    public DummyFragment(String title) {
        this.title = title;//Setting tab title
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.dummy_fragment, container, false);

        setRecyclerView();
        return view;

    }
    //Setting recycler view
    private void setRecyclerView() {

        recyclerView = (RecyclerView) view
                .findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView
                .setLayoutManager(new LinearLayoutManager(getActivity()));//Linear Items


        ArrayList<String> arrayList = new ArrayList<>();
        /*for (int i = 0; i < 20; i++) {
            arrayList.add(title+" Items " + i);//Adding items to recycler view
        }*/
        arrayList.add("001                                                 Andrea Annable");
        arrayList.add("002                                                        Toby Barker");
        arrayList.add("003                                                    Jamie Warren");
        arrayList.add("004                                           Jennifer Hargraves");
        arrayList.add("005                                                 Tommy Estrada");
        arrayList.add("006                                                   Bridget Munoz");
        arrayList.add("007                                                         John Smith");
        arrayList.add("008                                                        Elisa Hurley");

        RecyclerView_Adapter adapter = new RecyclerView_Adapter(getActivity(), arrayList);
        recyclerView.setAdapter(adapter);// set adapter on recyclerview

    }
}
