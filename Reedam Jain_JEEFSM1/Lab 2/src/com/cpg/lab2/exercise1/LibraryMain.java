package com.cpg.lab2.exercise1;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		System.out.println("WELCOME TO LIBRARY MANAGEMENT SYSTEM");
		System.out.println("1. CHCECKIN");
		System.out.println("2. CHECKOUT");
		Scanner sc=new Scanner(System.in);
		int check=sc.nextInt();
		System.out.println("What you're looking for...");
		System.out.println("1. Book");
		System.out.println("2. Journals");
		System.out.println("3. Videos");
		System.out.println("4. CD");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1: 
			Book book=new Book();
			if(check==1)
				book.checkIn();
			else 
				book.checkOut();
			break;
		case 2 :
			JournalPaper journal=new JournalPaper();
			if(check==1)
				journal.checkIn();
			else 
				journal.checkOut();
			break;
		case 3:
			Video video=new Video();
			if(check==1)
				video.checkIn();
			else 
				video.checkOut();
			break;
		case 4:
			CD cd=new CD();
			if(check==1)
				cd.checkIn();
			else 
				cd.checkOut();
			break;
		default:
				System.out.println("Oooops wrong choice");
			 
		}

	}

}
