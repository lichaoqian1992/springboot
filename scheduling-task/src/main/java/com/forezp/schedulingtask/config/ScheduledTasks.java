package com.forezp.schedulingtask.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

//    @Value("${corn}")
//    private String cor1e;
//    @Scheduled(fixedRate = 5000) ：上一次开始执行时间点之后5秒再执行
//    @Scheduled(fixedDelay = 5000) ：上一次执行完毕时间点之后5秒再执行
//    @Scheduled(initialDelay=1000, fixedRate=5000) ：第一次延迟1秒后执行，之后按fixedRate的规则每5秒执行一次
//    @Scheduled(cron=” /5 “) ：通过cron表达式定义规则，什么是cro表达式，自行搜索引擎
//    @Scheduled(fixedRate = 5000)

//    @Scheduled(fixedRate = 5000)
    @Scheduled(cron = "${corn}")
    public void reportCurrentTime() {

        log.info("The time is now {}", dateFormat.format(new Date()));
    }

}

