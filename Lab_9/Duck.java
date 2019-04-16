

public abstract class Duck{
	
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	public Duck() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super();
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
	}
	

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	void swin()
	{
		System.out.println("The Duck can swin");
	}
	abstract void display();
	void performFlyBehavior()
	{
		this.flyBehavior.fly();
	}
	
	void performQuackBehavior()
	{
		this.quackBehavior.quack();
	}

}
