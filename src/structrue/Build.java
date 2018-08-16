package structrue;
/**
 * 通过Build模式创建构造方法
 * 解决了javaBean的存在状态不一致的问题
 * @author lei
 *
 */
public class Build {
	private int a;     //必要的参数
	private int b;		//必要的参数
	private int c;
	private int d;
	public static class builder{
		private int a;     //必要的参数
		private int b;		//必要的参数
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
