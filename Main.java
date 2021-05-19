import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,0,7};//This will be used as our input we could have used Scanner class for taking input
		                              //but would have increased our time complexity of our Code
		  //TIME COMPLEXITY FOR THIS IS 0(n).
		Arrays.sort(array);//This line will use our Arrays lib. for sorting array
		//This loop will check if there is any missing in array if found yes then print that value and will break 
		//the loop which decrease our time complexity for code
		for(int i = 1;i<array.length;i++){
		    if(array[i] != i){
		        System.out.println(i);
		        break;
		    }
		}
	}
}
