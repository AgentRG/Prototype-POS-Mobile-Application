package com.agentrg.Adidas_mPosPrototype.MainMenu.Clients;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import java.util.ArrayList;
import java.util.List;

import com.agentrg.Adidas_mPosPrototype.R;

public class ClientList extends AppCompatActivity implements View.OnClickListener {
    private static Toolbar toolbar;
    private static ViewPager viewPager;
    private static TabLayout tabLayout;
    private static int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_list);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton imageButton8 = findViewById(R.id.imageButton8);
        imageButton8.setOnClickListener(this);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);//setting tab over viewpager

        //Implementing tab selected listener over tablayout
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());//setting current selected item over viewpager
                switch (tab.getPosition()) {
                    case 0:
                        Log.e("TAG","TAB1");
                        break;
                    case 1:
                        Log.e("TAG","TAB2");
                        break;
                    case 2:
                        Log.e("TAG","TAB3");
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }


    //Setting View Pager
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new DummyFragment("Clients"), "Clients");
        adapter.addFrag(new DummyFragment("Messages"), "Messages");
        adapter.addFrag(new DummyFragment("More Info"), "More Info");
        viewPager.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageButton8:
                showMessage(v);
                i++;
                break;
        }
    }


    //View Pager fragments setting adapter class
    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();//fragment arraylist
        private final List<String> mFragmentTitleList = new ArrayList<>();//title arraylist

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }


        //adding fragments and title method
        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
    public static void showMessage(final View view) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(view.getContext());
        if(i == 0) {
            alertDialog.setTitle("Andrea Annable");
            alertDialog.setPositiveButton("View Information", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    showInformationAndrea(view);
                }
            });
            alertDialog.show();
        }
        if(i == 1) {
            alertDialog.setTitle("Toby Barker");
            alertDialog.setPositiveButton("View Information", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    showInformationToby(view);
                }
            });
            alertDialog.show();
            i = 0;
        }
    }
    public static void showInformationAndrea(final View view) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(view.getContext());
        alertDialog.setTitle("Andrea Annable");
        alertDialog.setMessage("Name: Andrea Annable\nPhone #: 555-555-5555\nAddress: 123 Example Dr.\nCity: Example City");
        alertDialog.show();
    }

    public static void showInformationToby(final View view) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(view.getContext());
        alertDialog.setTitle("Toby Barker");
        alertDialog.setMessage("Name: Toby Barker\nPhone #: 111-111-1111\nAddress: 321 Test Dr.\nCity: Test City");
        alertDialog.show();
    }
}
