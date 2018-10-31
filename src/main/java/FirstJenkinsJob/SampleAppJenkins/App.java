package FirstJenkinsJob.SampleAppJenkins;

/**
 * Hello world!
 *
 */
public class App 
{
	
	static int a=10; 
	
	static int b=20; 
	
	private static String n = "Jenkins Demo";
	
    public static void main( String[] args )
    {
    	int c = add(10,20);
    	
        System.out.println( "Hello World!" );
        
        System.out.println("Sum of 2 numbers is : " + c);
        
        System.out.println("Value of a is: " + a);
        
        System.out.println("Value of a is " + b);
        
        System.out.println(n);
        
        
    }

	public static int add(int i, int j) {
		
		return i+j;
	}
}
