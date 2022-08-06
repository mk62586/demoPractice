import java.util.*;

class ReverseNumber{

public static void main(String []args){
 Scanner sc = new Scanner(System.in);
int no = sc.nextInt();
int out =sc.nextInt();
while(no>0){
int rem =no%10;
out =out*10+rem;
no=no/10;
  }
System.out.println(out+" Reverse number");
  }
}
}
 
