/**
 * Created by dimonik on 20.11.16.
 */
package testRetrofit;

import okhttp3.OkHttpClient;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;


@Component
public class ApiHandler {

    private Logger log = Logger.getLogger(ApiHandler.class);

    private static final String BASE_URL = "http://localhost:9000";

    private OkHttpClient httpClient;
    private Retrofit retrofit;

    private Retrofit initRetrofit(String url) {
        return new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
//                .client(httpClient)
                .build();
    }

    public String check(String input) {
//        httpClient = initHttpClient();
        retrofit = initRetrofit(BASE_URL);
        APIService apiService = retrofit.create(APIService.class);
        Call<String> call = apiService.postCheck(input);

        String result = "success";
        try {
            Response response = call.execute();
            if (response.body() == null) {
                result = response.errorBody().string();
            }
            String body = (String) response.body();
            log.info("getHelloCheck: " + body);
        } catch (IOException e) {
            result = "connectionFailure";
            log.info("Error getting...");
        }
        return result;
    }

    /*    private OkHttpClient initHttpClient() {
        return new OkHttpClient.Builder().addInterceptor(
                chain -> {
                    Request.Builder builder = chain.request()
                            .newBuilder()
                            .addHeader("Accept", "application/json");
                    Request request = builder.build();
                    return chain.proceed(request);
                }
        ).build();
    }*/
}