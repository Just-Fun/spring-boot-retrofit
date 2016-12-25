package testRetrofit;

import testRetrofit.ApiHandler;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Serzh on 12/25/16.
 */
public class Main {

  /*  @Autowired
    private static ApiHandler apiHandler;*/

    public static void main(String[] args) {
        ApiHandler apiHandler = new ApiHandler();
        String check = apiHandler.check("Some Check");
        System.out.println(check);
    }
}
