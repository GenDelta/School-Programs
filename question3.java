public class question3 {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        int[] sum = new int[1000];
        //write a loop to store in arr 1000 prime numbers 
        int count = 0; int i=5;
        while(count!=1000)
        {
            if(isPrime(i)){
                arr[count] = i;
                count++;
            }
            i++;
        }
        for(i=0;i<1000;i++){
            if(arr[i]!=0){
                sum[i] = sumOfDigits(arr[i]);
            }
        }
        System.out.println("Prime Numbers" + " " + "Sum of Digits"); 
        for(i=0;i<1000;i++){
            if(arr[i]!=0){
                System.out.println(arr[i] + "\t\t" + sum[i]);
            }
        }
    }
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            sum = sum + n%10;
            n = n/10;
        }
        return sum;
    }
}