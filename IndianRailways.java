class Passenger{
String TrainName;
String name;
int age;
String price;
Passenger(String TrainName,String name,int age,String price){
this.TrainName=TrainName;
this.name=name;
this.age=age;
this.price=price;
System.out.println("Maurya Express Reserve Confirmation is done "+TrainName);
System.out.println("passenger name "+name);
System.out.println("Cost per passenger will take "+price);
}
 void cancel(){
 System.out.println("Sorry our plan to visit cancel "+name);
}
}
//System.out.println(

class IndianRailways{
public static void main(String []args){
System.out.println("Welcome to Indian Railways");
 Passenger pc = new Passenger("Maurya Express","Alex Lilly",32,"900RS");
pc.name="warner";
pc.cancel();
 }
}