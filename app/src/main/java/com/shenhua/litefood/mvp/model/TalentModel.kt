package com.shenhua.litefood.mvp.model

import com.shenhua.litefood.api.LiteFoodApi
import com.shenhua.litefood.mvp.contract.TalentContract
import javax.inject.Inject

/**
 * 轻食达人
 * Created by shenhua on 2017-12-07-0007.
 * @author shenhua
 *         Email shenhuanet@126.com
 */
class TalentModel @Inject constructor(private val api: LiteFoodApi) : TalentContract.Model {
}