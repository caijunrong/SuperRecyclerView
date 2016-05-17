package com.caijunrong.superrecycleview.bean;

import com.caijunrong.base.adapter.bean.BaseBean;
import com.caijunrong.superrecycleview.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by biyabi on 16/5/17.
 */
public class RightModelBean extends BaseBean {


    private int icon;
    private String name;

    public RightModelBean(boolean model_seleted, int model_style, int icon, String name) {
        super(model_seleted, model_style);
        this.icon = icon;
        this.name = name;
    }

    public RightModelBean(int icon, String name) {
        super(false, 0);
        this.icon = icon;
        this.name = name;
    }


    public static List<RightModelBean> MODEL_RIGHT = new ArrayList<>();

    static {
        RightModelBean msg = null;
        msg = new RightModelBean(false, 1, R.drawable.haoren, "右边");
        MODEL_RIGHT.add(msg);
        msg = new RightModelBean(false, 1, R.drawable.haoren, "右边");
        MODEL_RIGHT.add(msg);
        msg = new RightModelBean(false, 1, R.drawable.haoren, "右边");
        MODEL_RIGHT.add(msg);
        msg = new RightModelBean(false, 1, R.drawable.haoren, "右边");
        MODEL_RIGHT.add(msg);
        msg = new RightModelBean(false, 1, R.drawable.haoren, "右边");
        MODEL_RIGHT.add(msg);
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
