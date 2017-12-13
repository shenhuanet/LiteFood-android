package com.shenhua.litefood.ui.fragment

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.scwang.smartrefresh.layout.constant.SpinnerStyle
import com.scwang.smartrefresh.layout.footer.BallPulseFooter
import com.shenhua.litefood.R
import com.shenhua.litefood.base.BaseItemDecoration
import com.shenhua.litefood.ui.activity.MainActivity
import com.shenhua.litefood.ui.adapter.MyAdapter
import kotlinx.android.synthetic.main.fragment_talent.*

/**
 * Created by shenhua on 2017-12-11-0011.
 *
 * @author shenhua
 * Email shenhuanet@126.com
 */
class TalentFragment : Fragment() {

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        (context as MainActivity).changeTitle(getTitle())
    }

    private var rootView: View? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_talent, container, false)
        }
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
    }

    private fun setupViews() {
        refreshLayout.autoRefresh()
        footView.setAnimatingColor(ContextCompat.getColor(context!!, R.color.colorAccent))
        refreshLayout.refreshFooter = BallPulseFooter(context!!).setSpinnerStyle(SpinnerStyle.Scale)
        refreshLayout.setOnRefreshListener { layout ->
            layout.finishRefresh(2000)
        }
        refreshLayout.setOnLoadmoreListener { layout ->
            layout.finishLoadmore(2000)
            // 显示全部加载完成，并不再触发加载更事件
            // layout.setLoadmoreFinish(true);
        }

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.addItemDecoration(BaseItemDecoration())
        val list = ArrayList<String>()
        list.add("32132")
        list.add("32132")
        list.add("32132")
        list.add("32132")
        list.add("32132")
        list.add("32132")
        list.add("32132")
        list.add("32132")
        val adapter = MyAdapter(context, list)
        recyclerView.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    private fun getTitle(): String {
        return "轻食达人"
    }
}