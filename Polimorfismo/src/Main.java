
public class Main {

	public static void main(String[] args) {
	
//		Animal animal = new Animal();
//		animal.Falar();
//		
//		animal = new Gato();
//		animal.Falar();
		Gato gato=new Gato();
		Cachorro cachorro=new Cachorro();
		falar(gato);
		falar(cachorro);

	}
    public static void falar(Gato a) {
    	a.Falar();
    	
    	
    }
}
