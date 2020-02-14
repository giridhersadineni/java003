package in.skillverse.finsta;

public class User{

public int userId;
public String name;
public String fatherName;
public String email;
public String phone;
public String address;

public User(int id,String name){
this.userId=id;
this.name=name;
}

public String[] getDetails(){
String arr[]=new String[2];
arr[0]=Integer.toString(this.userId);
arr[1]=this.name;
return arr;
}


}