import java.util.Scanner;

public class GoblinRouge extends BaseHero{

    public GoblinRouge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("We are creating a Goblin rouge! Please specify the starting amount of health: ");
        this.health = scanner.nextInt();
        System.out.println("Please specify the starting amount of mana: ");
        this.mana = scanner.nextInt();
        System.out.println("Goblin rouge has been created");
        System.out.println("Healt: "+health+" Mana: "+mana);
        this.isDead = false;
    }
    @Override
    public void firePrimary() {
        System.out.println("Goblin rouge strikes from the shadows with his knives!");
    }

    @Override
    public void fireSecondary() {
        System.out.println("Goblin rouge strikes sneaking from behind!");
    }

    @Override
    public void receiveHit() {
        System.out.println("Goblin rouge has been hit by his opponents attack!");
        this.health -=35;
        if (health<=0){
            this.isDead = true;
            System.out.println("Our brave hero Goblin rouge has died!");
        }
    }

    @Override
    public void areaOfEffect(){
        this.health -=50;
        if (health<=0){
            this.isDead = true;
            System.out.println("Our brave hero Goblin rouge has died!");
        }
    }
}
