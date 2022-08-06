class Functions{
 String name;
 int dial;
public  void ringing(){
System.out.println(name+" call to your "+dial);
System.out.println("your phoone is ringing");
 }
void vibrating(){
System.out.println("your cell phone is virbrating "+name);
  }
}

class Cellphone{

public static void main(String []args){

Functions fc = new Functions();
fc.name="Mukesh";
//fc.name="karan";
//fc.dial=8877;
fc.dial=9900;
fc.ringing();
fc.vibrating();
   }
}
