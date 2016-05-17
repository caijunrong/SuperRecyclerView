package com.caijunrong.superrecycleview.bean;

import com.caijunrong.base.adapter.bean.BaseBean;
import com.caijunrong.superrecycleview.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by biyabi on 16/5/17.
 */
public class MiddleModelBean extends BaseBean{

    private List<LeftModelBean> leftModelBeenList;
    private List<RightModelBean> rightModelBeenList;

    public MiddleModelBean(boolean model_seleted, int model_style, List<LeftModelBean> leftModelBeenList, List<RightModelBean> rightModelBeenList) {
        super(model_seleted, model_style);
        this.leftModelBeenList = leftModelBeenList;
        this.rightModelBeenList = rightModelBeenList;
    }

    public MiddleModelBean(List<LeftModelBean> leftModelBeenList, List<RightModelBean> rightModelBeenList) {
        super(false, 0);
        this.leftModelBeenList = leftModelBeenList;
        this.rightModelBeenList = rightModelBeenList;
    }

    public List<LeftModelBean> getLeftModelBeenList() {
        return leftModelBeenList;
    }

    public void setLeftModelBeenList(List<LeftModelBean> leftModelBeenList) {
        this.leftModelBeenList = leftModelBeenList;
    }

    public List<RightModelBean> getRightModelBeenList() {
        return rightModelBeenList;
    }

    public void setRightModelBeenList(List<RightModelBean> rightModelBeenList) {
        this.rightModelBeenList = rightModelBeenList;
    }

    //    private LeftModelBean lefModel;
//    private RightModelBean rightModel;
//
//    public MiddleModelBean(boolean model_seleted, int model_style, LeftModelBean lefModel, RightModelBean rightModel) {
//        super(model_seleted, model_style);
//        this.lefModel = lefModel;
//        this.rightModel = rightModel;
//    }
//
//    public LeftModelBean getLefModel() {
//        return lefModel;
//    }
//
//    public void setLefModel(LeftModelBean lefModel) {
//        this.lefModel = lefModel;
//    }
//
//    public RightModelBean getRightModel() {
//        return rightModel;
//    }
//
//    public void setRightModel(RightModelBean rightModel) {
//        this.rightModel = rightModel;
//    }

}
