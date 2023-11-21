
/*
 * Static classes of JAVA functions
 * to be used with the WD JAVA Calls example
 * 
 */

import javax.swing.*;
import java.util.Date;

public class Function {
	public static String jvDebug()
	{
		
		return "PCSDEBUG";
		
	}

	public static void jvInfo(String szMessage)
	{
		JOptionPane.showMessageDialog(null, szMessage, "jvInfo", JOptionPane.INFORMATION_MESSAGE);
	}

	public static String jvTodaysDate()
	{
		// Initializes a string to receive the formatted date
		String szDate = "";
		
		// Initializes a date
		Date ddDate = new Date();
		
		// Retrieves the date
		szDate = ddDate.toLocaleString().substring(0, 12);
				
		return szDate;
	}
	
	public static String jvNow()
	{
		// Initializes a string to receive the formatted date
		String szDate = "";
		
		// Initializes a date
		Date ddDate = new Date();
		
		// Retrieves the date
		szDate = ddDate.toLocaleString().substring(13);
				
		return szDate;	
	}

}
