package com.example.a97building.minihome;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
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
    private FragmentTransaction fragmentTransaction;
    private Activity_Person_info infoP;
    private Activity_Person_Phone phoneP;

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_person,container,false);
        manager = getFragmentManager();
        fragmentTransaction = manager.beginTransaction();
        final FragmentTransaction fragmentTransaction = manager.beginTransaction();

        head = (ImageView)view.findViewById(R.id.person_myinfo_head);
        head.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                add change photo
                Toast.makeText(view.getContext(),"我的头像",Toast.LENGTH_SHORT).show();
            }
        });

        info = (TextView)view.findViewById(R.id.person_my_arrow);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Activity_Bubble_insert_info.class);
                startActivity(intent);
            }
        });

        phone = (TextView)view.findViewById(R.id.person_changephonenumber_arrow);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Activity_Person_Phone.class);
                startActivity(intent);
            }
        });


        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
