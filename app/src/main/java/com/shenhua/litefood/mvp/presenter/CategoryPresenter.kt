package com.shenhua.litefood.mvp.presenter

import com.shenhua.litefood.di.component.CategoryModule
import com.shenhua.litefood.mvp.contract.CategoryContract
import javax.inject.Inject

/**
 * Created by shenhua on 2017-12-07-0007.
 * @author shenhua
 *         Email shenhuanet@126.com
 */
class CategoryPresenter @Inject constructor(private val mModule: CategoryModule, private val mView: CategoryContract.View)
    : CategoryContract.Presenter, BasePresenter() {

}