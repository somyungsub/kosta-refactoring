package code.refactoring.classmove_5;

import org.apache.log4j.Logger;

public class Log4jClient {


	public static void main(String[] args) {
		
//		Logger logger = Logger.getLogger("MyLogger");
//		logger.removeAllAppenders();
//		logger.addAppender(new ConsoleAppender(new PatternLayout("%p %t %m%n"), ConsoleAppender.SYSTEM_OUT));
		Logger logger = Log4jWrapper.getInstance();
		logger.info("hello");

	}
}
