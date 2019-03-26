package FactoryMethod;

public class FileLoggerFactory implements LoggerFactory {

	public FileLoggerFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Logger createLogger() {
		Logger logger=new FileLogger();
		return logger;
	}

}
