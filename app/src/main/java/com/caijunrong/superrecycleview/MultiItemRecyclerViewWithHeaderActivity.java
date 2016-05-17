package com.caijunrong.superrecycleview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.caijunrong.superrecycleview.bean.LeftModelBean;
import com.caijunrong.superrecycleview.bean.MiddleModelBean;
import com.caijunrong.superrecycleview.bean.RightModelBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by biyabi on 16/5/17.
 */
public class MultiItemRecyclerViewWithHeaderActivity extends AppCompatActivity{

//    private List<MiddleModelBean> mData;
    private MiddleModelBean middleModelBean;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        getModel();

        Toast.makeText(MultiItemRecyclerViewWithHeaderActivity.this, "leftSize:"+middleModelBean.getLeftModelBeenList().size() + "rightSzie:"+middleModelBean.getRightModelBeenList().size(), Toast.LENGTH_SHORT).show();




    }

    //数据
    private void getModel(){

        middleModelBean = new MiddleModelBean(LeftModelBean.MODEL_LEFT, RightModelBean.MODEL_RIGHT);

    }

}
