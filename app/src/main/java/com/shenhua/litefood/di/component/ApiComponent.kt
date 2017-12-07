package com.shenhua.litefood.di.component

import com.shenhua.litefood.App
import com.shenhua.litefood.di.module.ApiModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by shenhua on 2017-12-06-0006.
 * @author shenhua
 *         Email shenhuanet@126.com
 */
@Singleton
@Component(modules = [(ApiModule::class)])
interface ApiComponent {

    fun inject(app: App)

    fun plus(module: FeaturedModule): FeaturedComponent
    fun plus(module: CategoryModule): CategoryComponent
    fun plus(module: TalentModule): TalentComponent
    fun plus(module: MeModule): MeComponent

}