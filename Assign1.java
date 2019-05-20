
/** Author: Sean Murchison
 * Course: CST8110_301
 * Lab Professor: Anissa Shaddy
 * Assignment #1
 * February 1st, 2019
 *
 * Purpose: This program will prompt the user to enter their grades based on the semester.
 * The program will then calculate their theory, practical, and final grade.
 * Based on these marks, the program will determine if the user has passed or failed.
 */

//Import scanner and decimal format 
import java.text.DecimalFormat;
import java.util.Scanner;

public class Assign1 {

	public static void main(String[] args) {
		// Scanner to allow user input
		Scanner scanner = new Scanner(System.in);
		// Decimal format to format grades to 2 decimals
		DecimalFormat formatter = new DecimalFormat("##.##");

		// Initializing variables
		// Adding each grading section as double
		double labExercise = 0;
		double assignment = 0;
		double quiz = 0;
		double labFinal = 0;
		double midterm = 0;
		double finalExam = 0;
		double hybrid = 0;
		int i = 0;

		// Display a welcome message to the user with the name of program
		System.out.println("Welcome to the CST8110 Final Mark and Pass-Fail Calculator\n");

		// Prompt the user to enter their marks for each section

		// Lab exercise marks
		System.out.println("Enter your Lab exercise marks out of 10: ");
		labExercise = scanner.nextDouble();
		// Validate if marks are within boundary
		// if not, display error and exit program
		if (labExercise >= 0 && labExercise <= 10) {
			i++;
		} else {
			System.out.println("Invalid entry. Please enter grades within boundary.");
			// Exits program
			System.exit(0);
		}

		// Assignment marks
		System.out.println("Enter your Assignment marks out of 20: ");
		assignment = scanner.nextDouble();
		// Validate if marks are within boundary
		// if not, display error and exit program
		if (assignment >= 0 && assignment <= 20) {
			i++;
		} else {
			System.out.println("Invalid entry. Please enter grades within boundary.");
			// Exits program
			System.exit(0);
		}

		// Quiz marks
		System.out.println("Enter your Quiz marks out of 5: ");
		quiz = scanner.nextDouble();
		// Validate if marks are within boundary
		// if not, display error and exit program
		if (quiz >= 0 && quiz <= 5) {
			i++;
		} else {
			System.out.println("Invalid entry. Please enter grades within boundary.");
			// Exits program
			System.exit(0);
		}

		// Lab final marks
		System.out.println("Enter your Lab Final marks out of 10: ");
		labFinal = scanner.nextDouble();
		// Validate if marks are within boundary
		// if not, display error and exit program
		if (labFinal >= 0 && labFinal <= 10) {
			i++;
		} else {
			System.out.println("Invalid entry. Please enter grades within boundary.");
			// Exits program
			System.exit(0);
		}

		// Midterm marks
		System.out.println("Enter your Midterm marks out of 20: ");
		midterm = scanner.nextDouble();
		// Validate if marks are within boundary
		// if not, display error and exit program
		if (midterm >= 0 && midterm <= 20) {
			i++;
		} else {
			System.out.println("Invalid entry. Please enter grades within boundary.");
			// Exits program
			System.exit(0);
		}

		// Final exam marks
		System.out.println("Enter your Final Exam marks out of 30: ");
		finalExam = scanner.nextDouble();
		// Validate if marks are within boundary
		// if not, display error and exit program
		if (finalExam >= 0 && finalExam <= 30) {
			i++;
		} else {
			System.out.println("Invalid entry. Please enter grades within boundary.");
			// Exits program
			System.exit(0);
		}

		// Hybrid marks
		System.out.println("Enter your Hybrid marks out of 5: ");
		hybrid = scanner.nextDouble();
		// Validate if marks are within boundary
		// if not, display error and exit program
		if (hybrid >= 0 && hybrid <= 5) {
			i++;
		} else {
			System.out.println("Invalid entry. Please enter grades within boundary.");
			// Exits program
			System.exit(0);
		}

		// Calculate Theory, Practical, and Final Grade

		// Theory grade
		double theoryGrade = (quiz + labFinal + midterm + finalExam) / 65.00 * 100.00;

		// Practical grade
		double practicalGrade = (assignment + labExercise) / 30.00 * 100.00;

		// Final grade
		double finalGrade = (labExercise + assignment + quiz + labFinal + midterm + finalExam + hybrid);

		// Formatting marks into string with decimal format
		String formatTheoryGrade = formatter.format(theoryGrade);
		String formatPracticalGrade = formatter.format(practicalGrade);
		String formatFinalGrade = formatter.format(finalGrade);

		// Display Theory, Practical, and Final marks in percentage
		// Formatted to two decimals
		System.out.println("\nTheory grade: " + formatTheoryGrade + "%");
		System.out.println("Practical grade: " + formatPracticalGrade + "%");
		System.out.println("Final grade: " + formatFinalGrade + "%");

		// Determine if marks are equal to pass or fail
		// PASS: Theory grade and practical grade are greater or equal to 50
		// if not, FAIL
		if (theoryGrade >= 50 && practicalGrade >= 50) {
			System.out.println("Result = PASS");
		} else {
			System.out.println("Result = FAIL");
		}

	} // End of main

} // End of class
