public class IsPrime {

        public static boolean isPrime(int nb) {
            if (nb <= 1) return false;  
            if (nb == 2) return true;
    
            for (int i = 2; i <= Math.sqrt(nb); i++) {  
                if (nb % i == 0) return false;
            }
            return true;
        }
    
        public static void main(String[] args) {
            System.out.println(isPrime(0));  
            System.out.println(isPrime(1));  
            System.out.println(isPrime(2));  
            System.out.println(isPrime(3));  
            System.out.println(isPrime(4));  
            System.out.println(isPrime(5));  
        }
    
}