import java.util.Scanner;

public class Quiz {
    Question[] questions;
    int score= 0;
    int count;
    public Quiz(int maxQues){
        questions = new Question[maxQues];
        count= 0;
    }
    public void addQuestion(Question question) {
        if (count < questions.length) {
            questions[count++] = question;
        } else {
            System.out.println(" quiz is full.");
        }
    }

    public void quizStart(){
      
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<count;i++){
            Question question = questions[i];
            System.out.println(question.getQuestions());
            String[] options = question.getOptions();
            for (int j = 0; j < options.length; j++) {
                System.out.println((j + 1) + ". " + options[j]);
            }
            System.out.print("Your answer: ");
            int userAnswer = sc.nextInt();
            if (userAnswer - 1 == question.getCorrectAnswerIndex()) {
                score++;
            }
        }

        System.out.println("Your score: " + score);
        sc.close();

        }
    }


