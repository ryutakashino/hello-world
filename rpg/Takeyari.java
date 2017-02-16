public class Takeyari extends Buki{
    Takeyari(Hero h){
        this.name = "竹槍";
    }

    Takeyari(){
        this.name = "竹槍";
    }
    
    public void attack(Man m){
        int damage;
        System.out.println(this.name+"で攻撃！");
        int ran = (int)(Math.random() * 6);
        int randam = (int)(Math.random() * 4);
        if (ran<4){
            damage=8+ran;
            System.out.println(m.name+"に"+damage+"のダメージを与えた！");
        }else {
            damage = 49+randam;
            System.out.println(m.name+"の脇腹を貫いた！");
            System.out.println(damage+"の大ダメージ！！");
        }
        m.hp -= damage;
    }
	public void description(Hero h) {
		System.out.println("竹槍だ！");
        System.out.println("威力は低いが脇腹に大ダメージを与えられる！");
        System.out.println("これで君もロンギヌス！！");
	}
}