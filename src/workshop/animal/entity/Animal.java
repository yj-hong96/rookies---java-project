package workshop.animal.entity;

public abstract class Animal {
	protected int legs;
	
	protected Animal(int legs) {
		this.legs = legs;
	}
	
	public abstract void eat();
	
	public void walk() {
		System.out.println("동물을" + legs + "발로 걷는다.");
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setName(String name) {
		
		
	}

	public void play() {
		
		
	}
	
}