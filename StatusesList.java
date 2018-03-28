package MiniNet;
import java.util.ArrayList;
import java.util.List;
public class StatusesList extends Status{
public List statusesToSelect;
//Author:JiaQi Tang s3598284
public StatusesList(String status) {
	super(status);
	this.statusesToSelect=new ArrayList();
}
public void addStatus() {
	//for adding status into statusesToSelect
	Status s0=new Status("Blonde hair");
	Status s1=new Status("Big muscles");
	Status s2=new Status("Vegetarian");
	Status s3=new Status("Love cats");
	Status s4=new Status("Super Dog people");
	Status s5=new Status("Play Guitar");
	Status s6=new Status("Play piano");
	Status s7=new Status("Like candy");
	Status s8=new Status("Born in Japan");
	statusesToSelect.add(0,s0);
	statusesToSelect.add(1,s1);
	statusesToSelect.add(2,s2);
	statusesToSelect.add(3,s3);
	statusesToSelect.add(4,s4);
	statusesToSelect.add(5,s5);
	statusesToSelect.add(6,s6);
	statusesToSelect.add(7,s7);
	statusesToSelect.add(8,s8);
}
public String getStatusFromList(int i) {
    Status status=(Status) statusesToSelect.get(i);
	return status.getStatus();
}
public void deleteStatus(int i) {
	statusesToSelect.remove(i);
}
public void changeStatus(int i,String n) {
	Status status=(Status) statusesToSelect.get(i);
	status.setStatus(n);
	statusesToSelect.set(i,status);
}
public void addNewStatus(String i) {
	Status s=new Status(i);
	statusesToSelect.add(statusesToSelect.size(),s);
}
}