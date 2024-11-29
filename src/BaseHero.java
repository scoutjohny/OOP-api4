public abstract class BaseHero {

    int health;
    int mana;
    boolean isDead;

    public abstract void firePrimary();
    public abstract void fireSecondary();
    public abstract void receiveHit();
    public void areaOfEffect(){
        receiveHit();
    };

}
