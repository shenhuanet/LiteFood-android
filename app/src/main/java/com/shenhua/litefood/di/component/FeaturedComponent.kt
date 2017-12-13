package com.shenhua.litefood.di.component

import com.shenhua.litefood.mvp.contract.FeaturedContract
import dagger.Module
import dagger.Provides
import dagger.Subcomponent

/**
 * Created by shenhua on 2017-12-07-0007.
 * @author shenhua
 *         Email shenhuanet@126.com
 */
@Subcomponent(modules = arrayOf(FeaturedModule::class))
interface FeaturedComponent {

}

@Module
class FeaturedModule(private val mView: FeaturedContract.View) {

    @Provides
    fun getView() = mView
}