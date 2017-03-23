package com.example.a97building.minihome;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 97building on 2017/3/18.
 */

public class Main_login extends Activity{

    private Fragment_Group group;
    private Fragment_Person person;
    private View groupLayout;
    private View bubbleLayout;
    private View horseLayout;
    private View personLayout;
    private ImageView groupImage;
    private ImageView bubbleImage;
    private ImageView horseImage;
    private ImageView personImage;
    private TextView groupText;
    private TextView bubbleText;
    private TextView horseText;
    private TextView personText;

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();
        fragmentManager = getFragmentManager();
        setTabSelection(0);
    }

    private void initViews(){
        groupLayout = findViewById(R.id.frag_group);
        personLayout = findViewById(R.id.frag_person);
        groupImage = (ImageView)findViewById(R.id.menu_group_image);
        bubbleImage = (ImageView)findViewById(R.id.menu_bubble_image);
        horseImage = (ImageView)findViewById(R.id.menu_horse_image);
        personImage = (ImageView)findViewById(R.id.menu_person_image);
//        groupText = (TextView)findViewById(R.id.menu_group_text);
//        bubbleText = (TextView)findViewById(R.id.menu_bubble_text);
//        horseText = (TextView)findViewById(R.id.menu_horse_text);
//        personText = (TextView)findViewById(R.id.menu_person_text);
        groupLayout.setOnClickListener(new MyListener());
        personLayout.setOnClickListener(new MyListener());

    }

    private class MyListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.frag_group:
                    setTabSelection(0);
                    break;
                case R.id.frag_person:
                    setTabSelection(3);
                    break;
                default:
            }
        }
    }

    private void setTabSelection(int index){
        clearSelection();

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        hideFragement(transaction);
        switch (index) {
            case 0:
                groupImage.setImageResource(R.mipmap.group);
//                groupText.setTextColor(getResources().R.color.colorAccent);
                if (group == null) {
                    group = new Fragment_Group();
                    transaction.replace(R.id.login_content, group);
                    transaction.commit();
                } else {
                    transaction.show(group);
                }
                break;
            case 3:
                personImage.setImageResource(R.mipmap.person);
//                personText.setTextColor(getResources().getColor(R.color.colorAccent));
                if (person == null) {
                    person = new Fragment_Person();
                    transaction.replace(R.id.login_content, person);
                    transaction.commit();
                } else {
                    transaction.show(person);
                }
                break;
        }
    }

    private void clearSelection(){
        groupImage.setImageResource(R.mipmap.group_off);
//        groupText.setTextColor(getResources().getColor(R.color.menuText));
        bubbleImage.setImageResource(R.mipmap.bubble_off);
//        bubbleText.setTextColor(getResources().getColor(R.color.menuText));
        horseImage.setImageResource(R.mipmap.horse_off);
//        horseText.setTextColor(getResources().getColor(R.color.menuText));
        personImage.setImageResource(R.mipmap.person_off);
//        personText.setTextColor(getResources().getColor(R.color.menuText));

    }

    private void hideFragement(FragmentTransaction transaction){
        if(group != null){
            transaction.hide(group);
        }
        if(person != null){
            transaction.hide(person);
        }
    }


}
