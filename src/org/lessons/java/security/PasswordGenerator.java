package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String strName = in.nextLine();
		
		System.out.print("Cognome: ");
		String strSurname = in.nextLine();
		
		System.out.print("Colore preferito: ");
		String strFavoriteColor = in.nextLine();
		
		System.out.print("Giorno di nascita: ");
		String strDayOfBirth = in.nextLine();
		int intDayOfBirth = Integer.valueOf(strDayOfBirth);
		
		System.out.print("Mese di nascita: ");
		String strMonthOfBirth = in.nextLine();
		int intMonthOfBirth = Integer.valueOf(strMonthOfBirth);
		
		System.out.print("Anno di nascita: ");
		String strYearOfBirth = in.nextLine();
		int intYearOfBirth = Integer.valueOf(strYearOfBirth);
		
		
		in.close();
		
		
		String password = strName + "-" + strSurname + "-" + strFavoriteColor + "-" + intDayOfBirth + "-" + intMonthOfBirth + "-" + intYearOfBirth;
		
		System.out.println(password);
	}
}
