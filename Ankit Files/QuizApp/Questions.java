class Questions {
    // String questions[] = {"Question 1", "Question 2", "Question 3", "Question 4", "Question 5"};
    String question = null;
    
    int answer = Integer.MIN_VALUE;
    String options[];
    // String options[] = {"(A) Option1 (B) Option2 \n (C) Option3 (D) Option4", "(A) Option1 (B) Option2 \n (C) Option3 (D) Option4", "", "", ""};
    // int answerKey[][] = {{"Option 11", "Option 12", "Option 13", "Option 14"}, {"Option 21", "Option 22", "Option 23", "Option 24"}, {"Option 31", "Option 32", "Option 33", "Option 24"}, {}, {}};
    // int currentQuestionNumber = null;

    public void createQuestion(String question) {
        this.question = question;
    }

    public void createOptions(String[] options) {
        this.options = options;
    }

    public void correctAnswer(int answer) {
        this.answer = answer;
    }
    
    public void printQuestion() {
        System.out.println("Question: "+ question);
        for(int i = 0; i < options.length; i++) {
            System.out.println("("+(i+1)+") "+ options[i] + " ");
        }
        System.out.println("Enter the option number");
    }

    public int getCorrectAnswer() {
        return answer;
    }

}
