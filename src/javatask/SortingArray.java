package javatask;
import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
	//Given Unsorted Array
    int[] arrayList = {5,9,2,0,6};
    int index = -1;
    
    //Method to get index of the given array
    public void identifyIndexOfArray() {
    	int arrayElement = 0;
    	
    	//To get an element from the given array as user input
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an element from the given array:  ");
        arrayElement = scanner.nextInt();
        
        //looping through the array list to get the index of an given element
    for (int i = 0; (i < arrayList.length) && (index == -1); i++) {
        if (arrayList[i] == arrayElement) {
            index = i;
        }
    }
    //printing the index of the element
    System.out.println("Index of array element" + arrayElement + " is  :" +index);
  }
    //Method to add all the element in the given array
    public void addArrayElements() {
    
    	//looping through the array list to get the elements 
    	
    int sum = 0;
    for (int i = 0; i < arrayList.length; i++)
    	sum += arrayList[i];
    System.out.println("Sum of the array elements is: "+sum);
    }
    
   //Method to perform sorting of an array
    public void sortingAnArray() {
    	// Given array contains 5 elements
                Arrays.sort(arrayList);
     
            System.out.printf("Sorted arrayList[] : %s",
                              Arrays.toString(arrayList));
        }
    
   
public static void main( String args[] ) {
			 SortingArray sa = new SortingArray();
			 
			 sa.identifyIndexOfArray();
			 sa.addArrayElements();
			 sa.sortingAnArray();
			 
		  
		}

}
