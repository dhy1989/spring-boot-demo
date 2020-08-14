package com.example.demo.quartz;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dinghy
 * @date 2020/8/14 15:41
 */
@Configuration
public class QuartzConfig {
    @Bean
    public JobDetail helloJob() {
        JobDetail jobDetail = JobBuilder.newJob(HelloJob.class)
                .withIdentity("hello_job_detail")
                .storeDurably()
                .build();
        return jobDetail;
    }

    @Bean
    public Trigger helloTrigger(JobDetail jobDetail) {
        return TriggerBuilder.newTrigger()
                .forJob(jobDetail).withIdentity("hello_job_trigger")
                .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                        .withIntervalInSeconds(1)
                        .repeatForever())
                .build();
    }

}
