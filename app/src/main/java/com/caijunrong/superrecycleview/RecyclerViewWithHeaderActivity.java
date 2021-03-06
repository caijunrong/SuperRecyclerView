package com.caijunrong.superrecycleview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.caijunrong.base.adapter.ViewHolder;
import com.caijunrong.base.adapter.recyclerview.DividerItemDecoration;
import com.caijunrong.base.adapter.recyclerview.OnItemClickListener;
import com.caijunrong.base.adapter.recyclerview.support.SectionAdapter;
import com.caijunrong.base.adapter.recyclerview.support.SectionSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by biyabi on 16/5/9.
 */
public class RecyclerViewWithHeaderActivity extends AppCompatActivity{

    private RecyclerView mRecyclerView;
    private List<String> mDatas = new ArrayList<>();

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        initDatas();

        mRecyclerView = (RecyclerView) findViewById(R.id.id_recyclerview);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mRecyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL_LIST));

        SectionSupport<String> sectionSupport = new SectionSupport<String>() {
            @Override
            public int sectionHeaderLayoutId() {
                return R.layout.header;
            }

            @Override
            public int sectionTitleTextViewId() {
                return R.id.id_header_title;
            }

            @Override
            public String getTitle(String s) {
                return s.substring(0, 1);
            }
        };


        SectionAdapter<String> adapter = new SectionAdapter<String>(this, R.layout.item_list, mDatas, sectionSupport)
        {

            @Override
            public void convert(ViewHolder holder, String s)
            {
                holder.setText(R.id.id_item_list_title, s);
            }
        };

        adapter.setOnItemClickListener(new OnItemClickListener<String>()
        {
            @Override
            public void onItemClick(ViewGroup parent, View view, String o, int section ,int position)
            {
                Toast.makeText(RecyclerViewWithHeaderActivity.this, "Click:" + position + " => " + o, Toast.LENGTH_SHORT).show();
            }

            @Override
            public boolean onItemLongClick(ViewGroup parent, View view, String o, int section ,int position)
            {
                return false;
            }
        });
        mRecyclerView.setAdapter(adapter);


    }

    private void initDatas()
    {
        for (int i = 1; i < 3; i++)
        {
            mDatas.add("A" + i);
        }

        for (int i = 1; i < 6; i++)
        {
            mDatas.add("B" + i);
        }

        for (int i = 1; i < 7; i++)
        {
            mDatas.add("C" + i);
        }

        for (int i = 1; i < 9; i++)
        {
            mDatas.add("D" + i);
        }
    }

}
