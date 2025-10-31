/*My question class is there to be used in my main program QuizGame.
*Having it separate allows me to use the template to have multiple question objects.
*/
public class Question {

    //Private classes means the following can only be used in Question.java (encapsulation) allowing for controlled access and cleaner code.
    private String questionText;
    private String correctAnswer;
    private String category;

    //The following act as a 'constructor' allowing the methods to run automatically when a new Question object is created.
    public Question (String text, String answer, String category) {
        this.questionText = text;
        this.correctAnswer = answer;
        this.category = category;
    }

    /*The 'get' allows my other programs to read the private data safely.
    *For example, getQuestionText can be called using objectName.getQuestionText which will return the questionText successfully without actually accessing it through my private classes.
    */
    public String getQuestionText() {
        return questionText;
    }

    public String getCategory() {
        return category;
    }

    //This is a method to check the user input matches the correct answers I set in my main program, returning true or false.
    public boolean checkAnswer(String input) {
        return input.equalsIgnoreCase(correctAnswer);
    }
}