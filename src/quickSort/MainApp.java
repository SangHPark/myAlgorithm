package quickSort;

public class MainApp {
	private static int data[] = {4,3,2,1,6,9,0,8,7};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
		}
		quickSort(data, 0, data.length -1 );
		System.out.println("");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
		}
	}
	
	public static void quickSort(int[] data, int p, int r) {
		if (p < r) {
			int q = partition(data, p, r);
			quickSort(data, p, q-1);
			quickSort(data, q+1, r);
		}
		
	}
	
	public static int partition (int data[], int p, int r) {
		int x = data[r];
		int i = p - 1;
		for (int j = p ; j < r; j++) {
			if (data[j] <=x ) {
				i = i + 1;
				int tmp = data[i];
				data[i] = data[j];
				data[j] = tmp;
			}
			
		}
		
		int tmp = data[i+1];
		data[i+1] = data[r];
		data[r] = tmp;
		
		return i+1;
	}

}
