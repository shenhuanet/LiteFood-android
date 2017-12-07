package com.shenhua.litefood.mvp.model

import com.shenhua.litefood.api.LiteFoodApi
import com.shenhua.litefood.mvp.contract.MeContract
import javax.inject.Inject

/**
 * 我的
 * Created by shenhua on 2017-12-07-0007.
 * @author shenhua
 *         Email shenhuanet@126.com
 */
class MeModel @Inject constructor(private val api: LiteFoodApi) : MeContract.Model {
}