package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
    	List<String> auto = new ArrayList<>();
    	auto.add("Ford");
    	auto.add("Mustang");
    	auto.add("Hyundai");
    	auto.add("Toyota");
    	auto.add("Mazda");
    	System.out.println(auto);
    	
    	auto.add(2, "Honda");    	
    	auto.remove(0);
    	
    	System.out.println(auto);
    }
}
