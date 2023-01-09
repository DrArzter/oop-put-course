public class main {
    public static void main(String[] args) {
        Shiritori shiritori = new Shiritori();
        shiritori.play("word");
        shiritori.play("dowry");
        shiritori.play("yodel");
        shiritori.printWords();
        shiritori.play("motive");
        shiritori.restart();
        shiritori.play("maid");
        shiritori.play("destroyer");
        shiritori.play("revolution");
        shiritori.restart();
    }
}
