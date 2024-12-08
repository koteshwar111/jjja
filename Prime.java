public class Prime {
    public static void main(String[] args) {
        int upperLimit = 100;
        
        for (int num = 2; num <= upperLimit; num++) {
            int count = 0;
            
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            
        }
    }
    
}
