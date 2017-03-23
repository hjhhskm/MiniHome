package com.example.a97building.minihome;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by 97building on 2017/3/22.
 */

public class Activity_Bubble_insert_info extends Activity implements View.OnClickListener {

    private View view;
    private EditText name,phoneNum;
    private Button addFrom,submit;

    private FragmentManager manager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_bubble_insert_detail);
        name = (EditText)findViewById(R.id.bubble_insert_myinfo);
        name.setOnClickListener(this);

        phoneNum = (EditText)findViewById(R.id.bubble_insert_phoneNum1);
        phoneNum.setOnClickListener(this);

        addFrom = (Button)findViewById(R.id.bubble_insert_phoneNum2);
        addFrom.setOnClickListener(this);

        submit = (Button)findViewById(R.id.bubble_insert_submit);
        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (view.getId()){

            case R.id.bubble_insert_myinfo:

                break;
            case R.id.bubble_insert_phoneNum1:

                break;
            case R.id.bubble_insert_phoneNum2:

                break;
            case R.id.bubble_insert_submit:
                Toast.makeText(Activity_Bubble_insert_info.this,"提交成功", Toast.LENGTH_SHORT).show();;
                break;
            default:

        }
    }

}
