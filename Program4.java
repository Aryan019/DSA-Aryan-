public class Program4{
    
    public static void main(String[] args) {
        
        // Reversing and store the number 
        int n = 108999;

        int rev = 0;

        while(n>0){
            int lastDigit = n % 10;

            rev = (rev*10) + lastDigit;

            n/=10;

        }


        System.out.println(rev);
    }
}
