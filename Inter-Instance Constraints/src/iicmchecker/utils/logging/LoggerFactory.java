package iicmchecker.utils.logging;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LoggerFactory {
	  static private ConsoleHandler handler;
	  static private CFormatter formatter;
	  private static final String LOGGER_NAME = "IICLogger"; 
	  private static Level level = Level.ALL;
	  private static Logger logger = Logger.getLogger(LOGGER_NAME);
	  
	  public static void setLevel(Level level) {
		  LoggerFactory.level = level;
	  }

	  static public void setup() throws IOException {

		logger.info("Setup Logger");
	    // get the global logger to configure it
	    logger.setUseParentHandlers(false);

	    // remove standard handler
	    Handler[] handlers = logger.getHandlers();
	    if (handlers.length > 0) { 
	    	for (Handler h : handlers) {
	    		logger.removeHandler(h);
	    	}
	    }

	    logger.setLevel(level);
	    handler = new ConsoleHandler();
	    handler.setLevel(level);

	    // create a formatter
	    formatter = new CFormatter();
	    handler.setFormatter(formatter);
	    logger.addHandler(handler);
	    

	  }
	  
	  static public Logger getLogger() {
		return logger;  
	  }
}
