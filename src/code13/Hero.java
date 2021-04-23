package code13;

public class Hero {
	private int hp;
	private String name;
	Sword sword;

	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}

	private void die() {
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GAME OVERです。");
	}

	public String getName() {
		return this.name;
	}
}
