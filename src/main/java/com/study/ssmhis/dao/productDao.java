package com.study.ssmhis.dao;

import com.study.ssmhis.model.product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface productDao {
    public List<product> getList(product product);
    product  byId(int pid);
    int  insert(product product);
    int  update(product product);
    int  delete(int pid);
    int  delBatch(@Param("ids") String ids);
    /*public List<User> all();

    public User getById(Integer id);*/


}
