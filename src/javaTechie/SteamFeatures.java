package javaTechie;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SteamFeatures {
	public static void main(String[] args) {
	/*
	 * 1.Stream.ofNullable
	 * 2.stream.iterator
	 * 3.collectors.collectingAndThen
	 * 4.Stream.takeWhile and Stream.dropWhile
	 * 5.Collectors.teeing()
	 * 6.stream.concat()
	 * 7.collectores.partitioningBy
	 * 8.IntStream for Range
	*/
		
		
		List<String> list = Arrays.asList("tim","pen",null,"sam",null,"bob","lily",null,"Alice","suzan");
		List<String> listWithoutNull = list.stream().filter(l -> l!=null).collect(Collectors.toList());

		System.out.println(listWithoutNull);
	}

}
