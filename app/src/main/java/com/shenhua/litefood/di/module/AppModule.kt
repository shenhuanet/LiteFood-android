package com.shenhua.litefood.di.module

import android.content.Context
import dagger.Module
import dagger.Provides

/**
 * Created by shenhua on 2017-12-07-0007.
 * @author shenhua
 *         Email shenhuanet@126.com
 */
@Module
class AppModule(private val context: Context) {

    @Provides
    fun provideContext() = context
}