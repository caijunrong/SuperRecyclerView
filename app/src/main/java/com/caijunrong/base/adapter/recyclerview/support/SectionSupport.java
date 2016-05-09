package com.caijunrong.base.adapter.recyclerview.support;

/**
 * Created by biyabi on 16/5/9.
 */
public interface SectionSupport<T>{

    public int sectionHeaderLayoutId();

    public int sectionTitleTextViewId();

    public String getTitle(T t);

}
