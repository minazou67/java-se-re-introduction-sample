package org.minazou67.sample.se4;

import java.util.logging.Logger;

public class LoggingSample {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		logger.info("info");
		logger.warning("warning");
		logger.severe("severe");
	}
}
