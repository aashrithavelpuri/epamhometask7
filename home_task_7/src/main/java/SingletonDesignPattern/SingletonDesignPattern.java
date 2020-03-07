package SingletonDesignPattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SingletonDesignPattern {
	private static final Logger LOGGER = LogManager.getLogger(SingletonDesignPattern.class);
	   private static SingletonDesignPattern singletonDesignPatternObject = new SingletonDesignPattern();
	   private SingletonDesignPattern(){
		   
	   }
	   public static SingletonDesignPattern getInstance(){
	      return singletonDesignPatternObject;
	   }
	   public void showMessage(){
	      LOGGER.info("This is singleton design pattern");
	   }
}