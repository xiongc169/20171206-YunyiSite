package org.yunyisite.dto;

import java.util.List;

import org.yunyisite.domain.Businesssystem;
import org.yunyisite.domain.NoticeWithBLOBs;
import org.yunyisite.domain.ReNoticeBusinesssystem;

public class NoticeDTO extends NoticeWithBLOBs {

	private List<ReNoticeBusinesssystemDTO> bizSystemList;

	public List<ReNoticeBusinesssystemDTO> getBizSystemList() {
		return bizSystemList;
	}

	public void setBizSystemList(List<ReNoticeBusinesssystemDTO> bizSystemList) {
		this.bizSystemList = bizSystemList;
	}

}
