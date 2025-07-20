package logesh;
import java.util.Scanner;
class Animal {
	String name, type;
	void animalName(String name) {
		this.name = name;
		System.out.println("Animal Name: "+name);
	}
	void animalType(String type) {
		this.type = type;
		System.out.println("Animal Type: "+type);
	}
}
class Bird extends Animal {
	String birdtype;
	void birdType(String birdtype) {
		this.birdtype = birdtype;
		System.out.println("Bird Type: "+birdtype);
	}
}
class Reptile extends Animal {
	String reptiletype;
	void reptileType(String reptiletype) {
		this.reptiletype = reptiletype;
		System.out.println("Bird Type: "+reptiletype);
	}
}
class ZooKeeper extends Animal {
	String keepername;
	void zookeeperName(String keepername) {
		System.out.print("Zookeeper name: "+keepername);
	}
}

class ZooInformation {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Bird bird = new Bird();
		System.out.print("Enter Bird Name: ");
		String birdN = sc.nextLine();
		bird.animalName(birdN);
		System.out.print("Enter Bird Type: ");
		String birdT = sc.nextLine();
		bird.animalType(birdT);
		System.out.print("Enter Specific Type: ");
		String bt = sc.nextLine();
		bird.birdType(bt);
		System.out.println();
		
		Reptile reptile = new Reptile();
		System.out.print("Enter Reptile Name: ");
		String reptileN = sc.nextLine();
		reptile.animalName(reptileN);
		System.out.print("Enter Reptile Type: ");
		String reptileT = sc.nextLine();
		reptile.animalType(reptileT);
		System.out.print("Enter Specific Type: ");
		String rt = sc.nextLine();
		reptile.reptileType(rt);
		System.out.println();
		
		ZooKeeper keeper = new ZooKeeper();
		System.out.print("Enter Zookeeper Name: ");
		String keeperN = sc.nextLine();
		keeper.zookeeperName(keeperN);
		System.out.println();
		sc.close();
	}
}