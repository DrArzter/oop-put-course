package Lesson_11;

public class Substring implements Sequance {
    private Sequance sequance;
    private int begin;
    private int end;

    Substring(Sequance sequance, int begin, int end){
        this.begin = begin;
        this.end = end;
        this.sequance = sequance;

    }

    @Override
    public String printedSeq() {
       return sequance.printedSeq().substring(begin, end);
    }
    
}
