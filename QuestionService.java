public class QuestionService {
    Question[] questions = new Question[5];

    public QuestionService(){
        questions[0] = new Question(1, "Wrapper class of int is", "Integer", "Character", "Float", "String", "Integer");
        questions[1] = new Question(2, "Wrapper class of char is", "Integer", "Character", "Float", "String", "Character");
        questions[2] = new Question(3, "Wrapper class of float is", "Integer", "Character", "Float", "String", "Float");
        questions[3] = new Question(4, "Wrapper class of double is", "Integer", "Character", "Float", "Double", "Double");
        questions[4] = new Question(5, "Wrapper class of long is", "Integer", "Character", "Long", "String", "Long");
    }

    public void displayQuestions(){
        for(Question q : questions){
            System.out.println("Q"+q.getId() + ") " +q.getQuestion());
            System.out.println("a. "+q.getOpt1()+"\tb. "+q.getOpt2() + "\tc. "+q.getOpt3() + "\td. "+q.getOpt4());
            System.out.println("\n");
        }
    }

}
