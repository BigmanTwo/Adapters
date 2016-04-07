package com.example.asus.adapters;

import android.content.Context;
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
public class BaseActivity extends AppCompatActivity {
    private Context mContent;
    private List<String> mList;
    private ListView mListView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_adapter);
        mList=new ArrayList<>();
        for(int i=0;i<50;i++){
            String str="第"+i+"条数据";
            mList.add(str);
        }
        mListView= (ListView) findViewById(R.id.list_item);
       MyAdapter adapater=new MyAdapter(this,mList);
        mListView.setAdapter(adapater);

    }
}
