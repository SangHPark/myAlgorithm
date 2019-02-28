package mergeSort;

public class MainApp {
//	private static char data[] = {'a','l','g','o','r','i','t','h','m'};
	private static int data[] = {4,3,2,1,6,9,0,8,7};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
		}
		mergeSort(data, 0, data.length -1 );
		System.out.println("");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
		}
	}
	
	public static void mergeSort(int[] A, int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;
			mergeSort(A, p, q);
			mergeSort(A, q+1, r);
			merge(A, p, q, r);
			
		}
	}
	
	public static void merge (int data[], int p, int q, int r) {
		int i = p, j = q+1, k = p;
				
		int tmp[] = new int[data.length];
		while (i <= q && j <= r) {
			if (data[i] <= data[j]) {
				tmp[k++] = data[i++];
			} else {
				tmp[k++] = data[j++];
			}
		}
		
		while( i<= q) {
			tmp[k++] = data[i++];
		}
		
		while( j<= r) {
			tmp[k++] = data[j++];
		}		
		
		for (i=p; i <= r; i ++) {
			data[i] = tmp[i];
		}
		
	}

}
