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
		nameList.addName();
		ageList.addAge();
		imageList.addImage();
		statusesList.addStatus();
		parentsList.addParents();
		childrenList.addChildren();
		friendsList.addFriends();
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
  System.out.println("4.Delet a person");
  System.out.println("5.Are these two friends?");
  System.out.println("6.Exit");
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
	System.out.println("Please give a integer number!");
	  System.out.println("=====================");
	  System.out.println("Welcome to MiniNet !");
	  System.out.println("1.List everyone");
	  System.out.println("2.Select a person");
	  System.out.println("3.Add a New person");
	  System.out.println("4.Delet a person");
	  System.out.println("6.Exit");
	  System.out.println("Enter an option:_");
	  System.out.println("=====================");
	select=reader.next();
}
//if "s" is not an integer the system will run again and waiting for new input
}

  if(i==1) {
	for(int j=0;j<nameList.nameToSelect.size();j++) {
	System.out.println(j+".Name:"+nameList.getNameFromList(j)+" Age:"+ageList.getAgeFromList(j)+" Status:"+statusesList.getStatusFromList(j));
	}
  }
  if(i==2) {
	for(int j=0;j<nameList.nameToSelect.size();j++) {
		System.out.println(j+".Name:"+nameList.getNameFromList(j)+" Age:"+ageList.getAgeFromList(j)+" Status:"+statusesList.getStatusFromList(j));
		}
	System.out.println("Please enter the name of the person you want to select :_");
	Scanner reader2a=new Scanner(System.in);
	String x=reader2a.next();
	int y=nameList.findName(x);
	int imageNo=imageList.getImageFromList(y);
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
	System.out.println(" Name:"+nameList.getNameFromList(y)+" Age:"+ageList.getAgeFromList(y)+" Status:"+statusesList.getStatusFromList(y));
	System.out.println(" -----------------------------------------");
	System.out.println("what you want to do with "+nameList.getNameFromList(y)+"?");
	System.out.println("1.change/set status");
	System.out.println("2.change/set profile picture");
	System.out.println("3.see this person's parents");
	System.out.println("4.see this person's children");
	System.out.println("5.see this person's friends");
	System.out.println("6.Add a friend for the selected person");
	System.out.println("7.Add parents for the selected person");
	System.out.println("8.Add children for the selected person");
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
	   System.out.println(" Name:"+nameList.getNameFromList(y)+" Age:"+ageList.getAgeFromList(y)+" Status:"+statusesList.getStatusFromList(y));
	   System.out.println(" -----------------------------------------");
	   System.out.println("what you want to do with "+nameList.getNameFromList(y)+"?");
	   System.out.println("1.change/set status");
	   System.out.println("2.change/set profile picture");
	   System.out.println("3.see this person's parents");
	   System.out.println("4.see this person's children");
	   System.out.println("5.see this person's friends");
	   System.out.println("6.Add a friend for the selected person");
	   System.out.println("7.Add parents for the selected person");
	   System.out.println("8.Add children for the selected person");
	   System.out.println("Please Enter the number of abave options:_");
	   }
		else {
			System.out.println(nameList.getNameFromList(y)+" did not pick a profile picture");
			System.out.println("-------------------------------------");
			System.out.println(" Name:"+nameList.getNameFromList(y)+" Age:"+ageList.getAgeFromList(y)+" Status:"+statusesList.getStatusFromList(y));
			System.out.println("-------------------------------------");
			System.out.println("what you want to do with "+nameList.getNameFromList(y)+"?");
			System.out.println("1.change/set status");
			System.out.println("2.change/set profile picture");
			System.out.println("3.see this person's parents");
			System.out.println("4.see this person's children");
			System.out.println("5.see this person's friends");
			System.out.println("6.Add a friend for the selected person");
			System.out.println("7.Add parents for the selected person");
			System.out.println("8.Add children for the selected person");
			System.out.println("Please Enter the number of abave options:_");
		}
	}
	Scanner reader2b=new Scanner(System.in);
	int z=reader2b.nextInt();
	  if(z==1) {
	     System.out.println("please enter the new status:_");
	     Scanner newStatus=new Scanner(System.in);
	     String s=newStatus.next();
	     statusesList.changeStatus(y,s);
	     System.out.println(nameList.getNameFromList(y)+"'s status has been changed successfully!");
	     System.out.println(y+".Name:"+nameList.getNameFromList(y)+" Age:"+ageList.getAgeFromList(y)+" Status:"+statusesList.getStatusFromList(y));
	     /**newStatus.close();**/
	}
	  if(z==2) {
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
			imageList.changeImage(y,newImage2);
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
				System.out.println(" Name:"+nameList.getNameFromList(y)+" Age:"+ageList.getAgeFromList(y)+" Status:"+statusesList.getStatusFromList(y));
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
				   System.out.println(" Name:"+nameList.getNameFromList(y)+" Age:"+ageList.getAgeFromList(y)+" Status:"+statusesList.getStatusFromList(y));
				   System.out.println(" -----------------------------------------");
				   }
					else {
						System.out.println(nameList.getNameFromList(y)+" did not pick a profile picture");
						System.out.println("-------------------------------------");
						System.out.println(" Name:"+nameList.getNameFromList(y)+" Age:"+ageList.getAgeFromList(y)+" Status:"+statusesList.getStatusFromList(y));
						System.out.println("-------------------------------------");
					}
				}
			   System.out.println(nameList.getNameFromList(y)+"'s"+"profile picture has been changed successfully !");
	}
	  if(z==3) {
		String[] parentsTest=parentsList.getParentsFromList(y);//set up a array variable to check whether the person's parents are null
	    if(parentsTest[0]!= null) {
	    	System.out.println(nameList.getNameFromList(y)+"'s "+"parents are : "+Arrays.toString(parentsList.getParentsFromList(y)));
	    }
		else
		System.out.println(nameList.getNameFromList(y)+"'s "+"parents are not in this system");
	}
	  if(z==4) {
		String[] childrenTest=childrenList.getChildrenFromList(y);//set up a variable to check whether the person's children are null
	    if(childrenTest[0]!= null) {
	      	System.out.println(nameList.getNameFromList(y)+"'s "+"children are : ");
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
		System.out.println(nameList.getNameFromList(y)+"'s "+"children are not in this system");
	}
	  if(z==5) {
		String[] friendsTest=friendsList.getFriendsFromList(y);//set up a variable to check whether the person's friends are null
	    if(friendsTest[0]!= null) {
	      	System.out.println(nameList.getNameFromList(y)+"'s "+"friends are : ");
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
		   System.out.println(nameList.getNameFromList(y)+" do not have any friend in this system");
	}
	  if(z==6) {
		System.out.println("Please enter the new friends's name(the new friends must exist in the system):_");
		Scanner readerF=new Scanner(System.in);
		String f=readerF.next();
		int fId=nameList.findName(f);
		if(ageList.getAgeFromList(y)>=16) {
			if(ageList.getAgeFromList(fId)>=16) {
				friendsList.changeFriends(fId,nameList.getNameFromList(y));
				friendsList.changeFriends(y, f);
				System.out.println(nameList.getNameFromList(y)+"'s and "+nameList.getNameFromList(fId)+"'s friends list has been updated !");
			}else {
				System.out.println("A adult can not be a friend to a kid");
			}
		}else {
			if(ageList.getAgeFromList(y)<16&&ageList.getAgeFromList(y)>2){
				if(ageList.getAgeFromList(fId)>=16) {
					System.out.println("A adult can not be a friend to a kid");
				}else {
					if(ageList.getAgeFromList(fId)<16&&ageList.getAgeFromList(fId)>2){
						if(Math.abs(ageList.getAgeFromList(y)-ageList.getAgeFromList(fId))>3) {
							System.out.println("a kid can not be a friend of another kid who is 3 years younger/older");
						}else {
							String[] parentsCompare1=parentsList.getParentsFromList(y);
							String[] parentsCompare2=parentsList.getParentsFromList(fId);//compare those children's parents,check whether they are from same family
							String p10=parentsCompare1[0];
							String p20=parentsCompare2[0];
							String p21=parentsCompare2[1];
							if(p10.equals(p20)){
								System.out.println("when two young people want to be friends, they must from different family!");
							}else {
								if(p10.equals(p21)){
									System.out.println("when two young people want to be friends, they must from different family!");
								}else {
									friendsList.changeFriends(fId,nameList.getNameFromList(y));
									friendsList.changeFriends(y, f);
									System.out.println(nameList.getNameFromList(y)+"'s and "+nameList.getNameFromList(fId)+"'s friends list has been updated !");							
								}
							}
						}
					}else {
						System.out.println("the person you input is 2 years old or younger!");
					}
				}
			}else{
				System.out.println("the selected person is 2 years old or youger!");
			}
		}
	}
	  if(z==7) {
		  System.out.println("We have the function, but still, no children can be added into this system without parents existing");
		  System.out.println("***************************************************************************************************");
		  if(ageList.getAgeFromList(y)<16) {
				System.out.println("Please enter the name of the person's father(the father must exist in the system) :_");
				Scanner addNewParents1=new Scanner(System.in);
				String giveNewParents1=addNewParents1.next();
				System.out.println("Please enter the name of the person's mother(the mother must exist in the system) :_");
				Scanner addNewParents2=new Scanner(System.in);
				String giveNewParents2=addNewParents2.next();
				int father=nameList.findName(giveNewParents1);
				int mother=nameList.findName(giveNewParents2);//find where are the parents in the list
				childrenList.changeChildren(father, nameList.getNameFromList(y));
				childrenList.changeChildren(mother, nameList.getNameFromList(y));//add children name to both parents' children list
				parentsList.giveNewParents(y,giveNewParents1,giveNewParents2);
		      	System.out.println(nameList.getNameFromList(y)+"'s "+"parents are : "+parentsList.getParentsFromList(y));
		  }else {
			  System.out.println("only people who are under 16 are necessary to have parents in the system!");
		  }
	  }
	  if(z==8) {
		    System.out.println("We have the function, but still, no children can be added into this system without parents existing");
		    System.out.println("***************************************************************************************************");
			System.out.println("Enter the name of the kid's father/mother 's who is this person's wife/husband:_");
			System.out.println("(the father/mother must exist in the system)");
			Scanner addNewParents=new Scanner(System.in);
			String giveNewParents=addNewParents.next();
			System.out.println("Please enter the name of the kid(the kid must exist in the system) :_");
			Scanner addNewChildren=new Scanner(System.in);
			String giveNewChildren=addNewChildren.next();
			if(ageList.getAgeFromList(nameList.findName(giveNewChildren))<16) {
			int father=nameList.findName(giveNewParents);
			int mother=nameList.findName(nameList.getNameFromList(y));
			childrenList.changeChildren(father,giveNewChildren);
			childrenList.changeChildren(mother,giveNewChildren);//add children name to both parents' children list
			parentsList.giveNewParents(nameList.findName(giveNewChildren),giveNewParents,nameList.getNameFromList(y));	
			System.out.println("the children has been added successfully!");
			}else {
				System.out.println("the 'kid' you input is over 16 !");
			}
	  }
	/**reader2b.close();**/
  }
  if(i==3) {
	//Ask the User to input the name
	System.out.println("Please enter the new person's name :_");
	Scanner setNewName=new Scanner(System.in);
	String newName=setNewName.next();
	nameList.addNewName(newName);
	//Ask the User to input the name
	System.out.println("Please enter the new person's age :_");
	Scanner setNewAge=new Scanner(System.in);
	int newAge=setNewAge.nextInt();
	ageList.addNewAge(newAge);
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
	System.out.println("Please pick a profile picture to display(if not decide yet please give 0) :_");
	Scanner setNewImage=new Scanner(System.in);
	int newImage=setNewImage.nextInt();
	imageList.addNewImage(newImage);
	//Ask the User to choose the profile picture
	System.out.println("Please enter the new person's status(if not decide yet please give 'null'):_");
	Scanner setNewStatus=new Scanner(System.in);
	String newStatus=setNewStatus.next();
	statusesList.addNewStatus(newStatus);
    //as following, the new person will initialed with no friends,no parents,no children, but the user can add these relations later
	childrenList.addNewChildren(null);
	friendsList.addNewFriends(null);
	if(newAge<16) {
		System.out.println("The new person is under 16 years old, we must know who are his/her parents!");
		System.out.println("Please enter the name of the person's father(the father must exist in the system) :_");
		Scanner addNewParents1=new Scanner(System.in);
		String giveNewParents1=addNewParents1.next();
		System.out.println("Please enter the name of the person's mother(the mother must exist in the system) :_");
		Scanner addNewParents2=new Scanner(System.in);
		String giveNewParents2=addNewParents2.next();
		int father=nameList.findName(giveNewParents1);
		int mother=nameList.findName(giveNewParents2);//find where are the parents in the list
		parentsList.addNewParents(giveNewParents1,giveNewParents2);
		childrenList.changeChildren(father, newName);
		childrenList.changeChildren(mother, newName);//add children name to both parents' children list
	}else {
		parentsList.addNewParents(null,null);
	}
	System.out.println("the new person has been added sucessfully!");
	for(int j=0;j<nameList.nameToSelect.size();j++) {
		System.out.println(j+".Name:"+nameList.getNameFromList(j)+" Age:"+ageList.getAgeFromList(j)+" Status:"+statusesList.getStatusFromList(j));
		}
   }
  if(i==4) {
		System.out.println("Please enter the name of the person you want to delete :_");
		Scanner reader2a=new Scanner(System.in);
		String m=reader2a.next();
		int n=nameList.findName(m);
		int imageNo=imageList.getImageFromList(n);
		System.out.println(nameList.getNameFromList(n)+" is no longer in this system !");
		nameList.deleteName(n);
		ageList.deleteAge(n);
		statusesList.deleteStatus(n);
		imageList.deleteImage(n);
		friendsList.deleteFriends(n);
		parentsList.deleteParents(n);
		childrenList.deleteChildren(n);		
		for(int d=0;d<nameList.nameToSelect.size();d++) {
			System.out.println(d+".Name:"+nameList.getNameFromList(d)+" Age:"+ageList.getAgeFromList(d)+" Status:"+statusesList.getStatusFromList(d));
			}
  }
  if(i==5) {
	  System.out.println("=====================");
	  for(int j=0;j<nameList.nameToSelect.size();j++) {
			System.out.println(j+".Name:"+nameList.getNameFromList(j));
			}
	  System.out.println("=====================");
	  System.out.println("please give the name of the person one(person one must exist in the system):_");
	  Scanner person1=new Scanner(System.in);
	  String friendsTest1=person1.next();
	  System.out.println("please give the name of the person two(person two must exist in the system):_");
	  Scanner person2=new Scanner(System.in);
	  String friendsTest2=person2.next();
	  int ft2=nameList.findName(friendsTest2);
	  String[] friendsList2=friendsList.getFriendsFromList(ft2);
	  boolean directFriends=false;
	  for(int ft=0;ft<friendsList2.length;ft++) {
		  if(friendsTest1.equals(friendsList2[ft])) {
			  directFriends=true;
			  }
	  }
	  if(directFriends) {
			  System.out.println(friendsTest1+" and "+friendsTest2+" are direct friends!");
		  }else {
			  System.out.println(friendsTest1+" and "+friendsTest2+" are not direct friends!");
		  }
  }
  if(i==6) {
	p=1;
	//now the condition statement variable "p" is no longer 0, the system will stop looping
  }
}
}
}

