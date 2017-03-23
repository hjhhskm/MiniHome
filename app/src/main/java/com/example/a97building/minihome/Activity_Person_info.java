package com.example.a97building.minihome;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by 97building on 2017/3/10.
 */

public class Activity_Person_info extends Activity {

    private ImageView protrait;
    private TextView name,sex,birth,phone;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.fragment_person_info);
        protrait = (ImageView)findViewById(R.id.person_protrait_image);
        protrait.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity_Person_info.this,"good",Toast.LENGTH_SHORT).show();

            }
        });

        name = (TextView)findViewById(R.id.person_name_edit);
        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText input = new EditText(Activity_Person_info.this);
                input.setFocusable(true);
                AlertDialog.Builder builder = new AlertDialog.Builder(Activity_Person_info.this);
                builder.setTitle("新的昵称").setView(input).setPositiveButton("确认", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        name.setText(input.getText().toString());
                    }
                }).setNegativeButton("取消",null);
                builder.show();
            }
        });

        birth = (TextView)findViewById(R.id.person_birth_select);
        birth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePicker data = new DatePicker(Activity_Person_info.this);

            }
        });
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public void onStop() {
        super.onStop();

    }
}
