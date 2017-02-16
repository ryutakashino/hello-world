public class GatlingGun extends Buki{
    GatlingGun(Hero h){
        this.name = "ガトリングガン";
    }

    GatlingGun(){
        this.name = "ガトリングガン";
    }
    
    public void attack(Man m){
        int damage = 0;
        System.out.println("射撃開始！");
        for(int i = 0;i < 100;i++){
            int random = (int)(Math.random() * 4);
            if(random == 0){
                System.out.println("hit!");
                damage++;
            }else{
                System.out.println("missed!");
            }
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                
            }
        }
        System.out.println("合計" + damage + "発当たった！　" + damage + "ダメージ！");
        m.hp -= damage;
    }

	public void description(Hero h) {
		System.out.println("ガトリングガン！");
        System.out.println("毎分6000発の発射速度を誇る！");
        System.out.println("ただしゴム弾しか発射できない！");
	}
}