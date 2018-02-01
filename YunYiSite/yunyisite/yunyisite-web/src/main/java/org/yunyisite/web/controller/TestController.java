package org.yunyisite.web.controller;

import java.io.File;
import java.io.IOException;

import javax.jms.Destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.yunyisite.domain.Accounts;
import org.yunyisite.web.jms.Producer;

@Controller
@RequestMapping("/test")
public class TestController {

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

	@RequestMapping("/json.do")
	public @ResponseBody Accounts jsonTest() {
		Accounts order = new Accounts();
		try {
			order.setAccountid("accountid");
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
