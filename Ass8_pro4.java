package com.index;

import java.util.Scanner;

public class Ass8_pro4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] matrix = new int[3][3];

		System.out.println("Enter the elements of the 3*3 matrix: ");
		
		for(int i=0; i<3; i++) {
			for(int j=0;j<3;j++) {
				matrix[i][j] = sc.nextInt();
			}
	}
		System.out.println("The output of the matrix is: ");
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(matrix[i][j]+ " ");
			}
		}
		sc.close();
		

}
}
