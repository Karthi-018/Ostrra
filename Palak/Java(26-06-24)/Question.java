public class Question {
    String questionText;
    String[] options;
    int correctAnswerIndex;

    public Question(String questionText, String[] options, int correctAnswerIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getQuestions(){
        return questionText;
    }
    
    public String[] getOptions(){
        return options;

    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }
}
