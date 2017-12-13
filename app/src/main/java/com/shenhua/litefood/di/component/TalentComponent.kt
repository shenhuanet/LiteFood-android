package com.shenhua.litefood.di.component

import com.shenhua.litefood.mvp.contract.TalentContract
import dagger.Module
import dagger.Provides
import dagger.Subcomponent

/**
 * Created by shenhua on 2017-12-07-0007.
 * @author shenhua
 *         Email shenhuanet@126.com
 */
@Subcomponent(modules = arrayOf(TalentModule::class))
interface TalentComponent {

}

@Module
class TalentModule(private val mView: TalentContract.View) {

    @Provides
    fun getView() = mView
}