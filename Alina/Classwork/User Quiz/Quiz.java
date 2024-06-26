import java.util.Random;
import java.util.Scanner;

public class Quiz {
    private Question[] questions;
    private int score;

    public Quiz(Question[] questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void start() {
        shuffleQuestions();
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            if (answer == question.getCorrectAnswer()) {
                score++;
            }
            System.out.println();
        }

        System.out.println("You scored " + score + " out of " + questions.length);
        scanner.close();
    }

    private void shuffleQuestions() {
        Random random = new Random();
        for (int i = questions.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Question temp = questions[i];
            questions[i] = questions[j];
            questions[j] = temp;
        }
    }
}
