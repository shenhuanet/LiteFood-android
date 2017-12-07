package com.shenhua.litefood

import android.app.Application
import com.shenhua.litefood.di.component.ApiComponent
import com.shenhua.litefood.di.component.DaggerApiComponent
import com.shenhua.litefood.di.module.ApiModule
import com.shenhua.litefood.di.module.AppModule
import com.tencent.bugly.Bugly
import javax.inject.Inject

/**
 * Created by shenhua on 2017-12-06-0006.
 * @author shenhua
 *         Email shenhuanet@126.com
 */
class App : Application() {

    companion object {
        lateinit var instance: App
    }

    init {
        instance = this
    }

    @Inject lateinit var apiComponent: ApiComponent
    override fun onCreate() {
        super.onCreate()
        Bugly.init(applicationContext, "eb8929563a", false);
        // inject
        DaggerApiComponent.builder().apiModule(ApiModule())
                .appModule(AppModule(this))
                .build()
                .inject(this)
    }
}