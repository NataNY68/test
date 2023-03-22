package aModifier;

public class Animal {

    public String namePublic;
    protected int ageProtected;
    String colorDefault; //default access modifier
    private double weightPrivate;

    public void eatPublic(){
        System.out.println("EAT" + +weightPrivate);
    }

    protected  void runProtected(){
        System.out.println("RUN");
    }

   private void sleepPrivate(){
        System.out.println("SLEEP"+weightPrivate);
    }

    void jumpDefault(){
        System.out.println("JUMP");
    }
}
