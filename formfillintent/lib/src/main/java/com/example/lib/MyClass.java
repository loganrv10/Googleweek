package com.example.lib;

public class MyClass {
    public static void main(String[] args) {



        int [][] arrm = new int[3][3];
        arrm[0][0] = 11;
        arrm[0][1] = 22;
        arrm[0][2] = 33;

        arrm[1][0] = 10;
        arrm[1][1] = 20;
        arrm[1][2] = 30;


        arrm[2][0] = 40;
        arrm[2][1] = 50;
        arrm[2][2] = 60;


        for (int i =3 -1; i>=0; i--){
            for (int j = 3 -1; j>=0; j--){
                System.out.print(arrm[i][j]+ " ");

            }

        }

    }
}