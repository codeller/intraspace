package com.codeller.model.base.impl;

import com.codeller.model.base.LogLevel;
import com.codeller.model.base.LogMessage;
import com.codeller.model.impl.PostImpl;

public class PersistableLogMessage extends PostImpl implements LogMessage {

	@Override
	public LogLevel getLevel() {
		return level;
	}

	@Override
	public String getLogType() {
		return logType;
	}

	@Override
	public String getIP() {
		return ip;
	}

	@Override
	public String getBrowserString() {
		return browserString;
	}

	private LogLevel level;
	private String logType;
	private String ip;
	private String browserString;
}
