package com.yu.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author yuyantian
 * @date 2021/6/27
 * @description
 */
@Configuration
public class ConfigBean {
  //配置负责均衡失效RestTemplate
  //IRule
  //RoundRobinRule 轮询
  //RandomRule 随机
  //AvailabilityFilteringRule 会先过滤掉跳闸、访问故障的服务，对剩余的服务进行轮询
  //RetryRule 会先按照轮询获取服务，如果服务获取失败，则在指定的时间内进行重试

  @Bean
  @LoadBalanced
  public RestTemplate getRestTemplate(){
    return new RestTemplate();
  }

  /**
   * todo:为什么配置了这个bean，就会随机获取服务
   * @return
   */
  @Bean
  public IRule myRule(){
    return  new RandomRule();
  }

}
