package com.company;

class GameCharacter{
    private String name;
    private int lifePoint = 100;
    private int attackHitPoint;
    private int attackKickPoint;

    GameCharacter(String name, int attackHitPoint, int attackKickPoint){
        this.name = name;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }
    String getName(){
        return name;
    }
    int getLifePoint(){
        return lifePoint;
    }

    void hit(GameCharacter gameCharacter){
        gameCharacter.lifePoint = gameCharacter.lifePoint - this.attackHitPoint;
    }

    void kick(GameCharacter gameCharacter){
        gameCharacter.lifePoint = gameCharacter.lifePoint - this.attackKickPoint;
    }

    public void vs(GameCharacter gameCharacter){
        int hasil = Integer.compare(this.lifePoint, gameCharacter.getLifePoint());
        if(hasil > 0) {
            System.out.println(this.name + " WIN ");
        }else if (hasil < 0) {
            System.out.println(gameCharacter.getName() + " LOSE ");
        }else{
            System.out.println(" DRAW ");
        }
    }

}

public class Main {
    public static void main(String[] args) {
        GameCharacter gameCharacter1 = new GameCharacter("Raiden", 10, 20);
        GameCharacter gameCharacter2 = new GameCharacter("Sub-Zero", 5, 25);

        //Raiden tendang Zero
        gameCharacter1.kick(gameCharacter2);

        //Zero tendang balik
        gameCharacter2.kick(gameCharacter1);

        //Raiden pukul 3 kali
        for(int a=1; a < 4; a++){
            gameCharacter2.hit(gameCharacter1);
        }

        //Raiden tendang 4 kali
        for(int b=1; b < 5; b++){
            gameCharacter1.kick(gameCharacter2);
        }

        //Life point Raiden dan Zero
        System.out.println("Sisa life point " + gameCharacter1.getName() + " = " + gameCharacter1.getLifePoint());
        System.out.println("Sisa life point " + gameCharacter2.getName() + " = " + gameCharacter2.getLifePoint());

        //Hasil pertarungan
        gameCharacter1.vs(gameCharacter2);

    }
}
