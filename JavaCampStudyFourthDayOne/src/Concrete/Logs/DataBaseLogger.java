package Concrete.Logs;
import Abstracts.BaseLogger;

public class DataBaseLogger extends BaseLogger{

	public DataBaseLogger()
	{
		loggerName="DataBase";
	}

	@Override
	public void log(String logMessage) {
		// TODO Auto-generated method stub
		super.log(logMessage);
		
	}

}
