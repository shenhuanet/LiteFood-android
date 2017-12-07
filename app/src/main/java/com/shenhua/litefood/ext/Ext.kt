package com.shenhua.litefood.ext

import android.content.Context
import android.widget.Toast
import com.shenhua.litefood.App

/**
 * Created by shenhua on 2017-12-07-0007.
 * @author shenhua
 *         Email shenhuanet@126.com
 */
fun Context.getMainContext() = App.instance.apiComponent

fun Context.toast(msg: String, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, msg, length).show()
}