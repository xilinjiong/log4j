package com.xilin.jiong.util;

import org.apache.log4j.Logger;

public class StringUtil {
	
	private static Logger LOGGER = Logger.getLogger(StringUtil.class);
	
	public static boolean isEmpty(String src){
		LOGGER.debug("进入方法:["+StringUtil.class+".isEmpty]");
		LOGGER.info("进入方法:["+StringUtil.class+".isEmpty]");
		boolean flag = true;
		if (null!=src&&src.trim().length()>0) {
			flag = false;
		}else {
			flag = true;
		}
		LOGGER.info("离开方法:["+StringUtil.class+".isEmpty]");
		LOGGER.debug("离开方法:["+StringUtil.class+".isEmpty]");
		return flag;
	}
}
