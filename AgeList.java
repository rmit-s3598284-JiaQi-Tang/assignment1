package MiniNet;
import java.util.ArrayList;
import java.util.List;
//Author:JiaQi Tang s3598284
public class AgeList extends Age{
	public List ageToSelect;
	public AgeList(int age) {
		super(age);
		this.ageToSelect=new ArrayList();
	}
	public void AddAge() {
		//for adding id into idToSelect
		Age a0=new Age(28);
		Age a1=new Age(29);
		Age a2=new Age(25);
		Age a3=new Age(33);
		Age a4=new Age(43);
		Age a5=new Age(38);
		Age a6=new Age(6);
		Age a7=new Age(4);
		Age a8=new Age(1);
		ageToSelect.add(0,a0);
		ageToSelect.add(1,a1);
		ageToSelect.add(2,a2);
		ageToSelect.add(3,a3);
		ageToSelect.add(4,a4);
		ageToSelect.add(5,a5);
		ageToSelect.add(6,a6);
		ageToSelect.add(7,a7);
		ageToSelect.add(8,a8);
	}
	public int GetAge(int i) {
	    Age age=(Age) ageToSelect.get(i);
		return age.getAge();
	}
	public void DeleteAge(int i) {
		ageToSelect.remove(i);
	}
	public void AddNewAge(int i) {
		Age a=new Age(i);
		ageToSelect.add(ageToSelect.size(),a);
	}
}
