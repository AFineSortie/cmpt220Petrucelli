
public class PC {
	public String name;
	public int level = 1;
	public int hp = 1;
	public int str = 10;
	public int dex = 10;
	public int con = 10;
	public int intel = 10;
	public int wis = 10;
	public int cha = 10;
	public int[] skills = new int[18];
	public int prof1;
	public int prof2;
	public int prof3;

	
	
	public PC() {
		
	}
	
	public PC(String name, int level, int hp, int str, int dex, int con, int intel, int wis, int cha, int prof1, int prof2, int prof3) {
		this.name = name;
		this.level = level;
		this.hp = hp;
		this.str = str;
		this.dex = dex;
		this.con = con;
		this.intel = intel;
		this.wis = wis;
		this.cha = cha;
		this.prof1 = prof1;
		this.prof2 = prof2;
		this.prof3 = prof3;
		
		skills[prof1] += level/2;
		skills[prof2] += level/2;
		skills[prof3] += level/2;
	}
}
