package com.caijunrong.superrecycleview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.caijunrong.base.adapter.recyclerview.OnItemClickListener;
import com.caijunrong.superrecycleview.adapter.ChatAdapterForRv;
import com.caijunrong.superrecycleview.bean.ChatMessage;

/**
 * Created by biyabi on 16/5/6.
 */
public class MultiItemRecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_recyclerview);

        mRecyclerView = (RecyclerView) findViewById(R.id.id_recyclerview);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));


        ChatAdapterForRv adapter = new ChatAdapterForRv(this, ChatMessage.MOCK_DATAS);
        adapter.setOnItemClickListener(new OnItemClickListener<ChatMessage>()
        {
            @Override
            public void onItemClick(ViewGroup parent, View view, ChatMessage o, int section, int position)
            {
                Toast.makeText(MultiItemRecyclerViewActivity.this, "Click:" + position + " => " + o.getContent(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public boolean onItemLongClick(ViewGroup parent, View view, ChatMessage o, int section, int position)
            {
                Toast.makeText(MultiItemRecyclerViewActivity.this, "LongClick:" + position + " => " + o.getContent(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        mRecyclerView.setAdapter(adapter);

    }
}
