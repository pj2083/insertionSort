package recursion;

public class insertionsort {
public static void sort(int[] arr,int n) {
	if(n<=1) {
		return;
	}
	int last=arr[n-1];
	int j=n-2;
	while(j>=0 && arr[j]>last) {
	arr[j+1]=arr[j];
	j--;
	}
	arr[j+1]=last;
	
	sort(arr,n-1);
}
	public static void main(String[] args) {
int arr[]= {3,2,4,5,6};
sort(arr,arr.length);
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}

	}

}
