import java.util.Scanner;

public class Quiz {
    static String[][] questions = {
            {"Who is known as the 'King of Pop'?", "1. Elvis Presley", "2. Justin Bieber", "3. Michael Jackson", "4. Prince"},
            {"Which song was the most viewed song before Despacito?", "1. Baby Shark", "2. Shape of You", "3. See You Again", "4. Uptown Funk"},
            {"Which artist released the album '25'?", "1. Taylor Swift", "2. Adele", "3. Beyonce", "4. Lady Gaga"},
            {"Who sang the hit song 'Rolling in the Deep'?", "1. Rihanna", "2. Katy Perry", "3. Adele", "4. Madonna"},
            {"Which pop star is known for hits like 'Sorry' and 'Love Yourself'?", "1. Ed Sheeran", "2. Justin Bieber", "3. Shawn Mendes", "4. Bruno Mars"}
    };

    static int[] correctAnswers = {3, 3, 2, 3, 2};

    static int[] userAnswers = new int[questions.length];

    static int currentQuestion = 0;

    static int[] shuffledIndices = new int[questions.length];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        shuffleQuestionsAndAnswers();

        while (true) {
            displayQuestion();

            System.out.println("Enter your answer (1-4), 'prev' for previous question, or 'submit' to finish:");
            String input = scanner.nextLine();

            if (input.equals("prev")) {
                if (currentQuestion > 0) {
                    currentQuestion--;
                } else {
                    System.out.println("This is the first question.");
                }
            } else if (input.equals("submit")) {
                submitQuiz();
                break;
            } else {
                try {
                    int answer = Integer.parseInt(input);
                    if (answer >= 1 && answer <= 4) {
                        userAnswers[currentQuestion] = answer;
                        if (currentQuestion < questions.length - 1) {
                            currentQuestion++;
                        } else {
                            System.out.println("This is the last question.");
                            submitQuiz();
                            break;
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a number between 1 and 4.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter 'prev', 'submit', or a number between 1 and 4.");
                }
            }
        }

        scanner.close();
    }

    private static void displayQuestion() {
        int questionIndex = shuffledIndices[currentQuestion];
        System.out.println("Question " + (currentQuestion + 1) + ": " + questions[questionIndex][0]);
        for (int i = 1; i <= 4; i++) {
            System.out.println(questions[questionIndex][i]);
        }
    }

    private static void submitQuiz() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            if (userAnswers[i] == correctAnswers[shuffledIndices[i]]) {
                score++;
            }
        }
        System.out.println("Quiz submitted. Your score is: " + score + "/" + questions.length);
    }

    private static void shuffleQuestionsAndAnswers() {
        int n = questions.length;
        for (int i = 0; i < n; i++) {
            shuffledIndices[i] = i;
        }
        for (int i = 0; i < n; i++) {
            int randomIndex = (int) (Math.random() * n);
            int tempIndex = shuffledIndices[i];
            shuffledIndices[i] = shuffledIndices[randomIndex];
            shuffledIndices[randomIndex] = tempIndex;
        }
    }
}
