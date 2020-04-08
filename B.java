class B extends A{
int a,b;
void funB()
{
System.out.println("I am inside funB() of class B");
}
public static void main(String[] args)
{
B b1 = new B();
b1.i = 1;
b1.j = 5;
System.out.println(b1.i);
System.out.println(b1.j);
b1.funA();
}
}

