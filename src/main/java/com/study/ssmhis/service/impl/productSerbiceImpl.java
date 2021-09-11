package com.study.ssmhis.service.impl;
import com.study.ssmhis.dao.productDao;
import com.study.ssmhis.model.product;
import com.study.ssmhis.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class productSerbiceImpl implements productService{
    @Autowired
    productDao productDao;

    @Override
    public List<product> getList(product product) {
        return productDao.getList(product);
    }

    @Override
    public product byId(int pid) {
        return productDao.byId(pid);
    }

    @Override
    public int insert(product product) {
        return productDao.insert(product);
    }

    @Override
    public int update(product product) {
        return productDao.update(product);
    }

    @Override
    public int delete(int pid) {
        return productDao.delete(pid);
    }

    @Override
    public int delBatch(String ids) {
        return productDao.delBatch(ids);
    }
}
