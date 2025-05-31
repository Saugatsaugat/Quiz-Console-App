public class Question {
    private int id;
    private String question;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
    private String answer;

    // Constructors
        public Question() {
    }

    public Question(int id, String question, String opt1, String opt2, String opt3, String opt4, String answer) {
            this.id = id;
            this.question = question;
            this.opt1 = opt1;
            this.opt2 = opt2;
            this.opt3 = opt3;
            this.opt4 = opt4;
            this.answer = answer;
        }

    // Getters and setters

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getOpt1() {
        return opt1;
    }
    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }
    public String getOpt2() {
        return opt2;
    }
    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }
    public String getOpt3() {
        return opt3;
    }
    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }
    public String getOpt4() {
        return opt4;
    }
    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((question == null) ? 0 : question.hashCode());
        result = prime * result + ((opt1 == null) ? 0 : opt1.hashCode());
        result = prime * result + ((opt2 == null) ? 0 : opt2.hashCode());
        result = prime * result + ((opt3 == null) ? 0 : opt3.hashCode());
        result = prime * result + ((opt4 == null) ? 0 : opt4.hashCode());
        result = prime * result + ((answer == null) ? 0 : answer.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Question other = (Question) obj;
        if (id != other.id)
            return false;
        if (question == null) {
            if (other.question != null)
                return false;
        } else if (!question.equals(other.question))
            return false;
        if (opt1 == null) {
            if (other.opt1 != null)
                return false;
        } else if (!opt1.equals(other.opt1))
            return false;
        if (opt2 == null) {
            if (other.opt2 != null)
                return false;
        } else if (!opt2.equals(other.opt2))
            return false;
        if (opt3 == null) {
            if (other.opt3 != null)
                return false;
        } else if (!opt3.equals(other.opt3))
            return false;
        if (opt4 == null) {
            if (other.opt4 != null)
                return false;
        } else if (!opt4.equals(other.opt4))
            return false;
        if (answer == null) {
            if (other.answer != null)
                return false;
        } else if (!answer.equals(other.answer))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Question [id=" + id + ", question=" + question + ", opt1=" + opt1 + ", opt2=" + opt2 + ", opt3=" + opt3
                + ", opt4=" + opt4 + ", answer=" + answer + ", getId()=" + getId() + ", getQuestion()=" + getQuestion()
                + ", getOpt1()=" + getOpt1() + ", getOpt2()=" + getOpt2() + ", getOpt3()=" + getOpt3() + ", getOpt4()="
                + getOpt4() + ", getAnswer()=" + getAnswer() + ", hashCode()=" + hashCode() + ", getClass()="
                + getClass() + ", toString()=" + super.toString() + "]";
    }

    

    
}
