package com.caijunrong.superrecycleview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.caijunrong.base.adapter.recyclerview.CommonAdapter;
import com.caijunrong.base.adapter.ViewHolder;
import com.caijunrong.base.adapter.recyclerview.DividerItemDecoration;
import com.caijunrong.base.adapter.recyclerview.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by caijunrong on 16/5/6.
 */
public class RecyclerViewActivity extends AppCompatActivity{

    private RecyclerView mRecyclerView;
    private List<String> mDatas = new ArrayList<>();


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        initDatas();

        mRecyclerView = (RecyclerView)findViewById(R.id.id_recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST, R.drawable.line_grey_small));

        CommonAdapter<String> adapter = new CommonAdapter<String>(this, R.layout.item_list,mDatas) {
            @Override
            public void convert(ViewHolder holder, String o) {
                holder.setText(R.id.id_item_list_title, o);
            }
        };

        mRecyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(ViewGroup parent, View view, Object o, int section ,int position) {
                Toast.makeText(RecyclerViewActivity.this, "position:"+position+";name:"+o, Toast.LENGTH_SHORT).show();
            }

            @Override
            public boolean onItemLongClick(ViewGroup parent, View view, Object o, int section, int position) {
                return false;
            }
        });

    }

    private void initDatas()
    {
        for (int i = 'A'; i < 'z'; i++)
        {
            mDatas.add((char) i + "");
        }
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_recycler_view,menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item)
//    {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings)
//        {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }


}
