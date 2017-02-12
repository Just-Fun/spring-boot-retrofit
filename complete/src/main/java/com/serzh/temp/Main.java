package com.serzh.temp;


import com.serzh.testRetrofit.ApiHandler;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by Serzh on 12/25/16.
 */
public class Main {

  /*  @Autowired
    private static ApiHandler apiHandler;*/

    public static void main(String[] args) {

        System.out.println("sfjdg");
        if ("cc".equals("df")) {

        }
        boolean df = "cc".equals("df");
        AtomicReference<String> jhg = new AtomicReference<>("jhg");
        String jhg1 = "jhg";
        String jhg2 = "jhg";

        int[] j = new int[]{1, 9, 8};
        for (int i : j) {

        }
        /*ExecutorService executorService = Executors.newFixedThreadPool(2);


        FutureTask<String> futureTask2 = new FutureTask<>(() -> justPrint());

        FutureTask<String> futureTask1 = new FutureTask<>(() -> retrofit());
        executorService.execute(futureTask1);
        executorService.execute(futureTask2);

        executorService.shutdown();

        while (!executorService.isTerminated()) {
            // wait until executing completed
        }
        System.out.println("Done!!!!!!");*/
        /*boolean b = true;
        while (b) {
                if (futureTask1.isDone() && futureTask2.isDone()) {
                    System.out.println("Done");
                    //shut down executor service
                    b = false;
                    executorService.shutdown();
                }
        }*/

//        new Thread(() -> retrofit()).start();
//        new Thread(() -> justPrint()).start();

        justPrint();
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
        new Thread(() -> retrofit()).start();
        System.out.println("Print...");
        return "Print!!!!!!!!!";
    }
}
