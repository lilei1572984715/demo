package structrue;
/**
 * ע�⣺����û������get����Ҳ�ܷ�������Ϊmain�����ڸ�����
 * �ŵ㣺��һ���д������췽�������һЩ
 * �ص�������ģʽ
 * @author lei
 *
 */
public class telescopingConstructor {
	private final int a;            //��Ҫ����
	private final int b;			  //��Ҫ����
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
