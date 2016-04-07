package com.example.asus.adapters;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.widget.SimpleAdapter;
/**
 * Created by Asus on 2016/4/7.
 */
public class SimpleActivity extends AppCompatActivity {
    private List<Map<String,Object>> mList;
    private ListView mListView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_adapter);
        mList=new ArrayList<>();
        for(int i=0;i<50;i++){
            Map<String,Object> map=new HashMap<>();
            map.put("icon",R.mipmap.ic_launcher);
            map.put("text","第"+i+"条数据");
            mList.add(map);
        }
        mListView= (ListView) findViewById(R.id.list1);
       SimpleAdapter adapater=new SimpleAdapter(this,mList,
                R.layout.list_item,
                new String[]{"icon","text"},
                new int[]{R.id.text_image,R.id.text_view});
        //窗口  数组   输出格式   key和value   数据显示位置
        mListView.setAdapter(adapater);
    }
}
