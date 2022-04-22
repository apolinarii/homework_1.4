package com.company;

public class Main {

    public static void main(String[] args){
        int i = 1;
        while (i <= 10) {
            System.out.println(i++);
        }
        for (int a = 10; a >= 0; a--){
            System.out.println(a);
        }
        int friday = 4;

        for (friday = friday; friday <= 31; friday = friday + 7) {

            if (friday < 1 && friday > 7) {
                System.out.print("Mistake - Friday must be in the first seven days");
            }
            System.out.println("Today is Friday " + friday + " day of the month. It's time to submit a report");

        }
        int lastCentury = 1822;
        int nextCentury = 2122;
        for (int comet = 0; comet <= nextCentury; comet +=79){
            if (comet >= lastCentury && comet <= nextCentury);{
                System.out.println(comet);
            }
        }

    }

    }


