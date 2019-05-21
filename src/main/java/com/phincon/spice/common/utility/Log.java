package com.phincon.spice.common.utility;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Log {
	
	private static Logger log;
	
	public static Logger getLogger() {
		if(log == null) log = LoggerFactory.getLogger(Log.class); 
		return log;
	}
	
	public static String getStackTrace(final Throwable throwable) {
	     final StringWriter sw = new StringWriter();
	     final PrintWriter pw = new PrintWriter(sw, true);
	     throwable.printStackTrace(pw);
	     return sw.getBuffer().toString();
	}
}
