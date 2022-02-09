package Test1;

public class BirdQn4Main {

	public static void main(String[] args) {
		
		BirdQn4 b1= new BirdQn4("Tweet", "Red");
		
		System.out.println(b1.name);
		System.out.println(b1.color);
		

        BirdQn4 b2= new BirdQn4("Abc", "Blue",2, 1);
		
		System.out.println(b2.name);
		System.out.println(b2.color);
		
        BirdQn4 b3= new BirdQn4("Xyz", 5, "Pink", 4);
		
		System.out.println(b3.name);
		System.out.println(b3.color);
		
	}

}
