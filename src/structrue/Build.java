package structrue;
/**
 * ͨ��Buildģʽ�������췽��
 * �����javaBean�Ĵ���״̬��һ�µ�����
 * @author lei
 *
 */
public class Build {
	private int a;     //��Ҫ�Ĳ���
	private int b;		//��Ҫ�Ĳ���
	private int c;
	private int d;
	public static class builder{
		private int a;     //��Ҫ�Ĳ���
		private int b;		//��Ҫ�Ĳ���
		private int c;
		private int d;
		public builder(int a,int b){
			this.a=a;this.b=b;
		}
		public builder c(int c){
			this.c=c;
			return this;
		}
		public builder d(int d){
			this.d=d;
			return this;
		}
		public Build build(){
			return new Build(this);
		}
	}
	private Build(builder builder){
		a=builder.a;
		b=builder.b;
		c=builder.c;
		d=builder.d;
	}
	public static void main(String[] args) {
		Build javabean=new Build.builder(12,13).c(14).d(15).build();
		System.out.println(javabean.a+";"+javabean.b+";"+javabean.c+";"+javabean.d);
	}
}
