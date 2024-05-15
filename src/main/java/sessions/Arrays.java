package sessions;

/**
 *
 * @author Administrator
 */
public class Arrays {
    
    // method just for printing the array elements
    static void printArray(int[] arr)
    {
          for (int i = 0; i < arr.length; i++) {
              System.out.println(arr[i]);
        }
    }
    
    public static void main(String[] args) {
        // Arrays => Data structure;
        /**
         * Can be define as the following:
         * int degree[] or int[] degree
         * 
         */
        
//        int arr[] = {5,1,9,2};
//        int max = getMaxNumber(arr);
//        System.out.println(max);


        
    }
    
    static int getArraySum(int[] arr)
    {
        int sum = 0;
          for (int i = 0; i < arr.length; i++) {
              sum += arr[i];
        }   
          
          return sum;
    }
    
     static int getMaxNumber(int[] arr)
    {
        int maxNumber = 0;
          for (int i = 0; i < arr.length; i++) {
              if(arr[i] > maxNumber)
              {
                  maxNumber = arr[i];
              }
        }   
          
          return maxNumber;
    }
     
     
    static int searchElement(int[] arr, int value)
    {
          for (int i = 0; i < arr.length; i++) {
              if(arr[i] == value)
              {
                  return i;
              }
        }   
          
          return -1;
    }
    
    
    
}
