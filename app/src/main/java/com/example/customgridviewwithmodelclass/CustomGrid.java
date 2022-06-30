package com.example.customgridviewwithmodelclass;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomGrid extends BaseAdapter {

    ArrayList<CustomClass> myRecord = new ArrayList<>();

    public CustomGrid(ArrayList<CustomClass> myRecord) {

        this.myRecord = myRecord;
    }

    @Override
    public int getCount() {
        return myRecord.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_grid_item, null);

        ImageView img1 = convertView.findViewById(R.id.img);
        img1.setImageResource(myRecord.get(position).getImageRe());

        TextView txtNameText = convertView.findViewById(R.id.txtNameText);
        txtNameText.setText(myRecord.get(position).getNameRecodList());

        return convertView;

    }
}
