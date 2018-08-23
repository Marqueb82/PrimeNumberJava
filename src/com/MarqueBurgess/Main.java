package com.MarqueBurgess;

public class Main {

    public static void main(String[] args) {

      //define limit for ints to check
      int n = 1000;

      // run from 1 to 999
      for(int i = 1; i < n; i++){

        //check if number is prime
        boolean isPrime = true;

        //start at 2 and check if prime
        for(int j = 2; j < i; j++){
          if(i % j == 0){
            isPrime = false;
            break;
          }
        }

        //print prime numbers
        if(isPrime){
          System.out.println(i + " is Prime");
        }
      }
    }
}
