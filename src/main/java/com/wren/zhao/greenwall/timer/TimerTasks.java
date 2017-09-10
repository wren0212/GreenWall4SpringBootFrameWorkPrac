package com.wren.zhao.greenwall.timer;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

/**
 * Created by wren.zhao on 2017/9/10.
 */
@Component
public class TimerTasks {
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    
//    @Scheduled(fixedRate = 3000)
//    public void timerRate() {
//        System.out.println(sdf.format(new Date()));
//    }
    
}
