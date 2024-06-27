public class Main {
    public static void main(String[] args) {
        int maxQues= 5;
        Quiz quiz = new Quiz(maxQues);

        String[] options1 = {"earth", "jupiter", "Mars", "venus"};
        Question q1 = new Question("Which planet is known as the Red Planet?", options1, 3);

        String[] options2 = {"Charles Dickens", "William Shakespeare", "George Orwell", "Jane Austen"};
        Question q2 = new Question("Who wrote the play \"Romeo and Juliet\"?", options2, 2);

        String[] options3 = {"int", "float", "String", "boolean"};
        Question q3 = new Question("Which of the following is not a primitive data type in Java?", options3, 2);

        quiz.addQuestion(q1);
        quiz.addQuestion(q2);
        quiz.addQuestion(q3);

        quiz.quizStart();
    }
}
