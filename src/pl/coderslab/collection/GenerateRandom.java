package pl.coderslab.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GenerateRandom {
	public static void main(String[] args) {

		System.out.println(checkRand(100, 5).toString());
	}

	public static Map<Integer, Integer> checkRand(int amount, int interval) {
		Map<Integer, Integer> randMap = new HashMap<>();
		for (int i = 0; i < amount; i++) {
			Random random = new Random();
			int number = random.nextInt(interval);
			if (randMap.containsKey(number)) {
				randMap.put(number, randMap.get(number) + 1);
			} else {
				randMap.put(number, 1);
			}
		}
		return randMap;

	}
}
