package com.springboot.wsh.task.runner;

import com.springboot.wsh.task.test.TestTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @Title: TaskRunner
 * @ProjectName springboot_taskscheduler
 * @Description: 定时任务统一启动类
 * @Author WeiShiHuai
 * @Date 2018/8/31 15:40
 * 实现CommandLineRunner接口，我们可以在项目启动的时候进行一些数据的加载、执行某个特定的动作等，如果存在多个加载动作，可以使用@Order注解来排序。 （数字越小，优先级越高）
 * 执行时机 : 容器启动完成时
 */
@Component
public class TaskRunner implements CommandLineRunner {

    @Autowired
    private TestTask testTask;

    @Override
    public void run(String... strings) throws Exception {
        // 启动测试任务调度
        testTask.startTask();
    }
}
