package com.malini;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	String[] language = {"Jave","Python","Anuglar"};
	method1(language);
	method2(language);
	method3(language);
	method4(language);
	method5(language);
    }
    public static void method1(String[] language){
        System.out.println(Arrays.toString(language));
    }
    public static void method2(String[] language){
        List<String> alist = Arrays.asList(language);
        System.out.println(alist);
    }
    public static void method3(String[] language){
        String joinedString = String.join(",",language);
        System.out.println(joinedString);
    }
    public static void method4(String[] language){
        Arrays.asList(language).stream().forEach(s->System.out.print(s+" "));
        System.out.println();
    }
    public static void method5(String[] language){
        for (String s :language){
            System.out.print(s+" ");
        }
    }
}
