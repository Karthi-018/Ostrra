import edu.osttra.training.Main;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Scanner sc = new Scanner(System.in);

    Main c = new Main();

    @Test
    public void testSum() {
        System.out.println("This is the test for Sum");
        System.out.println("Enter num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter num2:");
        int num2 = sc.nextInt();
        int result = Main.sum(num1, num2);
        assertEquals(num1+num2, result);
    }

    @Test
    public void testSub() {
        System.out.println("This is the test for Sub");
        System.out.println("Enter num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter num2:");
        int num2 = sc.nextInt();
        int result = Main.sub(num1, num2);
        assertEquals(num1-num2, result);
    }

    @Test
    public void testMul() {
        System.out.println("This is the test for Mul");
        System.out.println("Enter num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter num2:");
        int num2 = sc.nextInt();
        int result = Main.mul(num1, num2);
        assertEquals(num1*num2, result);
    }

    @Test
    public void testDiv() {
        System.out.println("This is the test for Div");
        System.out.println("Enter num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter num2:");
        int num2 = sc.nextInt();
        int result = Main.div(num1, num2);
        assertEquals(num1/num2, result);
        System.out.println("Test Passes");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("This is a Before All");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("This is a After All");
    }

}
