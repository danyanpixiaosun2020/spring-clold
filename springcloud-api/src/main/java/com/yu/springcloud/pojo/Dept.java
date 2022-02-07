package com.yu.springcloud.pojo;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author yuyantian
 * @date 2021/6/26
 * @description
 */

@Data
@NoArgsConstructor
@Accessors(chain = true) //链式写法
public class Dept  implements Serializable {

  private Long deptno;
  private String dname;

//这个数据存在那个数据库的字段，一个服务对应一个数据库，同一信息可能存在不同的数据库
  private String db_source;

  public Dept(String dname) {
    this.dname = dname;
  }
}
