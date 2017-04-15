package day07;

public class TabletennisAthlete extends Athlete implements SpeakEnglish{
	
	public TabletennisAthlete() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TabletennisAthlete(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void train() {
		// TODO Auto-generated method stub
		System.out.println("trainning tabletennis");
	}

	@Override
	public void speakEnglish() {
		// TODO Auto-generated method stub
		System.out.println("I can speak English");
	}

}
