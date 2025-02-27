public class AverageCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to our program!");
        
        
        double num1 = 20;
        double num2 = 30;
        
        double average = calculateAverage(num1, num2); 
        System.out.println("The average is: " + average);
    }

    
    public static double calculateAverage(double a, double b) {
        return (a + b) / 2; 
    }
}