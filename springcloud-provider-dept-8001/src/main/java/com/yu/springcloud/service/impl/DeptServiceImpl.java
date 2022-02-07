package com.yu.springcloud.service.impl;

import com.yu.springcloud.dao.DeptDao;
import com.yu.springcloud.pojo.Dept;
import com.yu.springcloud.service.DeptService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yuyantian
 * @date 2021/6/26
 * @description
 */

@Service
public class DeptServiceImpl implements DeptService {

  @Autowired
  private DeptDao deptDao;
  public boolean addDept(Dept dept) {
    return deptDao.addDept(dept);
  }

  public Dept queryById(Long id) {
    return deptDao.queryById(id);
  }

  public List<Dept> queryAll() {
    return deptDao.queryAll();
  }
}
