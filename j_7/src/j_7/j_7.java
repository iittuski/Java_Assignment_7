package j_7;

public class j_7 {
	public static void main(String args[]) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("\n");
		}
		for (int i = 4; i <= 5; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("\n");
			if(i==0){
				break;
			}
		}
	}

}
