
public class Vissen {
	public static void main(String[] args) {
		
		Visser visser1 = new Visser("Jan");
		visser1.boot = new Boot();
		System.out.println(visser1.naam);
		visser1.vissen();
		Weer.mooiWeer = true;
		visser1.vissen();
		System.out.println(visser1.boot.gewicht);
		
	}
}
class Visser{
	String naam;
	Boot boot;
	Visser(String deNaam){
		naam = deNaam;
	}
	void vissen() {
		if(Weer.mooiWeer) {
		Vis vis = new Vis(7);
		boot.gewicht += vis.visGewicht;
		}else {
			System.out.println("Gaat mooi niet door");
		}
	}
}
class Boot{
	int gewicht;
}
class Vis{
	int visGewicht;
	Vis(int gewicht){
		visGewicht = gewicht;
	}
}
class Weer{
	static boolean mooiWeer;
}
