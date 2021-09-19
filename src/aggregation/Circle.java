/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aggregation;

/**
 *
 * @author HoangTN
 */
public class Circle {

    Operation op;//aggregation  
    double pi = (double) 3.14;
    double area(int radius) {
        op = new Operation();
        int rsquare = op.square(radius);//code reusability (i.e. delegates the method call).  
        return pi * rsquare;

    }
}
