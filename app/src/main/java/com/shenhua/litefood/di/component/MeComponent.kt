package com.shenhua.litefood.di.component

import com.shenhua.litefood.mvp.contract.MeContract
import dagger.Module
import dagger.Provides
import dagger.Subcomponent

/**
 * Created by shenhua on 2017-12-07-0007.
 * @author shenhua
 *         Email shenhuanet@126.com
 */
@Subcomponent(modules = arrayOf(MeModule::class))
interface MeComponent {

}

@Module
class MeModule(private val mView: MeContract.View) {

    @Provides
    fun getView() = mView
}