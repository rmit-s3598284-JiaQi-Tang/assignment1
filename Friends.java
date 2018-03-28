package MiniNet;
//Author:JiaQi Tang s3598284
public class Friends {
	private String[] friends;
	public Friends(String friends1) {
		friends=new String[10];
//in my system,one person can have maximum 10 friends,because in Java we can not define an Array without giving the length
		this.friends[0]=friends1;
	}
	public void setFriends(String friends) {
		this.friends[0]=friends;
	}
	public String[] getFriends() {
		return friends;
	}
	public void changeFriendsList(String[] i) {
		this.friends=i;
	}
}
