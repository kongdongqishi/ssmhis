package com.study.ssmhis.service;

import com.study.ssmhis.model.product;

import java.util.List;

public interface productService {
    List<product> getList(product product);
    product byId(int pid);
    int insert(product product);
    int update(product product);
    int delete(int pid);
    int delBatch(String ids);
}
