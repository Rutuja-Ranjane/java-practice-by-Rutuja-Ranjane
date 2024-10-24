package array;
public class arr1 {
    public static void main(String [] args){
        int [] arr1 = new int [10];
        for(int i = 0; i< arr1.length; i++){
            int y = i+20*60;
            arr1[i] = y;
        }
        for(int i = 0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");  
        }
    }
}
