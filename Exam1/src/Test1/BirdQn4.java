package Test1;

public class BirdQn4 {
		
		String name;
		String color;
		int eyes;
		int age;
		
		public BirdQn4 (String name, String color, int eyes, int age) {
		this.name=name;
    	this.color=color;
    	this.eyes=eyes;
    	this.age=age; }
    	
		public BirdQn4(String name, int eyes, int age, String color) {
			this.name=name;
	    	this.eyes=eyes;
	    	this.age=age;
		    this.color=color; }
		
	    public BirdQn4 (String name, int eyes, String color, int age) {
	    	this.name=name;
	    	this.eyes=eyes;
	    	this.age=age;
		    this.color=color; 
	    }
	    
	    public BirdQn4 (String color, String name) {
	    	this.name=name;
	    	this.color=color;
	    }
	}


