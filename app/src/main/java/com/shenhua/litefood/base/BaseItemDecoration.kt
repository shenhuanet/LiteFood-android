package com.shenhua.litefood.base

import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View
import com.scwang.smartrefresh.layout.util.DensityUtil

/**
 * Created by shenhua on 2017-12-12-0012.
 * @author shenhua
 *         Email shenhuanet@126.com
 */
class BaseItemDecoration : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect?, view: View?, parent: RecyclerView?, state: RecyclerView.State?) {
        outRect!!.set(0, 0, 0, DensityUtil.dp2px(5f).toInt());
    }
}