package com.yu.springcloud;

import com.yu.springcloud.myRule.DiyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author yuyantian
 * @date 2021/6/27
 * @description
 */
@SpringBootApplication
//在微服务启动的时候就能去加载我们自定义的ribbon类
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT",configuration = DiyRule.class)
public class DeptConsumer_80 {

  public static void main(String[] args) {
    SpringApplication.run(DeptConsumer_80.class,args);
  }
}
