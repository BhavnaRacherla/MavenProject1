package javaMaven1.sample1;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class Testtt {
	@Test
	public void testln(){
		int n=0;
		int w;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of sweets:");
        n=s.nextInt();
        sweet[] origin = new sweet[n];
        for (int i = 0; i < n; i++) {
        	System.out.println("enter weight of sweet "+(i+1));
        	w=s.nextInt();
            origin[i] = new sweet(w);
        }
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
    		arr[i]=origin[i].getWeight();
    	}
       Arrays.sort(arr);
       System.out.println("sweets in sorted order are:");
       for(int i=0;i<n;i++) {
    	  for(int j=0;j<n;j++) {
    		  if(arr[i]==origin[j].getWeight()) {
    			  System.out.println("sweet "+(j+1));
    		  }
    	  }
       }
       
	}
	

}
