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

	public void setName(String name) {
		if(name == null) {
			throw new IllegaArgumentException("名前がnullである。処理を中断。");
		}
		if(name.length() <= 1) {
			throw new IllegaArgumentException("名前が短すぎる。処理を中断。");
		}
		if(name.length() >= 8) {
			throw new IllegaArgumentException("名前が長すぎる。処理を中断。");
		}
		this.name = name;
	}
}
