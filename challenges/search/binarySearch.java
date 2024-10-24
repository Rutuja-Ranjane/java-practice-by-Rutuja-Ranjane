package search;

public class binarySearch {
    public static void main(String[] args) {
        int[] array ={2,4,5,6,7,8,9,15};
        int key=16,beg=0, mid;
        int end = array.length-1;

        mid =(beg+end)/2;
        while(beg<=end)
        {
            if(array[mid]==key)
            {
                System.out.println(key+" key is found at position" +mid);
                break;
            }
            else if(array[mid]>key)
            {
                end = mid-1;
            }
            else if(array[mid]<key)
            {
                beg = mid +1;
            }
            else
            {
                System.out.println("element not found");
            }
            mid = (beg+end)/2;
        }
    }
}
