package com.foo;
import com.foo.Bar;  

import org.apache.logging.log4j.LogManager;  
import org.apache.logging.log4j.Logger;  
  
public class MyApp {  
  
   private static Logger logger = LogManager.getLogger(MyApp.class.getName());  
  
   public static void main(String[] args) {  
  
	   for(int i = 1; i < 1+i; i++){
		   logger.trace("log4j2.trace -Entering application.");   
		   Bar bar = new Bar();  
           if (!bar.doIt()) {  
        	   logger.error("log4j2.ERROR");  
           }  
           logger.trace("log4j2.trace -Exiting application."); 
	   }
   }  
}
