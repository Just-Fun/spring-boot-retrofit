package testRetrofit;

import hello.Greeting;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
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
