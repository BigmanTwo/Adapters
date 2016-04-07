package com.example.asus.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Asus on 2016/4/7.
 */
public class MyAdapter extends BaseAdapter {
    private Context mContent;
    private List<String> list;
   //Alt+Insert快捷键
    public MyAdapter(Context mContent, List<String> list) {
        this.mContent = mContent;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
//每条消息的布局
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(mContent).inflate(R.layout.list_item,null);
        TextView textView= (TextView) convertView.findViewById(R.id.text_view);
        textView.setText(list.get(position));
        return convertView;
    }
}
