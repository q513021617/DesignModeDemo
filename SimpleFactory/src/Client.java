
public class Client {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoggerFactory factory;
		Logger logger;
		factory=(LoggerFactory)XMLUtil.getBean();
		
		factory.writeLog();
	}

}
