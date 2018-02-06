//Maurice Hanns CSC 242 02/06/2018

import java.util.Scanner;

public class aboutClass {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
	 
		System.out.println("Please enter the countys name: ");
		String cntyNM = input.nextLine();

		System.out.println("Please enter the countys population: ");
		double cntyPOP = input.nextDouble();

		System.out.println("Please enter the countys land volume: ");
		double lndVOL = input.nextDouble();

		System.out.println("Please enter the year the county was established: ");
		int yrCNTY = input.nextInt();

		County county = new County(cntyNM, cntyPOP, lndVOL, yrCNTY);

		System.out.println(county.CountyName + ", "+ county.CountyPopulation + ", "+ county.landVolume + ", "+ county.yearCounty);
		


	}
}
