package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class bgThread extends Thread {
	Logger logger = Logger.getLogger("exceptions");
	
	bgThread() {
		setDaemon(true);
	}
	
	boolean stop = false;
	
	public void run() {
		while (!stop) {
			try {
				logger.log(null, "Corriendo el hilo");
				
			} catch (Throwable t) {
				// TODO: handle exception
				logger.log(Level.SEVERE, "Unexception  exception", t);
			}
		}
	}
	

}
