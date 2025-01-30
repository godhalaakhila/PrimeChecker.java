public class PrimeChecker {

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        // Handle edge cases for numbers less than 2
        if (number <= 1) {
            return false;
        }
        
        // Check if the number is divisible by any number from 2 to sqrt(number)
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;  // Not prime if divisible by any number
            }
        }
        
        return true;  // Prime number if no divisors found
    }

    public static void main(String[] args) {
        // Test numbers
        int num1 = 29;
        int num2 = 15;

        // Check if the numbers are prime
        System.out.println(num1 + " is prime: " + isPrime(num1));
        System.out.println(num2 + " is prime: " + isPrime(num2));
    }
}
 
    

