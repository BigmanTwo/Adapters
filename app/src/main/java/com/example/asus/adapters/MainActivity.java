package com.example.asus.adapters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
private List<Map<String,Object>> mList;
    private ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mList=new ArrayList<>();
        for(int i=0;i<50;i++){
//            String str="第"+i+"条数据";
//            mList.add(str);
            Map<String,Object> map=new HashMap<>();
            map.put("icon",R.mipmap.ic_launcher);
            map.put("text","第"+i+"条数据");
            mList.add(map);
        }
        mListView= (ListView) findViewById(R.id.list1);
//        ArrayAdapter<String> adapater=new ArrayAdapter<String>(this,
//                android.R.layout.simple_expandable_list_item_1,
//                mList);
        SimpleAdapter adapater=new SimpleAdapter(this,mList,R.layout.list_item,
                new String[]{"icon","text"},
        new int[]{R.id.text_image,R.id.text_view});
        mListView.setAdapter(adapater);
    }
}
