package MiniNet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//Author:JiaQi Tang s3598284
public class MiniNet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameList nameList=new NameList(null);
		AgeList ageList=new AgeList(0);
		ImageList imageList=new ImageList(0);
		StatusesList statusesList=new StatusesList(null);
		ParentsList parentsList=new ParentsList(null,null);
		ChildrenList childrenList=new ChildrenList(null);
		FriendsList friendsList=new FriendsList(null);
		//use constructors to create objects
		nameList.AddName();
		ageList.AddAge();
		imageList.AddImage();
		statusesList.AddStatus();
		parentsList.AddParents();
		childrenList.AddChildren();
		friendsList.AddFriends();
		//use the above methods to add variables and arrays to Lists
		//the data of the system has been initialed
		int p=0;
		//set a variable as a condition statement to loop the whole system
while(p==0) {
  System.out.println("=====================");
  System.out.println("Welcome to MiniNet !");
  System.out.println("1.List everyone");
  System.out.println("2.Select a person");
  System.out.println("3.Add a New person");
  System.out.println("4.Exit");
  System.out.println("Enter an option:_");
  System.out.println("=====================");
//print the first menu on console
  Scanner reader=new Scanner(System.in);
//define a scanner to read the user's option
  int i;
//define an integer to store the number which the user input
  String select=reader.next();
//define a string variable to see whether the input is an Integer
  while(true) {
	try {i=Integer.parseInt(select);
	break;}
//if "s" is an integer so "i"="s"
  catch(Exception e) {
	System.out.println("Please give a number!");
	System.out.println("1.List everyone");
	System.out.println("2.Select a person");
	System.out.println("3.Add a New person");
	System.out.println("Enter an option:_");
	select=reader.next();
}
//if "s" is not an integer the system will run again and waiting for new input
}

  if(i==1) {
	for(int j=0;j<nameList.nameToSelect.size();j++) {
	System.out.println(j+".Name:"+nameList.GetName(j)+" Age:"+ageList.GetAge(j)+" Status:"+statusesList.GetStatus(j));
	}
  }
  if(i==2) {
	for(int j=0;j<nameList.nameToSelect.size();j++) {
		System.out.println(j+".Name:"+nameList.GetName(j)+" Age:"+ageList.GetAge(j)+" Status:"+statusesList.GetStatus(j));
		}
	System.out.println("Please enter the name of the person you want to select :_");
	Scanner reader2a=new Scanner(System.in);
	String x=reader2a.next();
	int y=nameList.FindName(x);
	int imageNo=imageList.GetImage(y);
	if(imageNo==1) {
	System.out.println(" -----------------------------------------");
	System.out.println("|           0                0            |");
	System.out.println("|          0  0            0  0           |");
	System.out.println("|         0 --  0-0-0-0-0-0 -- 0          |");
	System.out.println("|        0                      0         |");
	System.out.println("|        0                      0         |");
	System.out.println("|        0     (0)      (0)     0         |");
	System.out.println("|        0     _____(0)_____    0         |");
	System.out.println("|         0     ____ | ____    0          |");
	System.out.println("|          0         W        0           |");
	System.out.println("|            0              0             |");
	System.out.println("|               0 0 0 0 0 0               |");
	System.out.println(" -----------------------------------------");
	System.out.println(" Name:"+nameList.GetName(y)+" Age:"+ageList.GetAge(y)+" Status:"+statusesList.GetStatus(y));
	System.out.println(" -----------------------------------------");
	System.out.println("what you want to do with "+nameList.GetName(y)+"?");
	System.out.println("1.set status");
	System.out.println("2.delete this person");
	System.out.println("3.see this person's parents");
	System.out.println("4.see this person's children");
	System.out.println("5.see this person's friends");
	System.out.println("6.Add a friend for selected person");
	System.out.println("7.Add parents for selected person");
	System.out.println("8.change profile picture");
	System.out.println("Please Enter the number of your option:_");
	}
	else {
	   if(imageNo==2) {	
	   System.out.println(" -----------------------------------------");
	   System.out.println("|                 0-0-0                    |");
	   System.out.println("|              0         0                 |");
	   System.out.println("|           0               0              |");
	   System.out.println("|         0  0             0 0             |");
	   System.out.println("|        0  0 (0)       (0) 0  0           |");
	   System.out.println("|       0   0   ---(0)---   0   0          |");
	   System.out.println("|     0      0      0      0      0        |");
	   System.out.println("|      0      0 0 0   0 0 0      0         |");
	   System.out.println("|       0 0 0   0 | | |  0   0 0 0         |");
	   System.out.println("|                 | | |                    |");
	   System.out.println("|                  _ _                     |");
	   System.out.println(" -----------------------------------------");
	   System.out.println(" Name:"+nameList.GetName(y)+" Age:"+ageList.GetAge(y)+" Status:"+statusesList.GetStatus(y));
	   System.out.println(" -----------------------------------------");
	   System.out.println("what you want to do with "+nameList.GetName(y)+"?");
	   System.out.println("1.set status");
	   System.out.println("2.delete this person");
	   System.out.println("3.see this person's parents");
	   System.out.println("4.see this person's children");
	   System.out.println("5.see this person's friends");
	   System.out.println("6.Add a friend for selected person");
	   System.out.println("7.Add parents for selected person");
	   System.out.println("Please Enter the number of abave options:_");
	   }
		else {
			System.out.println(nameList.GetName(y)+" did not pick a profile picture");
			System.out.println("-------------------------------------");
			System.out.println(" Name:"+nameList.GetName(y)+" Age:"+ageList.GetAge(y)+" Status:"+statusesList.GetStatus(y));
			System.out.println("-------------------------------------");
			System.out.println("what you want to do with "+nameList.GetName(y)+"?");
			System.out.println("1.set status");
			System.out.println("2.delete this person");
			System.out.println("3.see this person's parents");
			System.out.println("4.see this person's children");
			System.out.println("5.see this person's friends");
			System.out.println("6.Add a friend for selected person");
			System.out.println("7.Add parents for selected person");
			System.out.println("Please Enter the number of abave options:_");
		}
	}
	Scanner reader2b=new Scanner(System.in);
	int z=reader2b.nextInt();
	  if(z==1) {
	     System.out.println("please enter the new status:_");
	     Scanner newStatus=new Scanner(System.in);
	     String s=newStatus.next();
	     statusesList.ChangeStatus(y,s);
	     System.out.println(nameList.GetName(y)+"'s status has been changed successfully!");
	     System.out.println(y+".Name:"+nameList.GetName(y)+" Age:"+ageList.GetAge(y)+" Status:"+s);
	     /**newStatus.close();**/
	}
	  if(z==2) {
		System.out.println(nameList.GetName(y)+" is no longer in this system !");
		nameList.DeleteName(y);
		ageList.DeleteAge(y);
		statusesList.DeleteStatus(y);
		for(int j=0;j<nameList.nameToSelect.size();j++) {
			System.out.println(j+".Name:"+nameList.GetName(j)+" Age:"+ageList.GetAge(j)+" Status:"+statusesList.GetStatus(j));
			}
	}
	  if(z==3) {
		String[] parentsTest=parentsList.GetParents(y);//set up a array variable to check whether the person's parents are null
	    if(parentsTest[0]!= null) {
	    	System.out.println(nameList.GetName(y)+"'s "+"parents are : "+Arrays.toString(parentsList.GetParents(y)));
	    }
		else
		System.out.println(nameList.GetName(y)+"'s "+"parents are not in this system");
	}
	  if(z==4) {
		String[] childrenTest=childrenList.GetChildren(y);//set up a variable to check whether the person's children are null
	    if(childrenTest[0]!= null) {
	      	System.out.println(nameList.GetName(y)+"'s "+"children are : ");
	      	int t=0;
	    	    while(true) {
	    	    	System.out.println(childrenTest[t]);
	    	    	t++;
	    	    	if(childrenTest[t]==null) {
	    	    		break;
	    	    	}
	    	    }
	    }
		else
		System.out.println(nameList.GetName(y)+"'s "+"children are not in this system");
	}
	  if(z==5) {
		String[] friendsTest=friendsList.GetFriends(y);//set up a variable to check whether the person's friends are null
	    if(friendsTest[0]!= null) {
	      	System.out.println(nameList.GetName(y)+"'s "+"friends are : ");
	      	int t=0;
	    	    while(true) {
	    	    	System.out.println(friendsTest[t]);
	    	    	t++;
	    	    	if(friendsTest[t]==null) {
	    	    		break;
	    	    	}
	    	    }
	    }
		else
		   System.out.println(nameList.GetName(y)+" do not have any friend in this system");
	}
	  if(z==6) {
		System.out.println("Please enter the Person's name:_");
		Scanner readerF=new Scanner(System.in);
		String f=readerF.next();
		int fId=nameList.FindName(f);
		String a=friendsList.GetFriends(fId)+nameList.GetName(y);
		String b=friendsList.GetFriends(y)+f;
		friendsList.ChangeFriends(fId,a);
		friendsList.ChangeFriends(y, b);
		System.out.println(nameList.GetName(y)+"'s and "+nameList.GetName(fId)+"'s friends list has been updated !");
		System.out.println(nameList.GetName(y)+"'s "+"friends are : "+Arrays.toString(friendsList.GetFriends(y)));
     	System.out.println(nameList.GetName(fId)+"'s "+"friends are : "+Arrays.toString(friendsList.GetFriends(fId)));
	}
	  if(z==7) {
			System.out.println("Please enter the name of the person's father(the father must exist in the system) :_");
			Scanner addNewParents1=new Scanner(System.in);
			String giveNewParents1=addNewParents1.next();
			System.out.println("Please enter the name of the person's mother(the mother must exist in the system) :_");
			Scanner addNewParents2=new Scanner(System.in);
			String giveNewParents2=addNewParents2.next();
			parentsList.GiveNewParents(y,giveNewParents1,giveNewParents2);
	      	System.out.println(nameList.GetName(y)+"'s "+"parents are : "+parentsList.GetParents(y));
			/**addNewParents1.close();
			addNewParents2.close();**/
	  }
	  if(z==8) {
			System.out.println("Profile Picture 1 :");
			System.out.println(" -----------------------------------------");
			System.out.println("|           0                0            |");
			System.out.println("|          0  0            0  0           |");
			System.out.println("|         0 --  0-0-0-0-0-0 -- 0          |");
			System.out.println("|        0                      0         |");
			System.out.println("|        0                      0         |");
			System.out.println("|        0     (0)      (0)     0         |");
			System.out.println("|        0     _____(0)_____    0         |");
			System.out.println("|         0     ____ | ____    0          |");
			System.out.println("|          0         W        0           |");
			System.out.println("|            0              0             |");
			System.out.println("|               0 0 0 0 0 0         Cat   |");
			System.out.println(" -----------------------------------------");
			System.out.println("Profile Picture 2 :");
			System.out.println(" -----------------------------------------");
			System.out.println("|                 0-0-0                    |");
			System.out.println("|              0         0                 |");
			System.out.println("|           0               0              |");
			System.out.println("|         0  0             0 0             |");
			System.out.println("|        0  0 (0)       (0) 0  0           |");
			System.out.println("|       0   0   ---(0)---   0   0          |");
			System.out.println("|     0      0      0      0      0        |");
			System.out.println("|      0      0 0 0   0 0 0      0         |");
			System.out.println("|       0 0 0   0 | | |  0   0 0 0         |");
			System.out.println("|                 | | |                    |");
			System.out.println("|                  _ _              Dog    |");
			System.out.println(" -----------------------------------------");
			System.out.println("Please pick a profile picture to display :_");
			Scanner setNewImage2=new Scanner(System.in);
			int newImage2=setNewImage2.nextInt();
			imageList.ChangeImage(y,newImage2);
			imageNo=newImage2;
			if(imageNo==1) {
				System.out.println(" -----------------------------------------");
				System.out.println("|           0                0            |");
				System.out.println("|          0  0            0  0           |");
				System.out.println("|         0 --  0-0-0-0-0-0 -- 0          |");
				System.out.println("|        0                      0         |");
				System.out.println("|        0                      0         |");
				System.out.println("|        0     (0)      (0)     0         |");
				System.out.println("|        0     _____(0)_____    0         |");
				System.out.println("|         0     ____ | ____    0          |");
				System.out.println("|          0         W        0           |");
				System.out.println("|            0              0             |");
				System.out.println("|               0 0 0 0 0 0               |");
				System.out.println(" -----------------------------------------");
				System.out.println(" Name:"+nameList.GetName(y)+" Age:"+ageList.GetAge(y)+" Status:"+statusesList.GetStatus(y));
				System.out.println(" -----------------------------------------");
				}
				else {
				   if(imageNo==2) {	
				   System.out.println(" -----------------------------------------");
				   System.out.println("|                 0-0-0                    |");
				   System.out.println("|              0         0                 |");
				   System.out.println("|           0               0              |");
				   System.out.println("|         0  0             0 0             |");
				   System.out.println("|        0  0 (0)       (0) 0  0           |");
				   System.out.println("|       0   0   ---(0)---   0   0          |");
				   System.out.println("|     0      0      0      0      0        |");
				   System.out.println("|      0      0 0 0   0 0 0      0         |");
				   System.out.println("|       0 0 0   0 | | |  0   0 0 0         |");
				   System.out.println("|                 | | |                    |");
				   System.out.println("|                  _ _                     |");
				   System.out.println(" -----------------------------------------");
				   System.out.println(" Name:"+nameList.GetName(y)+" Age:"+ageList.GetAge(y)+" Status:"+statusesList.GetStatus(y));
				   System.out.println(" -----------------------------------------");
				   }
					else {
						System.out.println(nameList.GetName(y)+" did not pick a profile picture");
						System.out.println("-------------------------------------");
						System.out.println(" Name:"+nameList.GetName(y)+" Age:"+ageList.GetAge(y)+" Status:"+statusesList.GetStatus(y));
						System.out.println("-------------------------------------");
					}
				}
			   System.out.println(nameList.GetName(y)+"'s"+"profile picture has been changed successfully !");
	  }
	/**reader2b.close();**/
  }
  if(i==3) {
	//Ask the User to input the name
	System.out.println("Please enter the new person's name :_");
	Scanner setNewName=new Scanner(System.in);
	String newName=setNewName.next();
	nameList.AddNewName(newName);
	//Ask the User to input the name
	System.out.println("Please enter the new person's age :_");
	Scanner setNewAge=new Scanner(System.in);
	int newAge=setNewAge.nextInt();
	ageList.AddNewAge(newAge);
	//Ask the User to input the status
	System.out.println("Profile Picture 1 :");
	System.out.println(" -----------------------------------------");
	System.out.println("|           0                0            |");
	System.out.println("|          0  0            0  0           |");
	System.out.println("|         0 --  0-0-0-0-0-0 -- 0          |");
	System.out.println("|        0                      0         |");
	System.out.println("|        0                      0         |");
	System.out.println("|        0     (0)      (0)     0         |");
	System.out.println("|        0     _____(0)_____    0         |");
	System.out.println("|         0     ____ | ____    0          |");
	System.out.println("|          0         W        0           |");
	System.out.println("|            0              0             |");
	System.out.println("|               0 0 0 0 0 0         Cat   |");
	System.out.println(" -----------------------------------------");
	System.out.println("Profile Picture 2 :");
	System.out.println(" -----------------------------------------");
	System.out.println("|                 0-0-0                    |");
	System.out.println("|              0         0                 |");
	System.out.println("|           0               0              |");
	System.out.println("|         0  0             0 0             |");
	System.out.println("|        0  0 (0)       (0) 0  0           |");
	System.out.println("|       0   0   ---(0)---   0   0          |");
	System.out.println("|     0      0      0      0      0        |");
	System.out.println("|      0      0 0 0   0 0 0      0         |");
	System.out.println("|       0 0 0   0 | | |  0   0 0 0         |");
	System.out.println("|                 | | |                    |");
	System.out.println("|                  _ _              Dog    |");
	System.out.println(" -----------------------------------------");
	System.out.println("Please pick a profile picture to display :_");
	Scanner setNewImage=new Scanner(System.in);
	int newImage=setNewImage.nextInt();
	imageList.AddNewImage(newImage);
	//Ask the User to choose the profile picture
	System.out.println("Please enter the new person's status :_");
	Scanner setNewStatus=new Scanner(System.in);
	String newStatus=setNewStatus.next();
	statusesList.AddNewStatus(newStatus);
	//Ask the User to input the names of the person's parents
	System.out.println("Please enter the name of the new person's father :_");
	Scanner setNewParents1=new Scanner(System.in);
	String newParents1=setNewParents1.next();
	System.out.println("Please enter the name of the new person's mother :_");
	Scanner setNewParents2=new Scanner(System.in);
	String newParents2=setNewParents2.next();
	parentsList.AddNewParents(newParents1,newParents2);
	//Ask the User to input the names of the person's children
	System.out.println("Please enter the new person's children :_");
	Scanner setNewChildren=new Scanner(System.in);
	String newChildren=setNewChildren.next();
	childrenList.AddNewChildren(newChildren);
	//Ask the User to input the names of friends
	System.out.println("Please enter the new person's friends :_");
	Scanner setNewFriends=new Scanner(System.in);
	String newFriends=setNewFriends.next();
	friendsList.AddNewFriends(newFriends);
	System.out.println("the new person has been added sucessfully!");
	for(int j=0;j<nameList.nameToSelect.size();j++) {
		System.out.println(j+".Name:"+nameList.GetName(j)+" Age:"+ageList.GetAge(j)+" Status:"+statusesList.GetStatus(j));
		}
   }
  if(i==4) {
	p=1;
	//now the condition statement variable "p" is no longer 0, the system will stop looping
  }
}
}
}

