package assign3;
public class Tester {
	public static void main(String[] args)
	{
	Invoice invoice  = new Invoice("1", "Bag", 2, 300.0);
	String k=invoice.toString();
	System.out.println(k);
	}
}
