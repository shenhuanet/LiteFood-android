package com.shenhua.litefood.ui.fragment

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shenhua.litefood.R
import com.shenhua.litefood.ui.activity.MainActivity
import kotlinx.android.synthetic.main.fragment_freatured.*

/**
 * Created by shenhua on 2017-12-11-0011.
 *
 * @author shenhua
 * Email shenhuanet@126.com
 */
class CategoryFragment : Fragment() {

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        (context as MainActivity).changeTitle(getTitle())
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_freatured, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        text.text = getTitle()
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    private fun getTitle(): String {
        return "轻食分类"
    }
}