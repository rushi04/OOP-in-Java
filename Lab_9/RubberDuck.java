

public class RubberDuck extends Duck{

	void display()
	{
		this.swin();
		this.getFlyBehavior().fly();
		this.getQuackBehavior().quack();
	}
	public RubberDuck(){
		this.setFlyBehavior(new FlyNoWay());
		this.setQuackBehavior(new Squeak());
		
	}
}
