package com.jarentals.common.util;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

public class Util {
	
	
	
	public static boolean isObjectEmpty(Object... objects){
		
		boolean result = false;
		
		for(Object obj : objects){
			if(obj == null){
				result = true;
			}else{
				//If object is not null verify that if it is a string
				//if it is a empty string set result to true
				if(obj instanceof String && StringUtils.isEmpty((String)obj)  ){
					result = true;
				}
			}
		}
		
		return result;
	}
	
	public static Date getCurrentDate(){
		Calendar cal = Calendar.getInstance();
		return cal.getTime();
	}
}