package MiniNet;
//Author:JiaQi Tang s3598284
public class Parents {
	private String[] parents;
	//because parents will always be exactly two in this scenario,so I define a array to store parents' names
	public Parents(String parents1,String parents2) {
		parents=new String[2];//initialize the array as the size of 2
		this.parents[0]=parents1;
		this.parents[1]=parents2;
	}
	public void setName(String parents1,String parents2) {
		this.parents[0]=parents1;
		this.parents[1]=parents2;
	}
	public String[] getParents() {
		return parents;
	}
	public void changeParentsList(String[] i) {
		this.parents=i;
	}
}
