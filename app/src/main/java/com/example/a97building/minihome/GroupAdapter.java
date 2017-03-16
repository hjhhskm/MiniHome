package com.example.a97building.minihome;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 97building on 2017/3/10.
 */

public class GroupAdapter extends RecyclerView.Adapter<GroupAdapter.ViewHolder> {
    private List<Group> mGroupList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView groupName;
        ImageView groupProtrait;

        public ViewHolder(View view){
            super(view);
            groupName = (TextView) view.findViewById(R.id.group_item_name);
            groupProtrait = (ImageView) view.findViewById(R.id.group_item_protrait);
        }
    }

    public GroupAdapter(List<Group> groupList){
        mGroupList = groupList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_group,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Group group = mGroupList.get(position);
        holder.groupName.setText(group.getName());
        holder.groupProtrait.setImageResource(group.getProtrait());
    }

    @Override
    public int getItemCount() {
        return mGroupList.size();
    }
}
