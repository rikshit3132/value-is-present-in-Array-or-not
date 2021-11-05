import java.util.Scanner;
class Value_in_Array{
	public static void main(String args[]){
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter which element to find\n");
		int element=sc.nextInt();
		System.out.println("Enter the Elements of Array:\n");
		for(int i=0;i<5;i++){
			arr[i]=sc.nextInt();
		}

	  boolean found=false;
	  int i;
	  System.out.println("Array is:\n");
	  for(i=0;i<5;i++){
	  	System.out.print(arr[i]+" ");
	  }
	  System.out.println();
	  for(i=0;i<5;i++){
	  	if(element==arr[i]){
	  		found=true;
	  		break;
	  	}
	  }
	  if(found){
	  	System.out.println(element+" "+"is in Array at position:"+(i+1)+"\n");
	  }
	  else{
	  	System.out.println(element+" "+"is not in Array:\n");
	  }
	}
}