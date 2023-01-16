package Lesson_11;

public class Concatenate implements Sequance{
    private Sequance sequance;
    private Sequance sequance2;
    Concatenate(Sequance sequance, Sequance sequance2){
        this.sequance = sequance;
        this.sequance2 = sequance2;

    }

    @Override
    public String printedSeq(){
       return sequance.printedSeq()+sequance2.printedSeq();
    }
    
}

