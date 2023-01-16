package Lesson_11;

public class LowerCased implements Sequance {
    private Sequance sequance;

    LowerCased(Sequance sequance){
        this.sequance = sequance;

    }

    @Override
    public String printedSeq() {
       return sequance.printedSeq().toLowerCase();
    }
    
}