package com.dq.liuhe.adapter.bbs;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.dq.liuhe.R;
import com.dq.liuhe.base.MyCommentViewHolder;
import com.dq.liuhe.base.MyCommonAdapter;
import com.dq.liuhe.bean.bbs.FdComment;
import com.dq.liuhe.utils.DateUtils;
import com.dq.liuhe.utils.GlideUtils;
import com.dq.liuhe.utils.HttpPath;
import com.github.siyamed.shapeimageview.mask.PorterShapeImageView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 评论适配器
 * Created by jingang on 2018/3/21.
 */

public class FdCommentAdapter extends MyCommonAdapter<FdComment.DataBean.ListBean> {

    @Bind(R.id.psiv_item_comment_header)
    ImageView ivHeader;
    @Bind(R.id.tv_item_comment_rname)
    TextView rname;
    @Bind(R.id.tv_item_comment_addtime)
    TextView addtime;
    @Bind(R.id.tv_item_comment_comment)
    TextView comment;

    public FdCommentAdapter(List<FdComment.DataBean.ListBean> list, Context mContext) {
        super(list, mContext, R.layout.item_fd_comment);
    }

    @Override
    public void setDate(MyCommentViewHolder commentViewHolder, int position) {
        ButterKnife.bind(this, commentViewHolder.getConverView());
        if (!TextUtils.isEmpty(list.get(position).getHeadimgurl())) {
            GlideUtils.loadImageViewHead(mContext, HttpPath.NEW_HEADER + list.get(position).getHeadimgurl(), ivHeader);
        }
        if (!TextUtils.isEmpty(list.get(position).getRname())) {
            rname.setText(list.get(position).getRname());
        }
        if (!TextUtils.isEmpty(list.get(position).getAddtime())) {
            addtime.setText(DateUtils.time(list.get(position).getAddtime()));
        }
        if (!TextUtils.isEmpty(list.get(position).getComment())) {
            comment.setText(list.get(position).getComment());
        }
    }
}
