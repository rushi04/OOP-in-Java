
public class DecoyDuck extends Duck{
	
	void display()
	{
		this.swin();
		this.getFlyBehavior().fly();
		this.getQuackBehavior().quack();
	}


	public DecoyDuck(){
		this.setFlyBehavior(new FlyWithWings());
		this.setQuackBehavior(new Quack());
		
	}
}
