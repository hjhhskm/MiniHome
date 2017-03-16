package com.example.a97building.minihome;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
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
        final FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();

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
                fragmentTransaction.add(R.id.fragment_container,infoP);
                fragmentTransaction.commit();
            }
        });

        phone = (TextView)view.findViewById(R.id.person_changephonenumber_arrow);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                startActivity(intent);
            }
        });



        return view;
    }


}
