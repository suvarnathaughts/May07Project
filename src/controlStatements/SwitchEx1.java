package controlStatements;

public class SwitchEx1 {
	//WAP to print months in year by using number 1 to 12
	public static void main(String args[])
	{
		int num = 10;
		
		switch(num)
		{
			case 1: String month1= "Jan";
			System.out.println(month1+" is the first month of the year");
			break;
			case 2: String month2= "Feb";
			System.out.println(month2+" is the second month of the year");
			break;
			case 3: String month3= "March";
			System.out.println(month3+" is the third month of the year");
			break;
			case 4: String month4= "April";
			System.out.println(month4+" is the fourth month of the year");
			break;
			case 5: String month5= "May";
			System.out.println(month5+" is the fifth month of the year");
			break;
			case 6: String month6= "June";
			System.out.println(month6+" is the sixth month of the year");
			break;
			case 7: String month7= "July";
			System.out.println(month7+" is the seventh month of the year");
			break;
			case 8: String month8= "Aug";
			System.out.println(month8+" is the eighth month of the year");
			break;
			case 9: String month9= "Sep";
			System.out.println(month9+" is the nineth month of the year");
			break;
			case 10: String month10= "Oct";
			System.out.println(month10+" is the tenth month of the year");
			break;
			case 11: String month11= "Nov";
			System.out.println(month11+" is the eleventh month of the year");
			break;
			case 12: String month12= "Dec";
			System.out.println(month12+" is the twelth month of the year");
			break;
			default:System.out.println(num+" does not represent any month of the year");
			
		}
	}

}
