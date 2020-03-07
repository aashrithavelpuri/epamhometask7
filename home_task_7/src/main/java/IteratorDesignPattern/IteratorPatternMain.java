package IteratorDesignPattern;

public class IteratorPatternMain {
	   public static void main(String[] args) {
	      RepositoryForNames namesRepository = new RepositoryForNames();
	      for(Iterator iteratorObject = namesRepository.getIterator(); iteratorObject.hasNext();){
	         String name = (String)iteratorObject.next();
	         System.out.println("Name : " + name);
	      } 	
	   }
}