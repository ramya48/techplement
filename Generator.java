package app;

import java.util.Scanner;

public class Generator {

	
		  public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        Quiz quiz = new Quiz();

		        while (true) {
		            System.out.println("1. Create a new question");
		            System.out.println("2. Take the quiz");
		            System.out.println("3. Exit");

		            int choice = scanner.nextInt();
		            scanner.nextLine(); // consume newline

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter the question: ");
		                    String questionText = scanner.nextLine();

		                    System.out.print("Enter number of options: ");
		                    int numOptions = scanner.nextInt();
		                    scanner.nextLine(); // consume newline

		                    String[] options = new String[numOptions];
		                    for (int i = 0; i < numOptions; i++) {
		                        System.out.print("Enter option " + (i + 1) + ": ");
		                        options[i] = scanner.nextLine();
		                    }

		                    System.out.print("Enter the correct option number: ");
		                    int correctOption = scanner.nextInt();
		                    scanner.nextLine(); // consume newline

		                    Question question = new Question(questionText, options, correctOption);
		                    quiz.addQuestion(question);
		                    break;

		                case 2:
		                    int score = 0;
		                    for (Question q : quiz.getQuestions()) {
		                        System.out.println(q.getQuestionText());
		                        for (int i = 0; i < q.getOptions().length; i++) {
		                            System.out.println((i + 1) + ". " + q.getOptions()[i]);
		                        }
		                        System.out.print("Your answer: ");
		                        int answer = scanner.nextInt();
		                        if (answer == q.getCorrectOption()) {
		                            score++;
		                        }
		                    }
		                    System.out.println("Your score: " + score);
		                    break;

		                case 3:
		                    scanner.close();
		                    return;

		                default:
		                    System.out.println("Invalid choice. Try again.");
		            }
		        }
		    }
		}