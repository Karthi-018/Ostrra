public class Main {
    public static void main(String[] args) {
        Question[] questions = new Question[] {
            new Question("Question 1: What is the capital of France?", 
                         new String[] {"Berlin", "Madrid", "Paris", "Rome"}, 
                         3),
            new Question("Question 2: Which planet is known as the Red Planet?", 
                         new String[] {"Earth", "Mars", "Jupiter", "Saturn"}, 
                         2),
            new Question("Question 3: What is the color of sky?", 
                         new String[] {"Pink", "Blue", "Red", "Green"}, 
                         1),
            new Question("Question 4: What is the largest ocean on Earth?", 
                         new String[] {"Atlantic", "Indian", "Arctic", "Pacific"}, 
                         4),
            new Question("Question 5: Which element has the chemical symbol 'O'?", 
                         new String[] {"Gold", "Oxygen", "Silver", "Nitrogen"}, 
                         2)
        };

        Quiz quiz = new Quiz(questions);
        quiz.start();
    }
}
