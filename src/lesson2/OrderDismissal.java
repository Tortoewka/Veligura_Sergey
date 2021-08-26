package lesson2;

// приказ о увольнении
public class OrderDismissal extends Order {
    private int nambre = 0;
    protected static String title = "приказ о увольнении";
    protected String nameWorker;//сотрудник
    protected String orderText;//текст приказа
    protected String reassonOfDismissal;//причина увольнения
    private String status = " ";//статус

    //вставляем статус


    public OrderDismissal(String name) {
        nambre++;
        nameWorker = name;
       status="СОЗДАН";
        reassonOfDismissal="съел все конфеты";

    }


    @Override
    public int getNambre() {
        return nambre;
    }

    public void setNambre(int nambre) {
        this.nambre = nambre;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }
}
