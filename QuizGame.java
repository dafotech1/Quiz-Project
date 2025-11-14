import java.util.Arrays;
import java.util.Scanner;

public class  QuizGame{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //could possibly add bonus points to some of these questions if answers are more specific.
        Question[] physicsQuestions = QuestionBank.getPhysicsQuestions();
        Question[] mathsQuestions = QuestionBank.getMathsQuestions();
        Question[] geographyQuestions = QuestionBank.getGeographyQuestions();
        Question[] generalQuestions = QuestionBank.getGeneralQuestions();
        boolean continueProgram = true;

        while (continueProgram) {

        System.out.println("""
                === WELCOME TO DAVID AFOLAYAN'S QUIZ GAME ===

                Choose one of the following 4 categories!

                1. Physics
                2. Maths
                3. Geography
                4. General Knowledge
                """);

        boolean  invalidAnswer = true;
        Question selectedCategory[] = null;
        int score = 0;
        

        while (invalidAnswer) {
        
        String categoryChoice = scanner.nextLine();
        
        

        if (categoryChoice.equals("Physics") || categoryChoice.equals("1")) {
            selectedCategory = physicsQuestions;
            invalidAnswer = false;
            System.out.println("You have selected Physics as your category of choice.");
        }
        
        else if (categoryChoice.equals("Maths") || categoryChoice.equals("2")) {
            selectedCategory = mathsQuestions;
            invalidAnswer = false;
            System.out.println("You have selected Maths as your category of choice.");
        }

        else if (categoryChoice.equals("Geography") || categoryChoice.equals("3")) {
            selectedCategory = geographyQuestions;
            invalidAnswer = false;
            System.out.println("You have selected Geography as your category of choice.");
        }

        else if (categoryChoice.equals("General Knowledge") || categoryChoice.equals("4")){
            selectedCategory = generalQuestions;
            invalidAnswer = false;
            System.out.println("You have selected General Knowledge as your category of choice.");
        }

        else {
            System.out.println("Invalid answer... please enter either the category name or number. ");
        }

    }

        System.out.println("=== The Quiz is now starting!!! ===");

        for (Question q : selectedCategory) {
            System.out.println(q.getQuestionText());
            String userAnswer = scanner.nextLine();

            if (q.checkAnswer(userAnswer)) {
                System.out.println(userAnswer + " is the correct answer!");
                score++;
                System.out.println("Your score now is " + score + " points.");
            }
            else {
                System.out.println("Your answer is incorrect :( The correct answer was " + q.getAnswer());
                System.out.println("Your score remains " + score + " points.");
            }
        }

        System.out.println("You have reached the end of the quiz. Your final score was " + score + " points.");
        System.out.print("Would you like to select another category or exit the quiz. Please enter 'continue' or 'exit'");


        boolean invalidEndChoice = true;

        while (invalidEndChoice) {

        String continuationChoice = scanner.nextLine();

        if (continuationChoice.equalsIgnoreCase("Continue")) {
            System.out.println("You have selected to continue. Quiz restarting... ");
            invalidEndChoice = false;
        }

        else if (continuationChoice.equalsIgnoreCase("Exit")) {
            System.out.println("Thanks for playing! Exiting Quiz...");
            continueProgram = false;
            invalidEndChoice = false;
        }

        else {
        System.out.println("Please enter a valid answer");
        }
        }
    }

    }
}


