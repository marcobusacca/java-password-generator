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
		
		System.out.print("Mese di nascita: ");
		String strMonthOfBirth = in.nextLine();
		
		System.out.print("Anno di nascita: ");
		String strYearOfBirth = in.nextLine();
		
		
		String password = strName + "-" + strSurname + "-" + strFavoriteColor + "-" + strDayOfBirth + "-" + strMonthOfBirth + "-" + strYearOfBirth;
		
		System.out.println(password);
		
	}
}
