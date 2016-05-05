package com.caijunrong.base.adapter.listview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import java.util.IllegalFormatCodePointException;
import java.util.List;

/**
 * Created by biyabi on 16/5/5.
 */
public abstract class MultiItemCommonAdapter<T> extends CommonAdapter<T> {

    protected MultiItemTypeSupport<T> mMultiItemTypeSupport;

    @Override
    public int getViewTypeCount() {
        if (mMultiItemTypeSupport != null)
            return mMultiItemTypeSupport.getViewTypeCount();
        return super.getViewTypeCount();
    }

    @Override
    public int getItemViewType(int position) {
        if (mMultiItemTypeSupport != null) {
            return mMultiItemTypeSupport.getItemViewType(position,
                    mDatas.get(position));
        }
        return super.getItemViewType(position);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (mMultiItemTypeSupport == null) {
            return super.getView(position, convertView, parent);
        }else {
            int layoutId = mMultiItemTypeSupport.getLayoutId(position,
                    getItem(position));
            ViewHolder viewHolder = ViewHolder.get(mContext, convertView, parent,
                    layoutId, position);
            convert(viewHolder, getItem(position));
            return viewHolder.getConvertView();
        }
    }

    public MultiItemCommonAdapter(Context context, List<T> datas,
                                  MultiItemTypeSupport<T> mMultiItemTypeSupport) {
        super(context, -1, datas);
        this.mMultiItemTypeSupport = mMultiItemTypeSupport;

        if (mMultiItemTypeSupport == null) {
            try {
                throw new IllegalAccessException("the mMultiItemTypeSupport can not be null.");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

    }



}
