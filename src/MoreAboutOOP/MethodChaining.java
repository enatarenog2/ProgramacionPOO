package MoreAboutOOP;

public class MethodChaining {
	
	public static class A {

	    private int a;
	    private float b;

	    A() { System.out.println("Calling The Constructor"); }

	    public A setint(int a)
	    {
	        this.a = a;
	        return this;
	    }

	    public A setfloat(float b)
	    {
	        this.b = b;
	        return this;
	    }

	    void display()
	    {
	        System.out.println("Display=" + a + " " + b);
	    }
	}

	// Driver code
	public static class Example {
	    public static void main(String[] args)
	    {
	        // This is the "method chaining".
	        new A().setint(10).setfloat(20).display();
	    }
	}

}
