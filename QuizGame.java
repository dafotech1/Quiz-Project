import java.util.Scanner;

public class  QuizGame{
    private static Scanner scanner = new Scanner(System.in);
    private static int score;

    public static void main(String[] args) {

        //could possibly add bonus points to some of these questions if answers are more specific.
        Question[] physicsQuestions = {
            new Question("What particle has no electric charge?", "Neutron", "Physics"),
            new Question("What is the phenomenon called that causes a straw to appear to bend in water?", "Refraction", "Physics"),
            new Question("What is the unit of frequency?", "Hertz", "Physics"),
            new Question("What force keeps a race car from losing control when going around a bend?", "", "Physics"),
            new Question("What is the exchange particle for the electromagnetic force?", "Photon", "Physics")
        };

        Question[] mathsQuestions = {
            new Question("What is the derivative of a constant?", "Zero", "Maths"),
            new Question("Solve 3x - 7 = 11?","6", "Maths"),
            new Question("What is e\u2070?", "1", "Maths"),
            new Question("What is the smallest number divisible by 17 and 4?", "68", "Maths")
        };

        Question[] geographyQuestions = {
            new Question("Which continent would you find the world's largest desert?", "Antarctica", "Geography"),
            new Question("Which country suffered from there Chernobyl disaster?", "Ukraine", "Geography"),
            new Question("True or false: Holland is a region in the netherlands?", "True", "Geography"),
            new Question("What is the state capital of New York?", "Albany", "Geography"),
            new Question("What river flows through the Grand Canyon?", "Colorado River", "Geography"),
            new Question("Which country has the most islands?", "Sweden", "Geography")
        };

        Question[] generalQuestions = {
            new Question("What is the most common surname in the U.S.A?","Smith","General Knowledge"),
            new Question("Who was the ancient greek god of the sun?","Apollo ","General knowledge"),
            new Question("In what year did World War II end?", "1945", "General knowledge"),
            new Question("Who was the first woman to win a Nobel Prize?", "Marie Curie", "General knowledge"),
            new Question("What country has the most world cups?","Brazil", "General knowledge"),
            };
        };


}