package FactoryMethod;

public class DatabaseLoggerFactory implements LoggerFactory{

	public DatabaseLoggerFactory() {
		// TODO Auto-generated constructor stub
	}
//��̬��������
	public  Logger createLogger() {
		
		Logger logger=new DatabaseLogger();
		return logger;
	}
}
