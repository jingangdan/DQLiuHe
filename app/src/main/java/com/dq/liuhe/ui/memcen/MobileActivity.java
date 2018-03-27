package com.dq.liuhe.ui.memcen;

import android.os.Bundle;

import com.dq.liuhe.R;
import com.dq.liuhe.base.BaseActivity;

/**
 * Description：绑定手机
 * Created by jingang on 2017/11/25.
 */

public class MobileActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile);
    }

    @Override
    protected void initWidght() {
        super.initWidght();
        setTitleName("绑定手机");
    }
}
