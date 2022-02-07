package com.yu.springcloud.dao;

import com.yu.springcloud.pojo.Dept;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yuyantian
 * @date 2021/6/26
 * @description
 */
@Mapper
@Repository
public interface DeptDao {
  public boolean addDept(Dept dept);

  public Dept queryById(Long id);

  public List<Dept> queryAll();

}
