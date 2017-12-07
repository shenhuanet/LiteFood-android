package com.shenhua.litefood.mvp.model

import com.shenhua.litefood.api.LiteFoodApi
import com.shenhua.litefood.mvp.contract.CategoryContract
import javax.inject.Inject

/**
 * 轻食分类
 * Created by shenhua on 2017-12-07-0007.
 * @author shenhua
 *         Email shenhuanet@126.com
 */
class CategoryModel @Inject constructor(private val api: LiteFoodApi) : CategoryContract.Model {
}