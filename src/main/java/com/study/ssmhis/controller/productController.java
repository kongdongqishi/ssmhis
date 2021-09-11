package com.study.ssmhis.controller;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.study.ssmhis.model.product;
import com.study.ssmhis.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/product")
public class productController {
    @Autowired
    productService productService;

    @RequestMapping("/list")
//    将java数据转换为json格式的数据
    @ResponseBody
    public List<product> list(product product)
    {
//        使用getlist方法，取得数据
        List<product> list=productService.getList(product);
        System.out.println(list);
        return list;
    }

    @RequestMapping("/pageList")
    @ResponseBody
//    取得数据的基础上再进行分页操作
    public Map pageList(int pageSize, int pageNumber, product product){
        /*现在开始分页，下面执行的查询会自动应用分页*/
        PageHelper.startPage(pageNumber,pageSize);
        List<product> list = productService.getList(product);
        PageInfo pageInfo=new PageInfo(list);

        /*前端，框架*/
        /*bootstrap，返回json  格式：{rows：[{},{},{}],totals:6}*/
        Map map=new HashMap();
        map.put("rows",pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;
    }
    @ResponseBody
    @RequestMapping("/delete")
    public Map delete(int pid){
        int count=productService.delete(pid);
        Map map=new HashMap();
        map.put("count",count);
        if(count>0) {
            map.put("status", true);
            map.put("message","删除成功");
        }
        else
        {
            map.put("status", false);
            map.put("message","删除失败");
        }
        return(map);
    }
    @RequestMapping("/byId")
    @ResponseBody
    public product byId(int pid){
        return productService.byId(pid);
    }

    @RequestMapping("/update")
    @ResponseBody
    public Map update(product product){
        int count=productService.update(product);
        return resultData(count>0,count>0?"更新成功！":"更新失败",count);
    }

    @RequestMapping("/insert")
    @ResponseBody
    public Map insert(product product){
        int count=productService.insert(product);
        return resultData(count>0,count>0?"新增成功！":"新增失败",count);
    }
    Map resultData(boolean status,String message,Object data){
        Map map=new HashMap<String,Object>();
        map.put("status",status);
        map.put("message",message);
        map.put("data",data);
        return map;
    }

    @RequestMapping("/delbatch")
    @ResponseBody
    public Map delBatch(String ids){
        int count=productService.delBatch(ids);
        return resultData(count>0,count>0?"批量删除成功（“+count+”）！":"删除失败",count);
    }



}
