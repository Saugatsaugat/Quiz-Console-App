import java.util.InputMismatchException;
import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    Integer[] answers = new Integer[questions.length];

    public QuestionService() {
        questions[0] = new Question(1, "Wrapper class of int is", "Integer", "Character", "Float", "String", "Integer");
        questions[1] = new Question(2, "Wrapper class of char is", "Integer", "Character", "Float", "String",
                "Character");
        questions[2] = new Question(3, "Wrapper class of float is", "Integer", "Character", "Float", "String", "Float");
        questions[3] = new Question(4, "Wrapper class of double is", "Integer", "Character", "Float", "Double",
                "Double");
        questions[4] = new Question(5, "Wrapper class of long is", "Integer", "Character", "Long", "String", "Long");
    }

    public void displayQuestions() {
        int index = 0;
        for (Question q : questions) {
            System.out.println("\nQ" + q.getId() + ") " + q.getQuestion());
            System.out.println(
                    "1. " + q.getOpt1() + "\t2. " + q.getOpt2() + "\t3. " + q.getOpt3() + "\t4. " + q.getOpt4());
            System.out.print("Your Option: ");
            Scanner sc = new Scanner(System.in);
            try {
                answers[index] = sc.nextInt();
                index++;
            } catch (InputMismatchException e) {
                e.printStackTrace();
            }
        }
        
                 // calculate the score
            calculateScore();
    }

    public void calculateScore(){
        int total = questions.length;
        int correct = 0;

        for(int i = 0; i < questions.length; i++){
            String userOption = "";
            switch(answers[i]){
                case 1:
                userOption = questions[i].getOpt1();
                break;

                case 2:
                userOption = questions[i].getOpt2();
                break;

                case 3:
                userOption = questions[i].getOpt3();
                break;

                case 4:
                userOption = questions[i].getOpt4();
                break;
            }
            
            if (questions[i].getAnswer().equals(userOption)){
                correct++;
            }
        }

        // display output

        System.out.println("\nYour performance: " + correct+"/"+total);

    }
}
