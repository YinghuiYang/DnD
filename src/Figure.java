
public class Figure {

	private String name;
	private int lv;
	private int maxHp;
	private int hp;
	private int att;
	private int def;
	private int exp;
	
	public Figure(String newName){
		name = newName;
		lv = 1;
		att = 10;
		def = 10;
		maxHp = 200;
		exp = 0;
	}
	
	//create monster based on player lv
	public Figure(int playerLv){
		name = "monster";
		att = (int)(Math.random()*playerLv*15);
		def = (int)(Math.random()*playerLv*5);
		maxHp = (int)(Math.random()*playerLv*150);
		exp = (int)((Math.random()*10)+5);
	}
	
	public int getLv(){
		return lv;
	}
	
	public int getHp(){
		return hp;
	}
	
	public int getAtt(){
		return att;
	}
	
	public int getDef(){
		return def;
	}
	
	public String getName(){
		return name;
	}
	
	public void loseHp(int dmg){
		hp = hp-dmg;
	}
	
	public void stat(){
		System.out.println("level "+lv);
		System.out.println("attack "+att);
		System.out.println("defense "+def);
		System.out.println("experience "+exp);
	}
	
	
	public void lvUp(int newExp){  //add the exp from monsters
		exp = exp+newExp;
		if(exp >= 100){
			lv++;
			maxHp = maxHp + 75 + (int)(Math.random()*50);
			hp = maxHp;
			att = att + (int)(7.5 + Math.random()*5);
			def = def + (int)(7.5 + Math.random()*5);
			exp = exp-100;
		}
	}
	
	public boolean maxLevel(){
		return lv>=100;
	}
	
}
