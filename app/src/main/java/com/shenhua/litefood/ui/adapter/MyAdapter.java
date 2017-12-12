package com.shenhua.litefood.ui.adapter;

import android.content.Context;

import com.shenhua.litefood.R;

import java.util.List;

/**
 * Created by shenhua on 2017-12-12-0012.
 *
 * @author shenhua
 *         Email shenhuanet@126.com
 */
public class MyAdapter extends BaseRecyclerAdapter<String> {

    public MyAdapter(Context context, List<String> datas) {
        super(context, datas);
    }

    @Override
    public int getItemViewId(int viewType) {
        return R.layout.item_vertical;
    }

    @Override
    public void bindData(BaseRecyclerViewHolder holder, int position, String item) {

    }
}
