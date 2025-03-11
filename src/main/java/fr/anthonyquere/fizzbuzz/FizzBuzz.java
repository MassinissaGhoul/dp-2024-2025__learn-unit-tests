package fr.anthonyquere.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public static List<String> startFizzBuzz(int count) {
        List<String> bueno = new ArrayList<>();
        if (count == 0){
            return bueno;
        }
        for (int i = 1; i <= count ; i++){
            if (i % 3 == 0 && i % 5 == 0 ){
                bueno.add("FizzBuzz");
            }
            else if(i % 3 == 0){
                bueno.add("Fizz");
            }
            else if(i % 5 == 0){
                bueno.add("Buzz");
            }else{
                bueno.add(String.valueOf(i));
                //System.out.println(i);

            }
        }
        return bueno;
    }
}
