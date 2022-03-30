package Sort;
//using recurssion
class BinarySearchExample{  
    public static int binarySearch(int arr[], int first, int last, int key){  
        if (last>=first){  //last=2,first=2,
            int mid = (first + last)/2;//2+2/2=2
            if (arr[mid] == key){  // is arr[mid]=arr[2]=8
            return mid;  
            }  
            if (arr[mid] > key){//6>8
            return binarySearch(arr, first, mid-1, key);//search in left subarray  
            }else{  
            return binarySearch(arr, mid+1, last, key);//search in right subarray  
            }  
        }  
        return -1;  
    }  
    public static void main(String args[]){  
        int arr[] = {4,6,8,10,12,14,16}; //length=7 
        int key = 8;  
        int last=arr.length-1;  //7-1=6
        int result = binarySearch(arr,0,last,key);  //result=2
        if (result == -1)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  
    }  
}  