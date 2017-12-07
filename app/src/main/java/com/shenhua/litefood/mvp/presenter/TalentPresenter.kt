package com.shenhua.litefood.mvp.presenter

import com.shenhua.litefood.di.component.TalentModule
import com.shenhua.litefood.mvp.contract.TalentContract
import javax.inject.Inject

/**
 * Created by shenhua on 2017-12-07-0007.
 * @author shenhua
 *         Email shenhuanet@126.com
 */
class TalentPresenter @Inject constructor(private val mModule: TalentModule, private val mView: TalentContract.View)
    : TalentContract.Presenter, BasePresenter() {
}