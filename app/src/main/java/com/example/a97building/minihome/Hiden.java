package com.example.a97building.minihome;

import android.app.FragmentManager;
import android.app.FragmentTransaction;

/**
 * Created by 97building on 2017/3/23.
 */

public class Hiden {
    public static void hideFragement(FragmentTransaction transaction, FragmentManager manager){
        String[] list ={"bubble","person","group","bubbleP","bubbleFamAdd","personPhone"};
        for(String s : list){
            if(manager.findFragmentByTag(s)!=null){
                transaction.hide(manager.findFragmentByTag(s));
            }
        }
    }
}
