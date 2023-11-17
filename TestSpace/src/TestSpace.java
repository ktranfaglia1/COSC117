
public class TestSpace {

	public static void main(String[] args) {
		String test= "abcdefg";
		String b=test.toUpperCase();
		System.out.println(b);
		System.out.println(test);
		String s1="Hello John";
		String s2="hello john";
		boolean c=s1.equals(s2);
		System.out.println(c);
		String s3="Hello John";
		String s4="hello john";
		s3=s3.toUpperCase();
		s4=s4.toUpperCase();
		boolean d=s3.equals(s4);
		System.out.println(d);
		String s5= "This is stupid";
		String e=s5.substring(2);
		System.out.println(e);
		String f=s5.substring(2,6);
		System.out.println(f);
		String s6= "This is stupid";
		int g=s6.indexOf("stupid");
		System.out.println(g);
		String s7= "This is stupid";
		int h=s7.lastIndexOf("d");
		System.out.println(h);
		String s8= "This is stupid";
		char i=s8.charAt(5);
		System.out.println(i);
		String s9="Java";
		String s10=s9.replace('J', 'j');
		System.out.println(s10);
		double number=10.5;
		int value= (int)number;
		System.out.println(value);
		double x;
		x=3*Math.pow(6.0, 3.0);
		System.out.println(x);
		System.out.println(Math.sqrt(25.0));
		double z=-4.2, y=4.2, a, a1;
		a=Math.abs(z);
		a1=Math.abs(y);
		System.out.println(a);
		System.out.println(a1);
		double number1=Math.random();
		double number2=Math.random()*100;
		double number3=5+(int)(Math.random()*30);
		System.out.printf("%.4f\n", number1);
		System.out.printf("%.4f\n",number2);
		System.out.println(number3);
	}

}
