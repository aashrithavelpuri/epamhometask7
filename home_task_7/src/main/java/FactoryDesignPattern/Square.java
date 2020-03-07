package FactoryDesignPattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Square implements Shape {
	private static final Logger LOGGER = LogManager.getLogger(FactoryDesignPatternMain.class);
	public void draw() {
	      LOGGER.info("Inside Square::draw() method.");
	   }
}