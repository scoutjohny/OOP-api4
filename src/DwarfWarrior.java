import java.util.Scanner;

public class DwarfWarrior extends BaseHero{
    int rage;

    public DwarfWarrior(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("We are creating a Dwarf warrior! Please specify the starting amount of health: ");
        this.health = scanner.nextInt();
        System.out.println("Please specify the starting amount of mana: ");
        this.mana = scanner.nextInt();
        this.rage = 0;
        this.isDead = false;
        System.out.println("Dwarf warrior has been created");
        System.out.println("Healt: "+health+" Mana: "+mana+" Rage: 0");
    }
    @Override
    public void firePrimary() {
        System.out.println("Dwarf warrior swings his trusty axe!");
        this.rage +=15;
    }

    @Override
    public void fireSecondary() {
        System.out.println("Dwarf warrior swings his other more trusty axe!");
        this.rage +=25;
    }

    public void specialStrike1(){
        System.out.println("Dwarf warrior swirls and slams the opponent with both of his axes!");
        this.rage -=40;
    }

    @Override
    public void receiveHit() {
        System.out.println("Dwarf warrior has been hit by his opponents attack!");
        this.health -= 20;
        if (health<=0){
            this.isDead = true;
            System.out.println("Our brave hero Dwarf Warrior has died!");
        }
    }

    @Override
    public void areaOfEffect(){
        this.health -=10;
        if (health<=0){
            this.isDead = true;
            System.out.println("Our brave hero Dwarf Warrior has died!");
        }
    }
}
