package MiniNet;
//Author:JiaQi Tang s3598284
public class Children {
	private String[] children;
//in my system,one family can have maximum 10 children,because in Java we can not define an Array without giving the length
	public Children(String children1) {
		children=new String[10];
		this.children[0]=children1;
	}
	public void setChildren(String children) {
		this.children[0]=children;
	}
	public String[] getChildren() {
		String[]i=new String[children.length];
		for(int j=0;j<children.length;j++) {
		i[j]=this.children[j];
		}
		return i;
	}
}
