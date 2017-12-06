package com.shenhua.litefood

import android.app.Application
import com.tencent.bugly.Bugly

/**
 * Created by shenhua on 2017-12-06-0006.
 * @author shenhua
 *         Email shenhuanet@126.com
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Bugly.init(applicationContext, "eb8929563a", false);
    }
}