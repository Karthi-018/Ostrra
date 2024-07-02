package edu.osttra.training.QuizApp;

public class Questions {
    String question = null;
    int answer = Integer.MIN_VALUE;
    String options[];

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
