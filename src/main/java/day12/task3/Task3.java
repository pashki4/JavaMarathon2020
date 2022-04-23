package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
	public static void main(String[] args) {
		List<MusicBand> groups = Arrays.asList(
				new MusicBand("Led Zeppelin", 1968),
				new MusicBand("Pink Floyd", 1965),
				new MusicBand("Foo Fighters", 1994),
				new MusicBand("Linkin Park", 1996),
				new MusicBand("Nirvana", 1987),
				new MusicBand("Avril Lavigne", 2000),
				new MusicBand("Five Finger Death Punch", 2005),
				new MusicBand("My Chemical Romance", 2001),
				new MusicBand("Rotting Christ", 1987),
				new MusicBand("Slip Knot", 1995));
		Collections.shuffle(groups);
		List<MusicBand> groupsAfter2000 = groupsAfter2000(groups);
		System.out.println(groups);
		System.out.println(groupsAfter2000);
	}
	
	public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
		List<MusicBand> result = new ArrayList<>();
		for (MusicBand musicBand : bands) {
			if (musicBand.getYear() >= 2000) {
				result.add(musicBand);
			}
		}
		return result;
	}
}
