import java.util.Scanner;

public class  QuizGame{
    private static Scanner scanner = new Scanner(System.in);
    private static int score;

    public static void main(String[] args) {

        //could possibly add bonus points to some of these questions if answers are more specific.
        Question[] physicsQuestions = QuestionBank.getPhysicsQuestions();
        Question[] mathsQuestions = QuestionBank.getMathsQuestions();
        Question[] geographyQuestions = QuestionBank.getGeographyQuestions();
        Question[] generalQuestions = QuestionBank.getGeneralQuestions();


        System.out.println("=== WELCOME TO DAVID AFOLAYAN'S QUIZ GAME ===");
        System.out.println("Please select one of the following categories: Physics, Maths, Geography, General Knowledge");

        String categoryChoice = scanner.nextLine().toLowerCase();
        Question[] selectedCategory;

        if (categoryChoice.equals("Physics")) {
            selectedCategory = physicsQuestions;
        }
        
        else if (categoryChoice.equals("Maths")) {
            selectedCategory = mathsQuestions;
        }

        else if (categoryChoice.equals("Geography")) {
            selectedCategory = geographyQuestions;
        }

        else {
            selectedCategory = generalQuestions;
        }
        }
        

        };



