package MiniNet;
import java.util.ArrayList;
import java.util.List;
//Author:JiaQi Tang s3598284
public class ParentsList {
	public List parentsToSelect;
	public ParentsList() {
		this.parentsToSelect=new ArrayList();
	}
	public void AddParents() {
		Parents p0=new Parents(null,null);
		Parents p1=new Parents(null,null);
		Parents p2=new Parents(null,null);
		Parents p3=new Parents(null,null);
		Parents p4=new Parents(null,null);
		Parents p5=new Parents(null,null);
		Parents p6=new Parents("Bob","Alice");
		Parents p7=new Parents("Don","Cathy");
		Parents p8=new Parents("Eddie","Fiona");
		parentsToSelect.add(0,p0);
		parentsToSelect.add(1,p1);
		parentsToSelect.add(2,p2);
		parentsToSelect.add(3,p3);
		parentsToSelect.add(4,p4);
		parentsToSelect.add(5,p5);
		parentsToSelect.add(6,p6);
		parentsToSelect.add(7,p7);
		parentsToSelect.add(8,p8);
	}
	public String[] GetParents(int i) {
		        Parents parents=(Parents) parentsToSelect.get(i);
				return parents.getParents();
	}
	public void DeleteParents(int i) {
		parentsToSelect.remove(i);
	}
	public void AddNewParents(String i,String j) {
		Parents p=new Parents(i,j);
		parentsToSelect.add(parentsToSelect.size(),p);
	}
	public void GiveNewParents(int x,String i,String j) {
		String[] a= {i,j};
		parentsToSelect.set(x, a);
	}
}
