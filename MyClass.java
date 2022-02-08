/**Author - Renju
   To check if 2 numbers in a given array sums up to a given number

**/

public class MyClass {
    public static void main(String args[]) {
        int[] numbers = new int[] {2,3,5,7,8};
        new MyClass(). checkIfSum(numbers, 6);

    }
    public void checkIfSum(int[] arr, int n) {
        boolean flag = false;
        for(int i=0;i<arr.length;i++) {
            if(flag) break;
            for(int j=0;j<arr.length;j++) {

                if(i==j) continue;
                if(arr[i] +arr[j] == n) {
                    System.out.println("Result = "+arr[i] +"+"+arr[j]+"="+n);
                    flag = true;
                    break;
                }
            }
        }
        if(!flag) System.out.println("No numbers in the array sum to "+n);
    }
}