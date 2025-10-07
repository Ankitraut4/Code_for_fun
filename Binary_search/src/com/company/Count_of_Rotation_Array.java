package com.company;

public class Count_of_Rotation_Array {
    public static void main(String[] args) {
        int[] arr={2,3,4,1};
        System.out.println("no of rotation in array = "+countRotation(arr));
    }
    private static int countRotation(int[] arr ){
        int pivot=findPivot(arr);
        return pivot+1;
    }
    //duplication is not allowed
    private static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1] && end>mid){
                return mid;
            }else if (arr[mid]<arr[mid-1] && mid>start){
                return mid-1;
            }
            if (arr[start]>=arr[mid]){
                end=mid-1;

            }else {
                start=mid+1;
            }
        }
        return -1;
    }

    //duplication is allowed
//    private static int findPivotInDuplication(int[] arr){
//        int start=0;
//        int end=arr.length-1;
//        while (start<=end){
//            int mid=start+(end-start)/2;
//            if (arr[mid]>arr[mid+1]){
//                return mid;
//            }
//            if (arr[mid]<arr[mid-1]){
//                return mid-1;
//            }
//            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
//                //before skiping start and end  check wheather the given start and end are pivot
//                if (arr[start]>arr[start+1]){
//                    return start;
//                }else {
//                    start++;
//                }
//                if (arr[end]<arr[end-1]){
//                    return end-1;
//                }else {
//                    end--;
//                }
//                if (arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
//                    start=mid+1;
//                }else {
//                   end=mid-1;
//                }
//            }
//        }
//        return -1;
//    }
}
