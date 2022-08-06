class Square{
int side;
int square;
int permiter;
public void AreaOfSquare(){
System.out.println("find the area of square");
 square = side * side;
System.out.println("Area of sqaure "+square);
}

public void Permiter(){

System.out.println("Find permiter of square ");

permiter = 4*side;

System.out.println("permiter of sqaure "+permiter);
 
 }
}

class Mensuration{
 public static void main(String []args){

Square ar = new Square();
ar.side=20;
ar.AreaOfSquare();
ar.Permiter();

}
}

