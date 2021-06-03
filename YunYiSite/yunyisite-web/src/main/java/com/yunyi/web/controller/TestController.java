package com.yunyi.web.controller;

import com.yunyi.dao.yoong_rehearsal.TestMapper;
import com.yunyi.domain.yoong_rehearsal.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Desc TestController
 * <p>
 * @Author yoong
 * <p>
 * @Date 2016年7月20日
 * <p>
 * @Version 1.0
 */
@Controller
@RequestMapping("/test")
public class TestController {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private TestMapper testMapper;

    /**
     * http://localhost:8090/test/add
     */
    @ResponseBody
    @RequestMapping("/add")
    public void add() {
        try {
            Test test = new Test();
            test.setName(format.format(new Date()));
            int effectRows = testMapper.insertSelective(test);
            System.out.println(effectRows);
        } catch (Exception e) {
            String msg = e.getMessage();
        }
    }
}
