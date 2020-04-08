package entity;

public class Math {
    public static int countFactorial(int n){
        int result = 1;
        while(n>0){
            result*=n;
            n=n-1;
        }
        return result;
    }
    public static int multiplicationArray(int [] array){
        if(array.length!=0){
            int result=1;
            for(int i=0; i<array.length; i++){
                result*=array[i];
            }
            return result;
        }else return 0;
    }
    public static int minimumOfArray(int [] array){
    if(array.length>0) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
    return min;
    }
    else return 0;
    }
}
