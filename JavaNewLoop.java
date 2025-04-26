public class JavaNewLoop{
    public static void main(String[] args) {
        // 1 to 10
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        // 12345
        int number=12345;
        int sum=0;
        while(number!=0){
            int digit=number%10;
            sum+=digit;
            number/=10; //1234.5
        }
        System.out.println("sum="+sum);

        // 12345 reverse 
               int reverse=0;
        
        while (number != 0) {
            int digit = number % 10; 
            reverse = reverse * 10 + digit; 
            number /= 10; 
        }

        System.out.println("Reversed number: " + reverse);
    }

}

