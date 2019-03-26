
public class DatabaseLoggerFactory extends LoggerFactory{

	public DatabaseLoggerFactory() {
		// TODO Auto-generated constructor stub
	}
//��̬��������
	public  Logger createLogger() {
		//ʹ��Ĭ�Ϸ�ʽ�������ݿ�
		Logger logger=new DatabaseLogger();
		return logger;
	}
	
	@Override
	public Logger createLogger(String args) {
		//ʹ�ò�����ʽ�������ݿ�
		Logger logger=new FileLogger();
		return logger;
	}
	@Override
	public Logger createLogger(Object obj) {
//		ʹ�ö���ʽ�������ݿ�
		Logger logger=new FileLogger();
		return logger;
	}
}
