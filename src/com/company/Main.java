package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	int x= scanner.nextInt();
	int r;
	for(r=1; r<=10; r++)


	System.out.println(r*x);
	scanner.close();

    }
}
