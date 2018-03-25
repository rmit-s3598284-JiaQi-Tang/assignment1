package MiniNet;
import java.util.ArrayList;
import java.util.List;
//Author:JiaQi Tang s3598284
public class NameList {
	public List nameToSelect;
	public NameList() {
		this.nameToSelect=new ArrayList();
	}
	public void AddName() {
		//for adding status into statusesToSelect
		Name n0=new Name("Alice");
		Name n1=new Name("Bob");
		Name n2=new Name("Cathy");
		Name n3=new Name("Don");
		Name n4=new Name("Eddie");
		Name n5=new Name("Fiona");
		Name n6=new Name("Gary");
		Name n7=new Name("Helen");
		Name n8=new Name("Ivan");
		nameToSelect.add(0,n0);
		nameToSelect.add(1,n1);
		nameToSelect.add(2,n2);
		nameToSelect.add(3,n3);
		nameToSelect.add(4,n4);
		nameToSelect.add(5,n5);
		nameToSelect.add(6,n6);
		nameToSelect.add(7,n7);
		nameToSelect.add(8,n8);
	}
	public String GetName(int i) {
		        Name name=(Name) nameToSelect.get(i);
				return name.getName();
	}
	public void DeleteName(int i) {
		nameToSelect.remove(i);
	}
	public void AddNewName(String i) {
		Name n=new Name(i);
		nameToSelect.add(nameToSelect.size(),n);
	}
	public int FindName(String i) {
		int j=0;
		while(j>=0) {
	        Name name=(Name) nameToSelect.get(j);
			String k=name.getName();
			if(i.equals(k)) {
				break;
			}
			j=j+1;
		}
		return j;
	}
}