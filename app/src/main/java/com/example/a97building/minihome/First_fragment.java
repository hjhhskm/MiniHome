package com.example.a97building.minihome;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by 97building on 2017/3/9.
 */

public class First_fragment extends Fragment {
    private String context = "";
    private TextView mTextView;

    public First_fragment(){
        context = "";
        mTextView = null;
    }

    public void setContext(String context){
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment,container,false);
        mTextView = (TextView)view.findViewById(R.id.txt_content);
        mTextView.setText(context);
        return view;
    }
}
