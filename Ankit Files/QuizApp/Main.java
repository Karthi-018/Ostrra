import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        float score = 0.0f;
        Scanner sc = new Scanner(System.in);
        int questionsPickedSoFar[] = {-100, 1, 2, 3, 4, 5};
        Questions ques1 = new Questions();
        Questions ques2 = new Questions();
        Questions ques3 = new Questions();
        Questions ques4 = new Questions();
        Questions ques5 = new Questions();

        Questions pickedQuestion = new Questions();

        // System.out.println(ques.randomQuestion());
        // System.out.println();

        ques1.createQuestion("Question 1");
        ques1.createOptions(new String[] {"Option1", "Option2", "Option3", "Option4"});
        ques1.correctAnswer(1);

        ques2.createQuestion("Question 2");
        ques2.createOptions(new String[] {"Option1", "Option2", "Option3", "Option4"});
        ques2.correctAnswer(1);

        ques3.createQuestion("Question 3");
        ques3.createOptions(new String[] {"Option1", "Option2", "Option3", "Option4"});
        ques3.correctAnswer(1);

        ques4.createQuestion("Question 4");
        ques4.createOptions(new String[] {"Option1", "Option2", "Option3", "Option4"});
        ques4.correctAnswer(1);

        ques5.createQuestion("Question 5");
        ques5.createOptions(new String[] {"Option1", "Option2", "Option3", "Option4"});
        ques5.correctAnswer(1);

        while(flag) {
            int randomQuestionNum = (int)(Math.random()*4)+1;
            if(questionsPickedSoFar[randomQuestionNum] > 0 && questionsPickedSoFar[randomQuestionNum] <= 5) {
                switch(randomQuestionNum) {
                    case 1: pickedQuestion = ques1;
                            break;
                    case 2: pickedQuestion = ques2;
                            break;
                    case 3: pickedQuestion = ques3;
                            break;
                    case 4: pickedQuestion = ques4;
                            break;
                    case 5: pickedQuestion = ques5;
                            break;
                    default:
                            System.out.println("Error in random pick");
                }
                
                pickedQuestion.printQuestion();
                int userAnswer = sc.nextInt();
                if(pickedQuestion.getCorrectAnswer() == userAnswer) {
                    score += 1.0f;
                } else {
                    score -= 0.25f;
                }

                questionsPickedSoFar[randomQuestionNum] = Integer.MIN_VALUE;

                boolean leftQuestion = true;
                for(int i = 0; i < questionsPickedSoFar.length; i++) {
                    if(questionsPickedSoFar[randomQuestionNum] > 0 && questionsPickedSoFar[randomQuestionNum] <= 5) {
                        leftQuestion = true;
                        break;
                    }
                    if(i == questionsPickedSoFar.length) {
                        leftQuestion = false;
                    }
                }
                if(leftQuestion == false) {
                    flag = false;
                }
                System.out.println(leftQuestion);
            }
        }
        System.out.println("You scored: "+ score);
        System.out.println("Quiz End!");

    }
}
