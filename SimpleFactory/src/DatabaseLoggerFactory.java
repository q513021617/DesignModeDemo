
public class DatabaseLoggerFactory extends LoggerFactory{

	public DatabaseLoggerFactory() {
		// TODO Auto-generated constructor stub
	}
//静态工厂方法
	public  Logger createLogger() {
		//使用默认方式链接数据库
		Logger logger=new DatabaseLogger();
		return logger;
	}
	
	@Override
	public Logger createLogger(String args) {
		//使用参数方式链接数据库
		Logger logger=new FileLogger();
		return logger;
	}
	@Override
	public Logger createLogger(Object obj) {
//		使用对象方式链接数据库
		Logger logger=new FileLogger();
		return logger;
	}
}
