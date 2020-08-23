package com.javapractice.generics;

// A Simple Java program to show multiple
// type parameters in Java Generics

// We use < > to specify Parameter type
class NewTest<T, U>
{
    T obj1; // An object of type T
    U obj2; // An object of type U

    // constructor
    NewTest(T obj1, U obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    // To print objects of T and U
    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

// Driver class to test above
class GenericExampleMultipleParameters
{
    public static void main (String[] args)
    {
        NewTest <String, Integer> obj =
                new NewTest<String, Integer>("GfG", 15);

        obj.print();
    }
}