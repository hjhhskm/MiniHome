package com.example.a97building.minihome;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by 97building on 2017/3/14.
 */

public class Fragment_Person extends Fragment{

    private View view;
    private ImageView head;
    private TextView info,phone,setting;

    private FragmentManager manager;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_person,container,false);
        manager = getFragmentManager();
        final FragmentTransaction fragmentTransaction = manager.beginTransaction();

        head = (ImageView)view.findViewById(R.id.person_myinfo_head);
        head.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(view.getContext(),"我的头像",Toast.LENGTH_SHORT).show();
            }
        });

        info = (TextView)view.findViewById(R.id.person_my_arrow);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment_Person_info infoP = new Fragment_Person_info();
                fragmentTransaction.replace(R.id.fragment_container,infoP);
                fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        phone = (TextView)view.findViewById(R.id.person_changephonenumber_arrow);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragmeng_Person_Phone phoneP = new Fragmeng_Person_Phone();
                fragmentTransaction.replace(R.id.fragment_container,phoneP);
                fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });


        return view;
    }

}
