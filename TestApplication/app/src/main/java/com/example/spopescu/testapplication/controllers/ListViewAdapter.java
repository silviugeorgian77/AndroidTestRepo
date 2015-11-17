package com.example.spopescu.testapplication.controllers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.spopescu.testapplication.R;
import com.example.spopescu.testapplication.interfaces.FootballPlayer;

/**
 * Created by spopescu on 11/17/2015.
 */
public class ListViewAdapter extends BaseAdapter{
    private LayoutInflater inflater;
    public ListViewAdapter (LayoutInflater inflater) {
        this.inflater = inflater;
    }

    @Override
    public int getCount() {
        return MainController.instance.getFootballPlayersList().size();
    }

    @Override
    public Object getItem(int position) {
        return MainController.instance.getFootballPlayersList().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_view_item, null);
        }
        FootballPlayer player = MainController.instance.getFootballPlayersList().get(position);
        TextView tv_name = (TextView) convertView.findViewById(R.id.item_name);
        tv_name.setText(player.getName());
        TextView tv_overall = (TextView) convertView.findViewById(R.id.item_overall);
        tv_overall.setText(player.getOverall()+"");
        return convertView;
    }
}
