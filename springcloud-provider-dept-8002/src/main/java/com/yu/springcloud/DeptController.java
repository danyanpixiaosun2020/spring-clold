package com.yu.springcloud;

import com.yu.springcloud.pojo.Dept;
import com.yu.springcloud.service.DeptService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuyantian
 * @date 2021/6/26
 * @description
 */

@RestController
public class DeptController {

  @Autowired
  private DeptService deptService;

  @Autowired
  private DiscoveryClient client;

  @PostMapping("dept/add")
  public boolean addDept(Dept dept) {
    return deptService.addDept(dept);
  }

  @GetMapping("dept/get/{id}")
  public Dept get(@PathVariable("id") Long id) {
    return deptService.queryById(id);
  }

  @GetMapping("dept/list")
  public List<Dept> list() {
    return deptService.queryAll();
  }

  @GetMapping("dept/discovery")
  public Object discovery() {
    List<String> services= client.getServices();
    System.out.println(services);
    System.out.println(client.getInstances("SPRINGCLOUD-PROVIDER-DEPT"));
    return client;
  }

}
