class CharPattern1{
public static void main(String []args){
int row = 5;
int star = 1;
char alph ='A';
for(int i = 1;i<=row;i++){
for(int j =1;j<=star;j++){
System.out.print(alph+" ");
}
System.out.println();
alph++;
star++;
}
}
}