package oop.abstraction.abstraction1;

public abstract class SelfLearners extends Student {

    public SelfLearners(String name, int id) {
        super(name, id);
    }

    public void study(){
        System.out.println("SelfLearner study");
    }

    public String visitLibrary(){
        System.out.println("SelfLerner goes to library");
        return ".....";
    }

    public abstract void watchVideo();
}
