package com.caijunrong.superrecycleview;


import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.caijunrong.base.adapter.recyclerview.BaseRecyclerAdapter;
import com.caijunrong.superrecycleview.bean.LeftModelBean;

/**
 * Created by caijunrong on 2015/11/7.
 */
public class MyAdapter extends BaseRecyclerAdapter<LeftModelBean> {

    @Override
    public RecyclerView.ViewHolder onCreate(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_chat_from_msg, parent, false);
        return new MyHolder(layout);
    }

    @Override
    public void onBind(RecyclerView.ViewHolder viewHolder, int RealPosition, LeftModelBean data) {
        if(viewHolder instanceof MyHolder) {
            ((MyHolder) viewHolder).text.setText(data.getName());
            ((MyHolder) viewHolder).iv.setImageResource(data.getIcon());
            ((MyHolder) viewHolder).content.setText(data.getContent());
        }
    }

    class MyHolder extends BaseRecyclerAdapter.Holder {
        TextView text;
        ImageView iv;
        TextView content;
        public MyHolder(View itemView) {
            super(itemView);
            text = (TextView) itemView.findViewById(R.id.chat_from_name);
            iv = (ImageView) itemView.findViewById(R.id.chat_from_icon);
            content = (TextView) itemView.findViewById(R.id.chat_from_content);
        }
    }
}
