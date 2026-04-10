package com.pluralsight;

public class App {
    public static void main(String[] args) {

       double circleRadius = 5.5;
       double rectangleLength = 8.5;
       double rectangleWidth = 3.7;
       double triangleBase = 6.0;
       double triangleHeight = 4.5;



     double circleArea = Math.PI * Math.pow(circleRadius,2);
     double circleCircum = Math.PI * circleArea;
     System.out.println("Area: "+Math.round(circleArea)+" square units\nCircumference:"+Math.round(circleCircum)+" untis\n");

    double rArea = rectangleLength * rectangleWidth;
    double rPerimeter = 2 * rectangleLength * rectangleWidth;
    System.out.println("Area: "+Math.round(rArea)+" square units\nPerimeter:"+Math.round(rPerimeter)+" units\n");

    double tArea = triangleBase * triangleHeight / 2;
    double tHypotenuse = Math.sqrt(Math.pow(triangleBase, 2) + Math.pow(triangleHeight, 2));
    System.out.println("Area :"+Math.round(tArea)+" square units\nHypotenuse: "+tHypotenuse+ " units\n");

    double totalArea = circleArea * rArea * tArea;
    System.out.printf("total area:" +Math.round(totalArea));






    }
}
