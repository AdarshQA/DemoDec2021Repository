package com.sgtesting.tests;

import org.apache.log4j.Logger;

public class Forloopslogs {

	public static void main(String[] args) {
		getlogs();

	}
	private static Logger log=Logger.getLogger("Loop output");
	private static void getlogs()
	{
		log.info("for loop execution started here....");
		for(int i=20;i<=40;i++)
		{
			if(i%2==0)
			{
				log.info("Even  number:"+i);
			}
		}
		log.info("for loop execution ended here...");
	}

}
