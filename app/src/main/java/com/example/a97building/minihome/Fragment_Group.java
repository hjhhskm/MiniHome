package com.example.a97building.minihome;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 97building on 2017/3/10.
 */

public class Fragment_Group extends Fragment {

    private List<Group> groupList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_group,container,false);
        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.group_tiem_recyclerview);
        LinearLayoutManager manager = new LinearLayoutManager(inflater.getContext());
        recyclerView.setLayoutManager(manager);
        GroupAdapter adapter = new GroupAdapter(groupList);
        recyclerView.setAdapter(adapter);
        initGroup();
        return view;
    }

    private void initGroup(){
        for(int i = 0;i < 10;i++){
            Group litao = new Group("李涛",R.drawable.litao);
            groupList.add(litao);
            Group hushuang = new Group("胡双",R.drawable.hushuang);
            groupList.add(hushuang);
            Group hanjiahui = new Group("韩家辉",R.drawable.testhanhan);
            groupList.add(hanjiahui);
        }
    }
}
