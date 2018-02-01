package org.yunyisite.dto;

import org.yunyisite.domain.Businesssystem;
import org.yunyisite.domain.ReNoticeBusinesssystem;

public class ReNoticeBusinesssystemDTO extends ReNoticeBusinesssystem {

	private Businesssystem bizSystem;

	public Businesssystem getBizSystem() {
		return bizSystem;
	}

	public void setBizSystem(Businesssystem bizSystem) {
		this.bizSystem = bizSystem;
	}

}
