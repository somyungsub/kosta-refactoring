package code.refactoring.classmove_5;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Log4jWrapper {
	private static Logger logger;
	
	public Log4jWrapper() {
		if(logger == null) {
			setLoggerConfig();
		}
	}
	
	public void info (String logMsg) {
		logger.info(logMsg);
	}
	
	public static Logger getInstance() {
		if(logger == null) {
			setLoggerConfig();
		}
		return logger;
	}
	
	private static void setLoggerConfig() {
		logger = Logger.getLogger("MyLogger");
		logger.removeAllAppenders();
		logger.addAppender(new ConsoleAppender(new PatternLayout("%p %t %m%n"), ConsoleAppender.SYSTEM_OUT));
	}

}
