package com.caijunrong.superrecycleview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.caijunrong.base.adapter.recyclerview.BaseRecyclerAdapter;
import com.caijunrong.base.adapter.recyclerview.DividerGridItemDecoration;
import com.caijunrong.superrecycleview.bean.LeftModelBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by biyabi on 16/5/17.
 */
public class MultiItemRecyclerViewWithHeaderActivity extends AppCompatActivity{


    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private MyAdapter mAdapter;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);


        mRecyclerView = (RecyclerView) findViewById(R.id.id_recyclerview);
        mLayoutManager = new GridLayoutManager(this, 2);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.addItemDecoration(new DividerGridItemDecoration(this, R.drawable.line_grey_small));
        mAdapter = new MyAdapter();
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.addDatas((ArrayList<LeftModelBean>) LeftModelBean.MODEL_LEFT);
        setHeader(mRecyclerView);
        mAdapter.setOnItemClickListener(new BaseRecyclerAdapter.OnItemClickListener<String>() {
            @Override
            public void onItemClick(int position, String data) {
                Toast.makeText(MultiItemRecyclerViewWithHeaderActivity.this, position + "," + data, Toast.LENGTH_SHORT).show();
            }
        });

 }


    private void setHeader(RecyclerView view) {
        View header = LayoutInflater.from(this).inflate(R.layout.header, view, false);
        TextView tv = (TextView) header.findViewById(R.id.id_header_title);
        tv.setText("title");
        mAdapter.setHeaderView(header);
    }

}
