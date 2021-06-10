package com.example.recyclerapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * 时间：21.6.9.
 * 作者：安卓
 * 内容：RecyclerView中显示API中的值
 */
public class MainActivity extends AppCompatActivity {
    private RecyclerView mrc_recyclerview;
    private final List<Msg> mdata= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //绑定控件
        intit();

        //网络请求
        net.parseByGson();

        //设置RecyclerView样式
        initRecycler();

    }

    private void initRecycler() {
        //设置成线性布局
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mrc_recyclerview.setLayoutManager(linearLayoutManager);
        //设置适配器
        Log.e("TAG","mdata ="+mdata);
        Adapter_rc adapter = new Adapter_rc(mdata,this);

        mrc_recyclerview.setAdapter(adapter);
    }

    private void intit() {
        mrc_recyclerview = findViewById(R.id.rc_recyclerview);
    }
}