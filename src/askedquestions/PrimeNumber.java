package askedquestions;

import java.util.stream.IntStream;

public class PrimeNumber {

	public static void main(String[] args) {
//		Print the prime numbers between 1 to 100 without using any loops
//		1,2,3,7,11...
//		IntStream.rangeClosed(2, 100)
//				.filter(i -> IntStream.rangeClosed(2, (int) Math.sqrt(i))
//				.allMatch(j -> i % j != 0))
//				.forEach(n -> {
//					System.out.println(n);
//				});
		
		
		IntStream.range(2, 100).filter(i->IntStream.rangeClosed(2, (int)Math.sqrt(i)).allMatch(j->i%j != 0))
		.forEach(n->{
			System.out.print(n+", ");
		});;

	}

}
