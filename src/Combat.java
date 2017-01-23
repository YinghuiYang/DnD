
public class Combat {
	private boolean result;
	
	public Combat(Figure p1, Figure p2){
		while(p1.getHp()>=0 && p2.getHp()>=0){
			int hpLoss = p1.getAtt() - p2.getDef();
			if(hpLoss>0){
				p2.loseHp(hpLoss);
			}
			else{
				hpLoss = 0;
			}
			System.out.println(p1.getName()+" deals "+hpLoss+" to "+p2.getName()); 
			
			if(p2.getHp()>0){
				hpLoss = p2.getAtt() - p1.getDef();
				if(hpLoss>0){
					p1.loseHp(hpLoss);
				}
				else{ 
					hpLoss = 0;
				}
				System.out.println(p2.getName()+" deals "+hpLoss+" to "+p1.getName()); 
			}
		}
		result = p1.getHp()>0;
	}
	
	public boolean summary(){
		return result;
	}
}
