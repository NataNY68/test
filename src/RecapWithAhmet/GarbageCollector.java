package RecapWithAhmet;

public class GarbageCollector {

    /*
    POSSIBLE INTERVIEW QUESTION

    1-What is garbage collector and where is it coming from?

    Garbage Collection --> It is a way to clean up useless/unused data from the memory.
    Otherwise, it will take some space in your memory and will cause low memory error. Primitives --> stack Object--> Heap

    System.gc() -->  It is coming from System class, and gc() method is static, as we call it using class method.

    2-How can you prove that GC is working?

    To be able to prove that GC is working I override finalize method from Object Class.(
    Object class is a parent of every class)

    3-How can you make the element garbage?

    --> You can assign the value 'null'
    --> You can assign the reference with another value
    int a =5
    int b=3;
    b=a;

    4-Do you have to call GC to clean up your codes
    No, you do not have to call GC since it is working automatically

     */

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        System.gc();

    }
}
