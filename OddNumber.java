class OddNumber{
public static void main(String []args){
int num = 1;
int a = 0;
int b = 1;
while(num<=50){
int c = a + b ;
System.out.print(c+" ");
a=c;
b++;
num++;
}
}
}