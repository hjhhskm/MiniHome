package com.example.a97building.minihome;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by 97building on 2017/3/21.
 */

public class Activity_Person_Phone extends Activity implements View.OnClickListener{

    private View view;
    private TextView beforePhone;
    private Button getTest,submit;
    private EditText checkNum;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_person_phone);
        beforePhone = (TextView)findViewById(R.id.person_phone_before);

        getTest = (Button)findViewById(R.id.person_phone_gettest);
        getTest.setOnClickListener(this);

        checkNum = (EditText)findViewById(R.id.person_phone_checknum);
        submit = (Button)findViewById(R.id.person_phone_submit);
        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.person_phone_gettest:
                Toast.makeText(Activity_Person_Phone.this,"验证码已发送",Toast.LENGTH_SHORT);
                break;
            case R.id.person_phone_submit:
                String now = checkNum.getText().toString();
                beforePhone.setText(now);
//              insert saveInstanceState do
                Toast.makeText(Activity_Person_Phone.this,"修改成功",Toast.LENGTH_SHORT);
                break;
            default:
        }
    }
}
