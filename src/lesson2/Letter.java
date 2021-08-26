package lesson2;
// письмо
public class Letter {
    protected static String title = "письмо";
    private int nambre = 0;
    protected String sender;//от кого
    protected String  recipient;//кому


    Letter(){
        nambre++;
        sender = "Работодатель";
    }

    public int getNambre() {
        return nambre;
    }
}
