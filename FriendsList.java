 package MiniNet;
import java.util.ArrayList;
import java.util.List;
//Author:JiaQi Tang s3598284
public class FriendsList extends Friends{
	public List friendsToSelect;
	public FriendsList(String friends) {
		super(friends);
		this.friendsToSelect=new ArrayList();
	}
	public void AddFriends() {
		Friends f0=new Friends("Don");
		Friends f1=new Friends("Eddie");
		Friends f2=new Friends(null);
		Friends f3=new Friends("Alice");
		Friends f4=new Friends("Bob");
		Friends f5=new Friends(null);
		Friends f6=new Friends("Helen");
		Friends f7=new Friends("Gary");
		Friends f8=new Friends(null);
		friendsToSelect.add(0,f0);
		friendsToSelect.add(1,f1);
		friendsToSelect.add(2,f2);
		friendsToSelect.add(3,f3);
		friendsToSelect.add(4,f4);
		friendsToSelect.add(5,f5);
		friendsToSelect.add(6,f6);
		friendsToSelect.add(7,f7);
		friendsToSelect.add(8,f8);
	}
	public String[] GetFriends(int i) {
		      Friends friends=(Friends) friendsToSelect.get(i);
			  return friends.getFriends();
	}
	public void DeleteFriends(int i) {
		friendsToSelect.remove(i);
	}
	public void ChangeFriends(int i,String n) {
		Friends friends=(Friends) friendsToSelect.get(i);
		String[] newFriendsList=friends.getFriends();
		int y=0;
		for(int x=0;x<10;x++) {
			if(newFriendsList[x]==null) {
				break;
			}else {
			y+=1;
			}
		}
		newFriendsList[y]=n;
		friends.changeFriendsList(newFriendsList);
		friendsToSelect.set(i,friends);
	}
	public void AddNewFriends(String i) {
		Friends f=new Friends(i);
		friendsToSelect.add(friendsToSelect.size(),f);
	}
}
