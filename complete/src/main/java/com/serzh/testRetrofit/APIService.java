package com.serzh.testRetrofit;

import com.serzh.model.Greeting;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Serzh on 12/24/16.
 */

public interface APIService {
    @POST("/hello-world/new")
    Call<String> postCheck(@Body String body);

    @GET("getHello")
    Call<String> getHello();

    @GET("hello-world")
    Call<Greeting> sayHello();
}
