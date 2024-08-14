
package com.driver;

public class Main {
    public static void main(String[] args) {
        B obj = new B(); // Create an object of class B
        System.out.println(obj.meth()); // Call the overridden meth() from class B
        // Output: "Method is overridden in Extended class B"
    }
}
