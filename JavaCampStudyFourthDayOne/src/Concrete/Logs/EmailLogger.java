package Concrete.Logs;

import Abstracts.BaseLogger;

public class EmailLogger extends BaseLogger{
	
   public	EmailLogger()
	{
		loggerName="Email";
	}

	@Override
	public void log(String logMessage) {
	
		super.log(logMessage);
		
	}
}
