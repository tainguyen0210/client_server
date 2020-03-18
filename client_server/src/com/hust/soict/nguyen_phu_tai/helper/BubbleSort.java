package com.hust.soict.nguyen_phu_tai.helper;

public class BubbleSort implements NumberSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sort(int[] arr) {
		int n = arr.length;
        int temp;
        for (int i = 0; i < n -1 ; i++) {

            for (int j = 1; j < (n - i); j++) {

                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
            
        }
		
	}

}
