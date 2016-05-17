package com.caijunrong.superrecycleview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.caijunrong.base.adapter.ViewHolder;
import com.caijunrong.base.adapter.recyclerview.CommonAdapter;
import com.caijunrong.base.adapter.recyclerview.DividerGridItemDecoration;
import com.caijunrong.base.adapter.recyclerview.DividerItemDecoration;
import com.caijunrong.base.adapter.recyclerview.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by biyabi on 16/5/9.
 */
public class GridRecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private List<String> mDatas = new ArrayList<>();

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_recyclerview);

        initDatas();

        mRecyclerView = (RecyclerView)findViewById(R.id.id_recyclerview);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this,3));
//        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST, R.drawable.line_grey_small));

        mRecyclerView.addItemDecoration(new DividerGridItemDecoration(this, R.drawable.line_grey_small));
        CommonAdapter<String> adapter = new CommonAdapter<String>(this, R.layout.item_list,mDatas) {
            @Override
            public void convert(ViewHolder holder, String o) {
                holder.setText(R.id.id_item_list_title, o);
            }
        };

        mRecyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(ViewGroup parent, View view, Object o, int section, int position) {
                Toast.makeText(GridRecyclerViewActivity.this, "position:"+position+";name:"+o, Toast.LENGTH_SHORT).show();
            }

            @Override
            public boolean onItemLongClick(ViewGroup parent, View view, Object o, int section, int position) {
                return false;
            }
        });

    }


    /******* 初始化数据 ******/
    private void initDatas()
    {
        for (int i = 'A'; i < 'z'; i++)
        {
            mDatas.add((char) i + "");
        }
    }


}
