package com.shenhua.litefood.api

import com.shenhua.litefood.bean.User
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by shenhua on 2017-12-06-0006.
 * @author shenhua
 *         Email shenhuanet@126.com
 */
interface LiteFoodApi {

    @GET("api/login")
    fun login(@Query("username") username: String, @Query("password") password: String): Observable<User>

}