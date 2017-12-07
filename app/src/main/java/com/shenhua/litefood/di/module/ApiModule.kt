package com.shenhua.litefood.di.module

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import com.shenhua.litefood.api.LiteFoodApi
import dagger.Module
import dagger.Provides
import io.reactivex.schedulers.Schedulers
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by shenhua on 2017-12-06-0006.
 * @author shenhua
 *         Email shenhuanet@126.com
 */
@Module(includes = [(AppModule::class)])
class ApiModule {

    @Provides
    @Singleton
    fun provideRetrofit(baseUrl: HttpUrl, client: OkHttpClient, gson: Gson)
            = Retrofit.Builder().client(client)
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
            .build()

    @Provides
    fun provideApi(retrofit: Retrofit) = retrofit.create(LiteFoodApi::class.java)

    @Provides
    fun provideBaseUrl() = HttpUrl.parse("http://www.baidu.com")

    @Provides
    fun provideGson() = GsonBuilder().create()

}