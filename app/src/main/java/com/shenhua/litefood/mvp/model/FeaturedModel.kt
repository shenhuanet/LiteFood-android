package com.shenhua.litefood.mvp.model

import com.shenhua.litefood.api.LiteFoodApi
import com.shenhua.litefood.mvp.contract.FeaturedContract
import javax.inject.Inject

/**
 * 轻食精选
 * Created by shenhua on 2017-12-07-0007.
 * @author shenhua
 *         Email shenhuanet@126.com
 */
class FeaturedModel @Inject constructor(private val api: LiteFoodApi) : FeaturedContract.Model {
}