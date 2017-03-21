package com.example.a97building.minihome;

import android.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Login_Main extends AppCompatActivity implements View.OnClickListener{
    private TextView tabgroup;
    private TextView tabbubble;
    private TextView tabhorse;
    private TextView tabperson;

    private FrameLayout ly_content;

    private Fragment_Group group;
    private Fragment_Person person;
    private First_fragment f3,f4;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin);

        bindView();
    }

    private void bindView(){
        tabgroup = (TextView)findViewById(R.id.begin_group);
        tabbubble = (TextView)findViewById(R.id.begin_bubble);
        tabhorse = (TextView)findViewById(R.id.begin_horse);
        tabperson = (TextView)findViewById(R.id.begin_person);
        ly_content = (FrameLayout)findViewById(R.id.fragment_container);

        tabgroup.setOnClickListener(this);
        tabbubble.setOnClickListener(this);
        tabhorse.setOnClickListener(this);
        tabperson.setOnClickListener(this);
    }

    public void selected(){
        tabgroup.setSelected(false);
        tabbubble.setSelected(false);
        tabhorse.setSelected(false);
        tabperson.setSelected(false);
    }

    public void hideAllFragment(FragmentTransaction fragmentTransaction){
        if(group!= null){
            fragmentTransaction.hide(group);
        }
        if(person!= null){
            fragmentTransaction.hide(person);
        }
        if(f3!= null) {
            fragmentTransaction.hide(f3);
        }
        if(f4!= null){
            fragmentTransaction.hide(f4);
        }
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        hideAllFragment(fragmentTransaction);
        selected();
        switch (v.getId()){
            case R.id.begin_group:
                tabgroup.setSelected(true);
                if(group==null){
                    group = new Fragment_Group();
                    fragmentTransaction.add(R.id.fragment_container,group);
                }else{
                    fragmentTransaction.show(group);
                }
                break;

            case R.id.begin_bubble:
                tabbubble.setSelected(true);
                if(f4==null){
                    f4 = new First_fragment();
                    f4.setContext("聊天碎片");
                    fragmentTransaction.add(R.id.fragment_container,f4);
                }else{
                    fragmentTransaction.show(f4);
                }
                break;


            case R.id.begin_horse:
                tabhorse.setSelected(true);
                if(f3==null){
                    f3 = new First_fragment();
                    f3.setContext("动态碎片");
                    fragmentTransaction.add(R.id.fragment_container,f3);
                }else{
                    fragmentTransaction.show(f3);
                }
                break;

            case R.id.begin_person:
                tabperson.setSelected(true);
                if(person==null){
                    person = new Fragment_Person();
                    fragmentTransaction.add(R.id.fragment_container,person);
                }else{
                    fragmentTransaction.show(person);
                }
                break;


            default:
        }
        fragmentTransaction.commit();
    }
}
