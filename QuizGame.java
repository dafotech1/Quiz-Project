import java.util.Arrays;
import java.util.Scanner;

public class  QuizGame{
    private static Scanner scanner = new Scanner(System.in);
    private static int score = 0;

    public static void main(String[] args) {

        //could possibly add bonus points to some of these questions if answers are more specific.
        Question[] physicsQuestions = QuestionBank.getPhysicsQuestions();
        Question[] mathsQuestions = QuestionBank.getMathsQuestions();
        Question[] geographyQuestions = QuestionBank.getGeographyQuestions();
        Question[] generalQuestions = QuestionBank.getGeneralQuestions();

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
        

        while (invalidAnswer) {
        
        String categoryChoice = scanner.nextLine();
        
        

        if (categoryChoice.equals("Physics") || categoryChoice.equals("1")) {
            selectedCategory = physicsQuestions;
            invalidAnswer = false;
            System.out.println("You have selected " + categoryChoice + " as your category of choice.");
        }
        
        else if (categoryChoice.equals("Maths") || categoryChoice.equals("2")) {
            selectedCategory = mathsQuestions;
            invalidAnswer = false;
            System.out.println("You have selected " + categoryChoice + " as your category of choice.");
        }

        else if (categoryChoice.equals("Geography") || categoryChoice.equals("3")) {
            selectedCategory = geographyQuestions;
            invalidAnswer = false;
            System.out.println("You have selected " + categoryChoice + " as your category of choice.");
        }

        else if (categoryChoice.equals("General Knowledge") || categoryChoice.equals("4")){
            selectedCategory = generalQuestions;
            invalidAnswer = false;
            System.out.println("You have selected " + categoryChoice + " as your category of choice.");
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
    }
}


