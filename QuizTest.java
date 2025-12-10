public class QuizTest {
    public static void main(String[] args) {

    System.out.println("Test 1: Testing my question constructor");
    Question question = new Question("Is this constructor valid", "Yes", "Test"); //created a Question for the Question and Answer to be tested whether or not they store the intended value/string

    if (question.getQuestionText().equals("Is this constructor valid")) {
        System.out.println("PASS");
    }else{
        System.out.println("FAIL");
    }

    if (question.getAnswer().equals("Yes")) {
        System.out.println("PASS");
    }else{
        System.out.println("FAIL");
    }


    System.out.println("Test 2: Testing my checkAnswer()"); //testing whether my checkAnswer() works as intended... does it allow spaces, does it allow random capitals and simply does it allow incorrect or the exact correct answer?
    Question question2 = new Question("Does checkAnswer() work with the set answer of 'Photon', with all variations of the answer ", "Photon", "Test");

    if (question2.checkAnswer("Photon")) {
        System.out.println("PASS");
    }else {
        System.out.println("FAIL");
    }

    if (question2.checkAnswer("photon")) {
        System.out.println("PASS");
    }else {
        System.out.println("FAIL");
    }

    if (question2.checkAnswer("PHOTON   ")) {
        System.out.println("PASS");
    }else {
        System.out.println("FAIL");
    }

    if (question2.checkAnswer("   PhOTON   ")) {
        System.out.println("PASS");
    }else {
        System.out.println("FAIL");
    }
    if (question2.checkAnswer("Electron") == false ){
        System.out.println("PASS");
    }else {
        System.out.println("FAIL");
    }

    System.out.println("Test 3: Testing QuestionBank");

    //Testing the existing arrays in QuestionBank to check whether the Questions are storing the correct amount of questions that I have created to be used.
    Question[] physicsQuestions = QuestionBank.getPhysicsQuestions();
    Question[] mathsQuestions = QuestionBank.getMathsQuestions();
    Question[] geographyQuestions = QuestionBank.getGeographyQuestions();
    Question[] generalQuestions = QuestionBank.getGeneralQuestions();

    if (physicsQuestions.length == 5) {
        System.out.println("PASS");
    }else {
        System.out.println("FAIL");
    }

    if (mathsQuestions.length == 5) {
        System.out.println("PASS");
    }else {
        System.out.println("FAIL");
    }

    if (geographyQuestions.length == 6) {
        System.out.println("PASS");
    }else {
        System.out.println("FAIL");
    }

    if (generalQuestions.length == 5) {
        System.out.println("PASS");
    }else {
        System.out.println("FAIL");
    }

    System.out.println("Test 4: Testing score logic");
    int score = 0;
    Question q = new Question("What is 2+2?","4","Maths");

    if (q.checkAnswer("4")) {
        score++;
    }

    if (score == 1) {
        System.out.println("PASS");
    }else{
        System.out.println("FAIL");
    }
    
    }
}
