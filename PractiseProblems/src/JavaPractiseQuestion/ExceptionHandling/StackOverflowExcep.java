package JavaPractiseQuestion.ExceptionHandling;

public class StackOverflowExcep {
	
	public static void main(String[] args) 
	{
		Product product = new Product();
		product.Alpha();
	}

}

class Product
{
	
	public void Alpha() {
		Beta();
	}
	
	public void Beta() {
		Alpha();
	}
	
}

