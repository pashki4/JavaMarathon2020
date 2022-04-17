package day7;

public class Task1 {
    public static void main(String[] args) {
    	Airplane airplane1 = new Airplane("boeing", 2000, 100, 2000);
    	Airplane airplane2 = new Airplane("sukhoy", 2010, 200, 2000);
    	Airplane.compareAirplanes(airplane1, airplane2);
    }
}