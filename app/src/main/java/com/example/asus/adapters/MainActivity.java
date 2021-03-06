package com.example.asus.adapters;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button mButton1,mButton2,mButton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton1= (Button) findViewById(R.id.but1);
        mButton1.setOnClickListener(this);
        mButton2= (Button) findViewById(R.id.but2);
        mButton2.setOnClickListener(this);
        mButton3= (Button) findViewById(R.id.but3);
        mButton3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent();
        switch (v.getId()){
            case R.id.but1:
            intent.setComponent(new ComponentName(MainActivity.this,AdapterArray.class));
                startActivity(intent);
                break;
            case R.id.but2:
                intent.setComponent(new ComponentName(MainActivity.this,SimpleActivity.class));
                startActivity(intent);
                break;
            case R.id.but3:
                intent.setComponent(new ComponentName(MainActivity.this,BaseActivity.class));
                startActivity(intent);
                break;
        }
    }
}
