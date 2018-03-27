package com.dq.liuhe.ui.memcen;

import android.os.Bundle;

import com.dq.liuhe.R;
import com.dq.liuhe.base.BaseActivity;

/**
 * 关于我们
 * Created by jingang on 2018/1/24.
 */

public class AboutUsActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
    }

    @Override
    protected void initWidght() {
        super.initWidght();
        setTitleName("关于我们");
    }
}
