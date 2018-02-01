package org.yunyisite.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.yunyisite.dao.NoticeMapper;
import org.yunyisite.domain.Notice;
import org.yunyisite.dto.NoticeDTO;

@Controller
@RequestMapping("/notice")
public class NoticeController {

	@Autowired
	private NoticeMapper noticeDao;

	@RequestMapping("/get.do")
	public String get() {

		try {
			// Notice notice =
			// noticeDao.selectByPrimaryKey("9193C818-AC92-4057-B18D-001834562FBD");
			NoticeDTO notice = noticeDao.selectExtendByPrimaryKey("9193C818-AC92-4057-B18D-001834562FBD");

			String title = notice.getTitle();
			System.out.println(title);

			int effectRows = noticeDao.updateById("9193C818-AC92-4057-B18D-001834562FBD",
					"9193C818-AC92-4057-B18D-001834562FBD111", "9193C818-AC92-4057-B18D-001834562FBD222");
			System.out.println(effectRows);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "get";
	}

}
