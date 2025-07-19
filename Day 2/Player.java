package logesh;

public class Player {
	String name;
	String team;
	int score;
	Player(String name, String team, int score) {
		this.name = name;
		this.team = team;
		this.score = score;
	}
	void updateScore(int points) {
		score = score + points;
		System.out.println(team+" player "+name+" scored "+points+" points. Total Score: "+score);
	}
	void display() {
		System.out.println("Player: "+name);
		System.out.println("Team: "+team);
		System.out.println("Total Score: "+score);
		
	}
	public static void main(String [] args) {
		Player p1 = new Player("M S Dhoni", "Chennai Super Kings", 10);
		p1.updateScore(25);
		p1.updateScore(12);
		p1.updateScore(30);
		p1.display();
		
	}
}