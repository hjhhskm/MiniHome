package com.example.a97building.minihome;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by 97building on 2017/3/22.
 */

public class Fragment_Bubble_insert extends Fragment implements View.OnClickListener {

    private View view;
    private Button family,classmate,workmate,other;
    private Activity_Bubble_insert_info bubbleP;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_bubble_insert,container,false);

        family = (Button)view.findViewById(R.id.bubble_insert_family);
        family.setOnClickListener(this);

        classmate = (Button) view.findViewById(R.id.bubble_insert_classmate);
        classmate.setOnClickListener(this);

        workmate = (Button)view.findViewById(R.id.bubble_insert_workmate);
        workmate.setOnClickListener(this);

        other = (Button)view.findViewById(R.id.bubble_insert_other);
        other.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bubble_insert_family:
                Intent intent = new Intent(getActivity(),Activity_Bubble_insert_info.class);
                startActivity(intent);
                break;
            case R.id.bubble_insert_classmate:

                break;
            case R.id.bubble_insert_workmate:

                break;
            case R.id.bubble_insert_other:

                break;
            default:
        }
    }
}
