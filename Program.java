class SquareT{
int side =10;
int a =20;
public int area(){
//System.out.println("Area of permiter");
return side * side;
}
public int permeter(){
return 4*a;
  }
}
class Rectangular{

public static int rect(int length,int breath){
return 2*(length * breath);
   }
}
class Program{
public static void main(String []args){

System.out.println(Rectangular.rect(5,6));
 SquareT sq = new SquareT();
  
 System.out.println(sq.area()+" area of sqaure");
System.out.println(sq.permeter()+" permieter of square");

 }
}

