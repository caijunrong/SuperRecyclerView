package com.caijunrong.base.adapter.recyclerview;

/**
 * Created by biyabi on 16/5/6.
 */
public interface MultiItemTypeSupport<T> {

    int getLayoutId(int itemType);

    int getItemViewType(int position, T t);
}
