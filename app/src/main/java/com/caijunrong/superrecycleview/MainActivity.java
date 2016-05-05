package com.caijunrong.superrecycleview;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.caijunrong.base.adapter.listview.CommonAdapter;
import com.caijunrong.base.adapter.listview.ViewHolder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> mDatas = new ArrayList<>(Arrays.asList("MultiItemListViewActivity","RecyclerViewActivity","MultiItemRecyclerViewActivity","RecyclerViewWithHeaderActivity"));
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = ((ListView) findViewById(R.id.id_listview_list));
        mListView.setAdapter(new CommonAdapter<String>(this, R.layout.item_list, mDatas)
        {
            @Override
            public void convert(ViewHolder holder, String o)
            {
                holder.setImageResource(R.id.id_item_list_iv,R.drawable.huaixiao);
                holder.setText(R.id.id_item_list_title, o);
            }
        });
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = null;

                intent = new Intent(MainActivity.this ,MultiItemListViewActivity.class);
                Toast.makeText(MainActivity.this, position+"position", Toast.LENGTH_SHORT).show();
                if (intent != null)
                    startActivity(intent);

            }
        });



    }


}