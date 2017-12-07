package com.shenhua.litefood.mvp.presenter

import com.shenhua.litefood.di.component.FeaturedModule
import com.shenhua.litefood.mvp.contract.FeaturedContract
import javax.inject.Inject

/**
 * Created by shenhua on 2017-12-07-0007.
 * @author shenhua
 *         Email shenhuanet@126.com
 */
class FeaturedPresenter @Inject constructor(private val mModule: FeaturedModule, private val mView: FeaturedContract.View)
    : FeaturedContract.Presenter, BasePresenter() {

}