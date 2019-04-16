import java.util.Scanner;
public class MainClass {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Platform p1=new Platform("Platform No. 1");
		PassengerTrain []t1;
		t1=new PassengerTrain[2];
		t1[0]=new PassengerTrain("NZM HZRT SUP EXP","12191");
		Coach [] c1;
		c1=new Coach[6];
		c1[0]=new FirstAC("A1");
		c1[1]=new SecondAC("B1");
		c1[2]=new ThirdAC("C1");
		c1[3]=new Sleeper("S1");
		c1[4]=new Sleeper("S2");
		c1[5]=new GoodsCoach("G1");
		Engine[] e1;
		e1=new Engine[2];
		e1[0]=new DieselEngine("Engine 1",5000);
		e1[1]=new ElectricEngine("Engine 2",3000);
		t1[0].setTrain(c1, e1,p1);
		
		t1[1]=new PassengerTrain ("MP SMPRK KRNTI","12121");
		Coach [] c2;
		c2=new Coach[6];
		c2[0]=new FirstAC("A1");
		c2[1]=new SecondAC("B1");
		c2[2]=new ThirdAC("C1");
		c2[3]=new Sleeper("S1");
		c2[4]=new Sleeper("S2");
		c2[5]=new Sleeper("S3");
		ElectricEngine[] e2;
		e2=new ElectricEngine[2];
		e2[0]=new ElectricEngine("Engine 3",5000);
		e2[1]=new ElectricEngine("Engine 4",3000);
		t1[1].setTrain(c2, e2,p1);
		
		
		Escalator[]esc1;
		esc1=new Escalator[2];
		esc1[0]=new Escalator("Escalator 101",300);
		esc1[1]=new Escalator("Escalator 102",600);
		Lift []l1;
		l1=new Lift[1];
		l1[0]=new Lift("Lift 1");
		p1.lift=l1;
		p1.escalators=esc1;
		p1.trains=t1;
		Platform p2=new Platform("Platform No. 2");
		Train []t2;
		t2=new Train[2];
		t2[0]=new PassengerTrain("GAREEB RATH","11101");
		Coach [] c3;
		c3=new Coach[4];
		c3[0]=new FirstAC("A1");
		c3[1]=new SecondAC("B1");
		c3[2]=new Sleeper("S1");
		c3[3]=new Sleeper("S2");
		Engine[] e3;
		e3=new Engine[2];
		e3[0]=new ElectricEngine("Engine 5",6000);
		e3[1]=new DieselEngine("Engine 6",8000);
		t2[0].setTrain(c3, e3,p2);
		
		t2[1]=new GoodsTrain ("COAL EXPRESS","10054");
		Coach [] c4;
		c4=new Coach[6];
		c4[0]=new GoodsCoach("G1");
		c4[1]=new GoodsCoach("G2");
		c4[2]=new GoodsCoach("G3");
		c4[3]=new GoodsCoach("G4");
		c4[4]=new GoodsCoach("G5");
		c4[5]=new GoodsCoach("G6");
		Engine[] e4;
		e4=new Engine[2];
		e4[0]=new ElectricEngine("Engine 7",5000);
		e4[1]=new DieselEngine("Engine 8",3000);
		t2[1].setTrain(c4, e4,p2);
		
		
		Escalator[]esc2;
		esc2=new Escalator[2];
		esc2[0]=new Escalator("Escalator 103",500);
		esc2[1]=new Escalator("Escalator 104",550);
		Lift []l2;
		l2=new Lift[1];
		l2[0]=new Lift("Lift 2");
		p2.lift=l2;
		p2.escalators=esc2;
		p2.trains=t2;

		Platform p3=new Platform("Platform No. 2");
		Train []t3;
		t3=new Train[3];
		t3[0]=new PassengerTrain("LOKMANYA TILAK","13601");
		Coach [] c5;
		c5=new Coach[3];
		c5[0]=new FirstAC("A1");
		c5[1]=new SecondAC("B1");
		c5[2]=new Sleeper("S1");
		Engine[] e5;
		e5=new Engine[2];
		e5[0]=new ElectricEngine("Engine 9",4500);
		e5[1]=new DieselEngine("Engine 10",8300);
		t3[0].setTrain(c5, e5,p3);
		
		t3[1]=new PassengerTrain ("CHITRAKOOT EXPRESS","19064");
		Coach [] c6;
		c6=new Coach[6];
		c6[0]=new FirstAC("A1");
		c6[1]=new SecondAC("B1");
		c6[2]=new ThirdAC("C1");
		c6[3]=new ThirdAC("C2");
		c6[4]=new Sleeper("S1");
		c6[5]=new Sleeper("S2");
		Engine[] e6;
		e6=new Engine[2];
		e6[0]=new DieselEngine("Engine 11",3500);
		e6[1]=new DieselEngine("Engine 12",3300);
		t3[1].setTrain(c6, e6,p3);
		
		t3[2]=new PassengerTrain ("KASHI VISHWANATH EXPRESS","15151");
		Coach [] c7;
		c7=new Coach[6];
		c7[0]=new FirstAC("A1");
		c7[1]=new SecondAC("B1");
		c7[2]=new ThirdAC("C1");
		c7[3]=new ThirdAC("C2");
		c7[4]=new Sleeper("S1");
		c7[5]=new Sleeper("S2");
		Engine[] e7;
		e7=new Engine[2];
		e7[0]=new DieselEngine("Engine 13",3500);
		e7[1]=new DieselEngine("Engine 14",3300);
		t3[2].setTrain(c6, e6,p3);
		
		Escalator[]esc3;
		esc3=new Escalator[2];
		esc3[0]=new Escalator("Escalator 105",500);
		esc3[1]=new Escalator("Escalator 106",550);
		Lift []l3;
		l3=new Lift[1];
		l3[0]=new Lift("Lift 3");
		p3.lift=l3;
		p3.escalators=esc2;
		p3.trains=t3;
		WaitingRoom w[];
		w=new WaitingRoom[2];
		w[0]=new GeneralWaitingRoom("Waiting 101",100);
		w[1]=new UpperWaitingRoom("Waiting 102",100);
		TicketCounter ticketcounter[];
		ticketcounter=new TicketCounter[3];
		ticketcounter[0]=new GeneralTicketCounter("Counter 1");
		ticketcounter[1]=new ReservationTicketCounter("Counter 2");
		ticketcounter[2]=new PlatformTicketCounter("Counter 3");
		Platform platforms[]= {p1,p2,p3};
		
		RailwayStation HZRT= new RailwayStation("HAZRAT NIZAMMUDDIN STATION","NZM",platforms,ticketcounter);
		
		
		System.out.println("Select the platform to view details :\n1. Platform 1\n2. Platform 2\n1. Platform 3");
		
		switch(sc.nextInt()) {
		case 1:
			System.out.println(p1.printPlatform());
			break;
		case 2:
			System.out.println(p2.printPlatform());
			break;
		case 3:
			System.out.println(p3.printPlatform());
			break;
		}
		
	}
}
