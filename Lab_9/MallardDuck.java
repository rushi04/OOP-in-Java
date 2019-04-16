

public class MallardDuck extends Duck{
	
	void display()
	{
		this.swin();
		this.performFlyBehavior();
		this.performQuackBehavior();
	}

	public MallardDuck()
	{
		this.setFlyBehavior(new FlyWithWings());
		this.setQuackBehavior(new Quack());
	}
}

