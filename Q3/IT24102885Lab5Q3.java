import java.util.Scanner;
public class IT24102885Lab5Q3
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Start Date (1-31): ");
		int StartDate = input.nextInt();
		
		System.out.print("Enter End Date (1-31): ");
		int EndDate = input.nextInt();
		
		
		final double PerDay = 48000.0d;
		
		final int ReservedDates = EndDate - StartDate;
		
		if(StartDate>=1 && EndDate>=1 && StartDate<=31 && EndDate<=31 && StartDate!=0 && EndDate!=0 && StartDate<EndDate && ReservedDates<3)
		{
			
			double TotalAmount1 = ReservedDates*PerDay;
			System.out.println(" ");
			System.out.println("Room Charge Per Day: Rs. 48000.0/=");
			System.out.println("Number of Days Reserved: "+ReservedDates);
			System.out.println("Total Amount to be Paid: Rs. "+TotalAmount1+"/=");
		}
	    else if(StartDate>=1 && EndDate>=1 && StartDate<=31 && EndDate<=31 && StartDate!=0 && EndDate!=0 && StartDate<EndDate && ReservedDates>=3 && ReservedDates<5)
		{

            double TotalAmount2 = ReservedDates*PerDay;
			double Discount1 = 0.10;
			double WithoutDiscount1 = TotalAmount2*Discount1;
            double WithDiscount1 = TotalAmount2-WithoutDiscount1;			

			System.out.println(" ");
			System.out.println("Room Charge Per Day: Rs. 48000.0/=");
			System.out.println("Number of Days Reserved: "+ReservedDates);
		    System.out.println("Total Amount to be Paid: Rs. "+WithDiscount1+"/=");
		}
		else if(StartDate>=1 && EndDate>=1 && StartDate<=31 && EndDate<=31 && StartDate!=0 && EndDate!=0 && StartDate<EndDate && ReservedDates>=5)
		{
			double TotalAmount3 = ReservedDates*PerDay;
			double Discount2 = 0.20;
			double WithoutDiscount2 = TotalAmount3*Discount2;
			double WithDiscount2 = TotalAmount3-WithoutDiscount2;
			
			System.out.println(" ");
			System.out.println("Room Charge Per Day: Rs. 48000.0/=");
			System.out.println("Number of Days Reserved: "+ReservedDates);
		    System.out.println("Total Amount to be Paid: Rs. "+WithDiscount2+"/=");
		}
        else if(StartDate>EndDate && StartDate>0 && EndDate>0)
		{
			System.out.println("Error: Start Date must be less than End Date");
		}
        else if(StartDate>31 || EndDate>31 || StartDate==0 || EndDate==0)
		{
			System.out.println("Error: Days must be between 1 and 31");
		}
	}
}
