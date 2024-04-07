public class Factorial {
    public static void main(String[] args) {
        System.out.println(recursiveFactorial(5));
    }
    //1!=1
    //2!=2*1=2*1!
    //3!=3*2*1=3*2!
    //4!=4*3*2*1=4*3!
    //n!=n*(n-1)!

    public static int recursiveFactorial(int num){
        //must have breaking condition
        if(num==0){
            return 1;
        }
        //the code keep stacking the result until break point then sum all the results

        return num*recursiveFactorial(num-1);
    }
    public static int iterativeFactorial(int num){
        if(num==0){
            return 1;
        }
        int factorial=1;
        for(int i=1;i<=num;i++){
            factorial*=i;
        }
        return factorial;
    }
}
