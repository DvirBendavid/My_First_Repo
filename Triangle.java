class Triangle{
public static void main(String args[]){
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
int c = Integer.parseInt(args[2]);
boolean IsTriangle = ((a+b) >= c && (a+c) >= b && (b+c) >= a);
System.out.println(a +", " + b + ", " + c +": " + IsTriangle);

}}
