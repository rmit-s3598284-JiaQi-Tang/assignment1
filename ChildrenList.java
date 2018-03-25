package MiniNet;
import java.util.ArrayList;
import java.util.List;
//Author:JiaQi Tang s3598284
public class ChildrenList {
	public List childrenToSelect;
	public ChildrenList() {
		this.childrenToSelect=new ArrayList();
	}
	public void AddChildren() {
		Children c0=new Children("Gary");
		Children c1=new Children("Gary");
		Children c2=new Children("Helen");
		Children c3=new Children("Helen");
		Children c4=new Children("Ivan");
		Children c5=new Children("Ivan");
		Children c6=new Children(null);
		Children c7=new Children(null);
		Children c8=new Children(null);
		childrenToSelect.add(0,c0);
		childrenToSelect.add(1,c1);
		childrenToSelect.add(2,c2);
		childrenToSelect.add(3,c3);
		childrenToSelect.add(4,c4);
		childrenToSelect.add(5,c5);
		childrenToSelect.add(6,c6);
		childrenToSelect.add(7,c7);
		childrenToSelect.add(8,c8);
	}
	public String[] GetChildren(int i) {
		        Children children=(Children) childrenToSelect.get(i);
				return children.getChildren();
	}
	public void DeleteChildren(int i) {
		childrenToSelect.remove(i);
	}
	public void AddNewChildren(String i) {
		Children c=new Children(i);
		childrenToSelect.add(childrenToSelect.size(),c);
	}
}
