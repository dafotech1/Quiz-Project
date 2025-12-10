import java.util.Scanner;

//QuizGame is the main class that runs the actual quiz, handling the menu, category selection, outputting the questions and tracking the user's score
public class  QuizGame{

    //Created a scanner declared outside my main so only one Scanner instance exists and not multiple everytime my program loops. 
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Loads the questions from QuestionBank.java and assigns them as Question variables in the main program.
        Question[] physicsQuestions = QuestionBank.getPhysicsQuestions();
        Question[] mathsQuestions = QuestionBank.getMathsQuestions();
        Question[] geographyQuestions = QuestionBank.getGeographyQuestions();
        Question[] generalQuestions = QuestionBank.getGeneralQuestions();

        // While loop for the main logic to allow the user to either continue the Quiz (select another category) or exit the program when they complete the quiz giving the user the option to play multiple rounds.
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
            
            //Variables for the user selection and loop processes
            boolean  invalidAnswer = true;
            Question selectedCategory[] = null;
            int score = 0;
            
            //This while loop ensures the user inputs a valid answer whereby that be the category number or name, allowing random capitals or spaces in the answer.
            while (invalidAnswer) {

                //Added scanner.nextLine() as I have found it stops the loop from breaking if they input an invalid answer
                String categoryChoice = scanner.nextLine();
                
                
                // user selection process, with .trim() to allow any accidental spaces before or after the answer and .equalsIgnoreCase() to also ignore any accidental capitals

                if (categoryChoice.trim().equalsIgnoreCase("Physics") || categoryChoice.equals("1")) {
                    selectedCategory = physicsQuestions;
                    invalidAnswer = false;
                    System.out.println("You have selected Physics as your category of choice.");
                }
                
                else if (categoryChoice.trim().equalsIgnoreCase("Maths") || categoryChoice.equals("2")) {
                    selectedCategory = mathsQuestions;
                    invalidAnswer = false;
                    System.out.println("You have selected Maths as your category of choice.");
                }

                else if (categoryChoice.trim().equalsIgnoreCase("Geography") || categoryChoice.equals("3")) {
                    selectedCategory = geographyQuestions;
                    invalidAnswer = false;
                    System.out.println("You have selected Geography as your category of choice.");
                }

                else if (categoryChoice.trim().equalsIgnoreCase("General Knowledge") || categoryChoice.equals("4")){
                    selectedCategory = generalQuestions;
                    invalidAnswer = false;
                    System.out.println("You have selected General Knowledge as your category of choice.");
                }

                else {
                    System.out.println("Invalid answer... please enter either the category name or number. ");
                }

            }

            System.out.println("=== The Quiz is now starting!!! ===");

            // used iteration alongside with scanner.nextLine to print each question in the array individually allowing the user to enter their answer one at a time, seeing if their answer is right or wrong straightaway

            for (Question q : selectedCategory) {
                System.out.println(q.getQuestionText());
                String userAnswer = scanner.nextLine();

                if (q.checkAnswer(userAnswer)) {
                    System.out.println(userAnswer + " is the correct answer!");
                    score++; //adds one to the score every time the user inputs the correct answer.
                    System.out.println("Your score now is " + score + " points.");
                }
                
                else {
                    System.out.println("Your answer is incorrect :( The correct answer was " + q.getAnswer());
                    System.out.println("Your score remains " + score + " points.");
                }
            }

            System.out.println("You have reached the end of the quiz. Your final score was " + score + " points.");
            System.out.println("Would you like to select another category or exit the quiz? " +
                                "Please enter 'continue' or 'exit'");

            // assigned a boolean variable (for a loop in case the user inputs an invalid answer) 
            // selection to control the user input when deciding whether to continue or exit the program.
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


