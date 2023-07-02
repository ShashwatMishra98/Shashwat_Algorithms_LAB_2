package Services;

public class SearchImplementation {
	public void search1(int arr[],long target) {
		int length = arr.length;
		//System.out.println("Search to be done.");
		long sum = 0;
		boolean flag = true;
		for(int i = 0;i < length;i++ ) {
			sum += arr[i];
			if(sum>= target) {
				System.out.println("Target achieved after "+(i+1)+" tranactions");
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Targer not achievved.");
		}
		
	}
}
