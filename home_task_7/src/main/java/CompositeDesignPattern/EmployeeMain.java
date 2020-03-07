package CompositeDesignPattern;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;


public class EmployeeMain {
	private static final Logger LOGGER = LogManager.getLogger(EmployeeMain.class);
	public static void main(String[] args) {		   
	      Employee CEO = new Employee("Aashritha","CEO", 30000);
	      Employee headSales = new Employee("Nishath","Head Sales", 20000);
	      Employee headMarketing = new Employee("Mahaboobbee","Head Marketing", 20000);
	      Employee clerk1 = new Employee("Manaswini","Marketing", 10000);
	      Employee clerk2 = new Employee("Ankitha","Marketing", 10000);
	      Employee salesExecutive1 = new Employee("Ravinder","Sales", 10000);
	      Employee salesExecutive2 = new Employee("Nirmala","Sales", 10000);
	      CEO.add(headSales);
	      CEO.add(headMarketing);
	      headSales.add(salesExecutive1);
	      headSales.add(salesExecutive2);
	      headMarketing.add(clerk1);
	      headMarketing.add(clerk2);
	      LOGGER.info(CEO+"\n"); 
	      for (Employee headEmployee : CEO.getSubordinates()) {
	    	  LOGGER.info(headEmployee+"\n");	         
	         for (Employee employee : headEmployee.getSubordinates()) {
	        	 LOGGER.info(employee+"\n");
	         }
	      }		
	   }
}