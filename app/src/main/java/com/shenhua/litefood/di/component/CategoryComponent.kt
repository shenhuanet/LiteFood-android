package com.shenhua.litefood.di.component

import com.shenhua.litefood.mvp.contract.CategoryContract
import dagger.Module
import dagger.Provides
import dagger.Subcomponent

/**
 * Created by shenhua on 2017-12-07-0007.
 * @author shenhua
 *         Email shenhuanet@126.com
 */
@Subcomponent(modules = [(CategoryModule::class)])
interface CategoryComponent {

}

@Module
class CategoryModule(private val mView: CategoryContract.View) {
    @Provides
    fun getView() = mView
}