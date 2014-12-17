package com.foo;  
  
import org.apache.logging.log4j.LogManager;  
import org.apache.logging.log4j.Logger;  
  
public class Bar {  
  
    static Logger logger = LogManager.getLogger(Bar.class.getName());  
  
    public boolean doIt() {  
      logger.entry(); 
      logger.error("log4j2.ERROR");
      logger.exit();  
      return false;  
    }  
}