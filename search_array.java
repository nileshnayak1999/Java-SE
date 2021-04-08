

import java.util.*;
public class search_array 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int key=6,i;
        int a[]= new int [10];
        System.out.println("Enter the numbers");
        for(int j=0;j<a.length;j++)
        {   
            a[j]=sc.nextInt();
        }
        for( i=0;i<a.length;i++)
        {
           if (a[i]==key)
              break;
        }
        System.out.println("Number Found : key is"+key);
                System.out.println("Position is:"+i );
    }
    
}