package FactoryMethod;

public class DatabaseLoggerFactory implements LoggerFactory{

	public DatabaseLoggerFactory() {
		// TODO Auto-generated constructor stub
	}
//静态工厂方法
	public  Logger createLogger() {
		
		Logger logger=new DatabaseLogger();
		return logger;
	}
}
