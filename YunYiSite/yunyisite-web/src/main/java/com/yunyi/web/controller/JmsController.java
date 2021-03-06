package com.yunyi.web.controller;

import com.yunyi.domain.wong_user.Account;
import com.yunyi.web.jms.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.jms.Destination;
import java.io.File;
import java.io.IOException;

/**
 * @Desc JmsController
 * <p>
 * @Author yoong
 * <p>
 * @Date 2016年7月20日
 * <p>
 * @Version 1.0
 */
@Controller
@RequestMapping("/jms")
public class JmsController {

    @Autowired
    private Producer producer;

    @Autowired
    @Qualifier("queueDestination")
    private Destination destination;

    @RequestMapping("/jms.do")
    public void jmsTest() {
        try {
            producer.sendMessage(destination, "this is Message");
        } catch (Exception e) {
            String msg = e.getMessage();
        }
    }

    @ResponseBody
    @RequestMapping("/json.do")
    public Account jsonTest() {
        Account order = new Account();
        try {
            order.setAccountId("accountid");
        } catch (Exception e) {
            String msg = e.getMessage();
        }
        return order;
    }

    @RequestMapping("/upload.do")
    public String upload() {
        return "view/upload";
    }

    @RequestMapping("/uploaded.do")
    public String upload2(@RequestParam("file") MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                System.out.println(file.getOriginalFilename());
                file.transferTo(new File("d:\\files\\" + file.getOriginalFilename()));
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
        return "view/upload";
    }

}
