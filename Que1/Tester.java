package ass3;

public class Tester {
	public static void main(String[] args)
	{
		SalariedEmployee se=new SalariedEmployee(20000);
		System.out.println(se);
		HourlyEmployee he=new HourlyEmployee(2500,40);
		System.out.println(he);
		CommisionEmployee ce=new CommisionEmployee(10000,50);
		System.out.println(ce);
	}
}
