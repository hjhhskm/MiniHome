package com.example.a97building.minihome;

import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by 97building on 2017/3/10.
 */

public class Fragment_Person_info extends Fragment{

    private View view;
    private ImageView protrait;
    private TextView name,sex,birth,phone;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_person_info,container,false);

        protrait = (ImageView)view.findViewById(R.id.person_protrait_image);
        protrait.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(view.getContext(),"点击更换头像",Toast.LENGTH_SHORT).show();
            }
        });

        name = (TextView)view.findViewById(R.id.person_name_edit);
        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText input = new EditText(view.getContext());
                input.setFocusable(true);
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setTitle("新的昵称").setView(input).setPositiveButton("确认", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        name.setText(input.getText().toString());
                    }
                }).setNegativeButton("取消",null);
                builder.show();
            }
        });

        birth = (TextView)view.findViewById(R.id.person_birth_select);
        birth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePicker data = new DatePicker(view.getContext());

            }
        });
        return  view;

    }
}
