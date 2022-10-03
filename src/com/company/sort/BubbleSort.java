package com.company.sort;

public class BubbleSort {
    public static int[] sort(int[] arry){
        boolean isSorted;
        for(int curr = 0; curr < arry.length; curr++){
            isSorted = true;
            for(int next = 1; next < arry.length - curr; next++){
                if(shouldSwap(arry, next, next - 1)){
                    isSorted = false;
                    swap(arry, next, next - 1);
                }

            }

            if(isSorted)
                break;

        }

        return arry;
    }

    private static boolean shouldSwap(int[] input, int curr, int pre){
        return (input[curr] < input[pre] );
    }

    private static void swap(int[] input, int curr, int pre){
        int temp = input[curr];

        input[curr] = input[pre];
        input[pre] = temp;

    }
}
