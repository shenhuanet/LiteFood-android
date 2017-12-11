package com.shenhua.litefood.ui.activity

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.shenhua.litefood.R
import com.shenhua.litefood.ext.LightMode
import com.shenhua.litefood.ui.fragment.CategoryFragment
import com.shenhua.litefood.ui.fragment.FeaturedFragment
import com.shenhua.litefood.ui.fragment.MeFragment
import com.shenhua.litefood.ui.fragment.TalentFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LightMode.statusBarLightMode(this, LightMode.getMode(this))
        setContentView(R.layout.activity_main)
        setupViews()
    }

    private fun setupViews() {
        setSupportActionBar(toolbar)
        supportActionBar!!.title = ""
        bottomMenu.setOnNavigationItemSelectedListener { item ->
            nav(item.itemId)
            true
        }
    }

    private fun nav(itemId: Int) {
        var frag: Fragment? = null
        when (itemId) {
            R.id.menu_featured -> frag = FeaturedFragment()
            R.id.menu_talent -> frag = TalentFragment()
            R.id.menu_category -> frag = CategoryFragment()
            R.id.menu_me -> frag = MeFragment()
        }
        supportFragmentManager.beginTransaction()
                .replace(R.id.container, frag)
                .commit()
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        supportFragmentManager.beginTransaction()
                .add(R.id.container, FeaturedFragment())
                .commit()
    }

    fun changeTitle(title: String) {
        toolbarTitle.text = title
        if (title == "我的") {
            toolbarAdd.visibility = View.GONE
        } else {
            toolbarAdd.visibility = View.VISIBLE
        }
    }
}
