public class Program3 {
    
    // n = 108999
    public static void main(String[] args) {


        // To find out the last digit modulo by 10 
        // To shorten it by one digit divide it by 10 

        int n = 108999;


        
        while(n>0){


            // Finding out the last digit 
            int last_digit = n%10;
            System.out.print(last_digit);

            n = n/10;

        }

        
    }
}   
