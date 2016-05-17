package com.caijunrong.base.adapter.bean;

/**
 * Created by biyabi on 16/5/17.
 */
public class BaseBean {

    public boolean model_seleted; //选中状态
    public int model_style;       //model的类型 一般可以忽略


    public BaseBean(boolean model_seleted, int model_style) {
        this.model_seleted = model_seleted;
        this.model_style = model_style;
    }

    public boolean isModel_seleted() {
        return model_seleted;
    }

    public void setModel_seleted(boolean model_seleted) {
        this.model_seleted = model_seleted;
    }

    public int getModel_style() {
        return model_style;
    }

    public void setModel_style(int model_style) {
        this.model_style = model_style;
    }
}
