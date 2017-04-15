package day07;

public class TabletennisCoach extends Coach implements SpeakEnglish{
	TabletennisCoach(){
		super();
	}
	TabletennisCoach(String name,int age){
		super(name,age);
	}
	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("ΩÃ∆π≈“«Ú");
	}
	@Override
	public void speakEnglish() {
		// TODO Auto-generated method stub
		System.out.println("I can speak English");
	}

}
