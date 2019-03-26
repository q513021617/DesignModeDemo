
public class FileLoggerFactory extends LoggerFactory {

	public FileLoggerFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Logger createLogger() {
		Logger logger=new FileLogger();
		return logger;
	}

	@Override
	public Logger createLogger(String args) {
		Logger logger=new FileLogger();
		return logger;
	}

	@Override
	public Logger createLogger(Object obj) {
		Logger logger=new FileLogger();
		return logger;
	}

}
