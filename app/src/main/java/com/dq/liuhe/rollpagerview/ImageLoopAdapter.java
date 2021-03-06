package com.dq.liuhe.rollpagerview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.dq.liuhe.R;
import com.dq.liuhe.bean.index.Index2;
import com.dq.liuhe.utils.ImageUtils;

import java.util.List;

/**
 * Created by jingang on 2018/2/2.
 */

public class ImageLoopAdapter extends LoopPagerAdapter {
    private Context mContext;
    private List<Index2.DataBean.ChildBean> bannerBeans;

    public ImageLoopAdapter(RollPagerView viewPager , Context mContext, List<Index2.DataBean.ChildBean> bannerBeans) {
        super(viewPager);
        this.mContext = mContext;
        this.bannerBeans = bannerBeans;
    }

    @Override
    public View getView(ViewGroup container, int position) {
        ImageView view = new ImageView(container.getContext());
        view.setScaleType(ImageView.ScaleType.CENTER_CROP);
        view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        ImageUtils.loadIntoUseFitWidth2(mContext,
                bannerBeans.get(position).getThumb(),
                R.mipmap.icon_empty002,
                view);

        return view;
    }

    @Override
    public int getRealCount() {
        return bannerBeans.size();
    }
}
