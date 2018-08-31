package com.springboot.wsh.task.test;

import com.springboot.wsh.task.base.BaseTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Title: TestTask
 * @ProjectName springboot_taskscheduler
 * @Description: 测试任务调度
 * @Author WeiShiHuai
 * @Date 2018/8/31 15:48
 */
@Component
public class TestTask extends BaseTask {

    private static Logger logger = LoggerFactory.getLogger(TestTask.class);

    @Value("${com.springboot.wsh.task.scheduler.cron}")
    private String cron;

    @Value("${com.springboot.wsh.task.scheduler.isOpen}")
    private boolean isOpen;

    @Override
    protected String getCron() {
        return cron;
    }

    @Override
    protected boolean isOpen() {
        return isOpen;
    }

    @Override
    protected void executeTask() {
        logger.info("执行任务调度，当前时间为：" + new Date());
    }

}
