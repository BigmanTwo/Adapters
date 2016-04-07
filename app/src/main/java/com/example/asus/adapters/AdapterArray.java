package com.example.asus.adapters;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 2016/4/7.
 */
public class AdapterArray extends AppCompatActivity  {
    private List<String> mList;
    private ListView mListView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adapter_array);
        mList=new ArrayList<>();
        for(int i=0;i<50;i++){
            String str="第"+i+"条数据";
            mList.add(str);
        }
        mListView= (ListView) findViewById(R.id.list1);
        ArrayAdapter<String> adapater=new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,
                mList);
        mListView.setAdapter(adapater);
    }
}
