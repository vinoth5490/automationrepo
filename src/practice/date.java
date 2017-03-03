package practice;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import bsh.ParseException;

public class date {

	/**
	 * @param args
	 * @throws java.text.ParseException
	 */
	public static void main(String[] args) throws java.text.ParseException,
			ParseException {
		
		// TODO Auto-generated method stub
	String dateInString = "16-02-2016";

	Date date =	convertStringToDate(dateInString,"dd-mm-yyyy");
	System.out.println(convertStringToDate(dateInString,"dd-mm-yyyy"));
	System.out.println("Given Date:"+date);
	//addCalendarDays(date,3);
	addBuisnessDays(date,10);
	

	}

	public static Date convertStringToDate(String convertToDate,String format) {
		SimpleDateFormat formatter = new SimpleDateFormat(format);

		Date date = null;
		try {
			date = formatter.parse(convertToDate);
		} catch (java.text.ParseException e) {
			e.printStackTrace();
		}
		return date;

	}
	
	public static Date addCalendarDays (Date date ,int days){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE,days);
		Date addedDate = cal.getTime();
		System.out.println(addedDate);
		return addedDate;
	}
	
	public static String addBuisnessDays(Date date,int days){
		ArrayList<String> usBankHolidays = new ArrayList<String>();
		usBankHolidays.add("15-02-2016");
		usBankHolidays.add("16-02-2016");
		SimpleDateFormat dformat = new SimpleDateFormat("dd-mm-yyyy");
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int i=1;
		
		while(i<=days){
			boolean status = true;
			boolean temp = false;
			System.out.println(i);
		  cal.add(Calendar.DATE, 1);
		  
			
						
					//System.out.println(usBankHolidays.size());
						
						for(int k=0;k<usBankHolidays.size();k++){
							System.out.println(k);
							System.out.println("actual:"+dformat.format(cal.getTime()));
							System.out.println("holiday"+usBankHolidays.get(k));
							if(!(dformat.format(cal.getTime())).equals(usBankHolidays.get(k))){
								temp=true;
							}
							else{
								temp=false;
								
							}
								  status = 	status && temp;
								  
							}
	
						if(status==true){
							if (cal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && cal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY)
							{
							i++;
							}
						}
						else{
							i=i;
						}
		    
			}
		//Date businessDateAdded = cal.getTime();
System.out.println((dformat.format(cal.getTime())));
		return (dformat.format(cal.getTime()));
		
	}
	
	public static Date addBuisnessDaysincludingNationalHolidays(Date date,int days){
		
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int i=1;
			
		while(i<=days){
		  cal.add(Calendar.DATE, 1);
		  
					if (cal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && cal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY)
		    {
						
				i++;
							
						}else{
							i=i;
						}
		    }
		Date businessDateAdded = cal.getTime();
System.out.println(businessDateAdded);
		return businessDateAdded;
		
	}


}
/*
 * Calendar cal = Calendar.getInstance(); System.out.println(cal); Date date =
 * new Date(); date.getDay(); System.out.println(date.getDay());
 * SimpleDateFormat dateform = new SimpleDateFormat("MM-dd-yy");
 * System.out.println(dateform.format(date)); if(date.getDay()==6)
 * ||(date.getDay()==0)){
 */
// String startDate = "12-02-2016";


/*do
{
	 cal.add(Calendar.DAY_OF_MONTH, 1);
  if (cal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && cal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY)
  {
    
  }
}
while (startCal.getTimeInMillis() <= endCal.getTimeInMillis());*/

