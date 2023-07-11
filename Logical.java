class Logical{
public static void main(String []args){
boolean a=true;
boolean b=false;
System.out.println("AND result: " + (a && a));
System.out.println("OR result: " + (b || a));
System.out.println("AND result: " + (b && a));
System.out.println("AND result: " + (a && b));
System.out.println("OR result: " + (b || b));
System.out.println("AND result: " + (b && b));
System.out.println("OR result: " + (a || a));
System.out.println("OR result: " + (a || b));
}
}
