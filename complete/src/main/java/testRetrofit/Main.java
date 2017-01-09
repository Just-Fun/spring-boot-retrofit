package testRetrofit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * Created by Serzh on 12/25/16.
 */
public class Main {

  /*  @Autowired
    private static ApiHandler apiHandler;*/

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);


        FutureTask<String> futureTask2 = new FutureTask<>(() -> justPrint());

        FutureTask<String> futureTask1 = new FutureTask<>(() -> retrofit());
        executorService.execute(futureTask1);
        executorService.execute(futureTask2);

        executorService.shutdown();
        /*boolean b = true;
        while (b) {
                if (futureTask1.isDone() && futureTask2.isDone()) {
                    System.out.println("Done");
                    //shut down executor service
                    b = false;
                    executorService.shutdown();
                }
        }*/

    }

    private static String retrofit() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ApiHandler apiHandler = new ApiHandler();
        String check = apiHandler.check("Some Check");
        System.out.println(check);
        return check + "!!!!!!!!!!";
    }

    private static String justPrint() {
        System.out.println("Print...");
        return "Print!!!!!!!!!";
    }
}
