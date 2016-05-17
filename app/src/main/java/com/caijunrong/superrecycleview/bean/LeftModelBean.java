package com.caijunrong.superrecycleview.bean;

import com.caijunrong.base.adapter.bean.BaseBean;
import com.caijunrong.superrecycleview.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by biyabi on 16/5/17.
 */
public class LeftModelBean extends BaseBean {

    private int icon;
    private String name;
    private String content;

    public LeftModelBean(boolean model_seleted, int model_style, int icon, String name, String content) {
        super(model_seleted, model_style);
        this.icon = icon;
        this.name = name;
        this.content = content;
    }

    public LeftModelBean(int icon, String name, String content) {
        super(false, 0);
        this.icon = icon;
        this.name = name;
        this.content = content;
    }



    public static List<LeftModelBean> MODEL_LEFT = new ArrayList<>();

    static {
        LeftModelBean msg = null;
        msg = new LeftModelBean(false, 0, R.drawable.huaixiao, "左边", "A");
        MODEL_LEFT.add(msg);
        msg = new LeftModelBean(false, 0, R.drawable.huaixiao, "左边", "B");
        MODEL_LEFT.add(msg);
        msg = new LeftModelBean(false, 0, R.drawable.huaixiao, "左边", "C");
        MODEL_LEFT.add(msg);
        msg = new LeftModelBean(false, 0, R.drawable.huaixiao, "左边", "D");
        MODEL_LEFT.add(msg);
        msg = new LeftModelBean(false, 0, R.drawable.huaixiao, "左边", "E");
        MODEL_LEFT.add(msg);
        msg = new LeftModelBean(false, 0, R.drawable.huaixiao, "左边", "F");
        MODEL_LEFT.add(msg);
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
