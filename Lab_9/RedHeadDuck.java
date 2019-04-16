

public class RedHeadDuck extends Duck{
	
	void display()
	{
		this.swin();
		this.getFlyBehavior().fly();
		this.getQuackBehavior().quack();
	}
	public RedHeadDuck(){
		this.setFlyBehavior(new FlyWithWings());
		this.setQuackBehavior(new MuteQuack());
		
	}

}
