package com.caijunrong.base.adapter.listview;

/**
 * Created by biyabi on 16/5/5.
 */
public interface MultiItemTypeSupport<T> {

    int getLayoutId(int position, T t);

    int getViewTypeCount();

    int getItemViewType(int position, T t);

}
