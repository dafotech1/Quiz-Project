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

        String categoryChoice = scanner.nextLine();
        Question[] selectedCategory;

        if (categoryChoice.equals("Physics")) {
            selectedCategory = physicsQuestions;
        }
        
        else if (categoryChoice.equals("Maths") ) {
            selectedCategory = mathsQuestions;
        }

        else if (categoryChoice.equals("Geography")) {
            selectedCategory = geographyQuestions;
        }

        else {
            selectedCategory = generalQuestions;
        }


        System.out.println("You have selected " + categoryChoice + " as your category of choice.");
        System.out.println("=== The Quiz is now starting!!! ===");

        for (Question q : selectedCategory) {
            System.out.println("Question " + q.getQuestionText());
            String userAnswer = scanner.nextLine();

            if (q.checkAnswer(userAnswer)) {
                System.out.println(userAnswer + " is the correct answer!");
                score++;
                System.out.println("Your score now is " + score + " points.");
            }
            else{
                System.out.println("Your answer is incorrect :(");
                System.out.println("Your score remains " + score + " points.");
            }
        }
    };
};


