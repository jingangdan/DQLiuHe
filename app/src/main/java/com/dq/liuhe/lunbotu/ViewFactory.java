package com.dq.liuhe.lunbotu;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;

import com.dq.liuhe.R;
import com.dq.liuhe.utils.ImageUtils;

/**
 * ImageView创建工厂
 */
public class ViewFactory {

    /**
     * 获取ImageView视图的同时加载显示url
     *
     * @return
     */
    public static ImageView getImageView(Context context, String url) {
        ImageView imageView = (ImageView) LayoutInflater.from(context).inflate(
                R.layout.view_banner, null);
       // ImageLoader.getInstance().displayImage(url, imageView);

        ImageUtils.loadIntoUseFitWidth(context,
                url,
                R.mipmap.icon_empty,
                R.mipmap.icon_error,
                imageView);


        return imageView;
    }
}
