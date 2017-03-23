package com.example.a97building.minihome;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Login_Main extends AppCompatActivity{
    private TextView mTextMessage;
    private FragmentManager manager;
    private FragmentTransaction fragmentTransaction;
    private Fragment_Group group;
    private Fragment_Bubble_insert bubble;
    private Fragment_Person person;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            manager = getFragmentManager();
            fragmentTransaction = manager.beginTransaction();
            Hiden.hideFragement(fragmentTransaction,manager);
            switch (item.getItemId()) {
                case R.id.item0:
                    if(group == null){
                        group = new Fragment_Group();
                        fragmentTransaction.add(R.id.fragment_container,group,"group");
                    }else{
                        fragmentTransaction.show(group);
                    }
                    fragmentTransaction.commit();
                    return true;
                case R.id.item1:
                    if(bubble == null){
                        bubble = new Fragment_Bubble_insert();
                        fragmentTransaction.add(R.id.fragment_container,bubble,"bubble");
                    }else{
                        fragmentTransaction.show(bubble);
                    }
                    fragmentTransaction.commit();
                    return true;
                case R.id.item2:

                    return true;
                case R.id.item3:
                    if(person == null){
                        person = new Fragment_Person();
                        fragmentTransaction.add(R.id.fragment_container,person,"person");
                    }else{
                        fragmentTransaction.show(person);
                    }
                    fragmentTransaction.commit();
                    return true;
            }

            return false;
        }

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
