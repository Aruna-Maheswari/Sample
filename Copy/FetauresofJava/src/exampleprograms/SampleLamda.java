package exampleprograms;
interface MyInterface1
{
     void abstract_func(int x,int y);
 
     default void default_Fun()
    {
         System.out.println("This is default method");
    }
}
 
class SampleLamda
{
     public static void main(String args[])
    {
        //lambda expression
        MyInterface1 fobj = ( x,  y)->System.out.println(x+y);
 
        System.out.print("The result = ");
        fobj.abstract_func(5,5);
        fobj.default_Fun();
    }
}

