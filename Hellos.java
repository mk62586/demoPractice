interface A{

void m1();
}
class Hellos{
public static void main(String []args){

A a =()->System.out.println("Hello world");
a.m1();
