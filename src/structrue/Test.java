package structrue;

public class Test {
	private int a;
	private int b;
	private int c;
	private int d;
	public Test(int a,int b){
		this(a,b,0);
	}
	public Test(int a,int b,int c){
		this(a,b,c,0);
	}
	public Test(int a,int b,int c,int d){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	public static void main(String[] args) {
		Test t=new Test(1,2);
		System.out.println(t.a+";"+t.b);
	}
}
