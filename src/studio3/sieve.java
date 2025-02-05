package studio3;

import java.util.Scanner;

public class sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number to find all the number up to it: ");
		int n =scanner.nextInt();
		scanner.close();
		boolean[] isPrime=new boolean[n+1];
		for(int i=2 ; i<=n ; i++) {
			isPrime[i]=true;
		}
		int i=2;
		while(i*i<=n) {
			if(isPrime[i]) {
				int checker=i*i;
				while(checker<=n) {
					isPrime[checker]=false;
					checker=checker+i;
				}
			}
			i++;
		}

		System.out.print("Prime numbers up to "+ n+ " : ");
		for(int num=2;num<=n;num++) {
			if(isPrime[num]) {
				System.out.print(num+ " ");
			}
		}
	}
}

