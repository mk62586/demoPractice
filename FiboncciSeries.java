class FiboncciSeries{
public static void main(String []args){
int a = 1;
int b = 2;
int num = 1;
System.out.print(a+" "+b+" ");
while(num<10){
int c = a + b ;
System.out.print(c+" ");
a=b;
b=c;
num++;
        }
    }
}