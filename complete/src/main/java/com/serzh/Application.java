package com.serzh;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");
/*
            String text = "plain text request body";
            RequestBody body =
                    RequestBody.create(MediaType.parse("text/plain"), text);

            Call<ResponseBody> call = service.getStringRequestBody(body);
            Response<ResponseBody> response = call.execute();
            String value = response.body().string(); */

            /*String response = apiHandler.check();
            if (!Objects.equals(response, "success")) {
                System.out.printf("success");*/

            /*String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
*/
        };


   /* public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(com.serzh.Application.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }*/

    }
}
