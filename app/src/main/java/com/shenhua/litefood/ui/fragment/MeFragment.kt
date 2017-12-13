package com.shenhua.litefood.ui.fragment

import android.content.Context
import android.graphics.BitmapFactory
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.shenhua.litefood.R
import com.shenhua.litefood.ui.activity.MainActivity
import kotlinx.android.synthetic.main.fragment_me.*

/**
 * Created by shenhua on 2017-12-11-0011.
 *
 * @author shenhua
 * Email shenhuanet@126.com
 */
class MeFragment : Fragment() {

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        (context as MainActivity).changeTitle(getTitle())
    }

    private var rootView: View? = null
    private var isInit: Boolean = false

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_me, container, false)
        }
        return rootView
    }

    private fun setupViews() {
        Glide.with(this).load(R.drawable.img_banner).into(imgMeBanner)
        val bitmap = BitmapFactory.decodeResource(resources, R.mipmap.ic_launcher)
        val drawable = RoundedBitmapDrawableFactory.create(resources, bitmap);
        drawable.isCircular = true
        imgMeAvatar.setImageDrawable(drawable)
        bitmap.recycle()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (!isInit) {
            setupViews()
            isInit = true
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    private fun getTitle(): String {
        return "我的"
    }
}