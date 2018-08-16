package structrue;
/**
 * 注意：这里没有设置get方法也能访问是因为main方法在该类下
 * 优点：比一般的写多个构造方法代码简单一些
 * 重叠构造器模式
 * @author lei
 *
 */
public class telescopingConstructor {
	private final int a;            //必要参数
	private final int b;			  //必要参数
	private final int c;
	private final int d;
	public telescopingConstructor(int a,int b){
		this(a,b,0);
	}
	public telescopingConstructor(int a,int b,int c){
		this(a,b,c,0);
	}
	public telescopingConstructor(int a,int b,int c,int d){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	public static void main(String[] args) {
		telescopingConstructor t=new telescopingConstructor(11,12);
		System.out.println(t.a+";"+t.b+";"+t.c+";"+t.d);
	}
}
