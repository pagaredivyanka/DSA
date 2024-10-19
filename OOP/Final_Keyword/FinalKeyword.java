package Final;

/*
    The final Keyword in Java behaves differently when used with classes, methods, and variables.

    IMP - final keyword in Java :

    Once any data member (a variable, method, or class) gets declared as final, it can only be assigned once.
    The final variable cannot be reinitialized with another value.
    A final method cannot be overridden by another method.
    A final class cannot be extended or inherited by another child class.

*/

// can't assign value again to same variable

public class FinalKeyword {
    public static void main(String[] args) {
        final int num = 10;
        System.out.println(num); // prints 10

        // the following line will cause an error because num is final
        num = 20;     // ERROR ---> java: cannot assign a value to final variable num
    }
}
