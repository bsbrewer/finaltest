package com.bsbrewer;

public class Main {
    // inch = 2.54cm
    public static void main(String[] args) {

        double score = calcFeetToInchesToCentimeters(2, 7);

        double score1 = calcFeetToInchesToCentimeters(33);


    }
    public static double calcFeetToInchesToCentimeters(double feet , double inches) {
        double sum = (feet * 12 + inches);
        double sum1 = sum * 2.54 ;

        if ((feet < 0 ) || (inches < 0)){
            System.out.println("did what it is suppose to do  ");
            return -1;
        } else {
            System.out.println("You have " + (int)feet + " feet and " + (int)inches + " inches  which equals " +  (int)sum + " inches "
            + sum1 + " in centemeters");
            return sum1;
        }
    }

    public static double calcFeetToInchesToCentimeters(double inches){
            double sum = (inches * 2.54);
            if ( inches < 0) {
                System.out.println(" not a valid num ");
                return -1;
            }else {
                System.out.println("You have " + (int) inches + " inches which equals " + (float)sum + " in centimeters");
                return sum;
            }
            }

    }





