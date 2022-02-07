package com.yu.springcloud.service;

import com.yu.springcloud.pojo.Dept;
import java.util.List;

/**
 * @author yuyantian
 * @date 2021/6/26
 * @description
 */
public interface DeptService {
  public boolean addDept(Dept dept);

  public Dept queryById(Long id);

  public List<Dept> queryAll();

}
