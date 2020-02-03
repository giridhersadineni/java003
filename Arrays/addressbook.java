class Person{
    public String name;
    public String phone;
    public void show(){
        System.out.println("Name:"+this.name);
        System.out.println("Phone Number"+this.phone);
    }
}
class Addressbook{
    public static void main(String args[]) {
        Person students[]=new Person();
        students[0].name="Yashwanth";
        students[0].phone="9823234234";
        students[0].show();
    }


}