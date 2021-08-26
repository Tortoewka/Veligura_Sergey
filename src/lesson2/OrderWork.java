package lesson2;

// приказ о приеме на работу
public class OrderWork extends Order {
    protected static String title = "приказ о приеме на работу";
    private int nambre = 0;
    protected String nameWorker;//сотрудник
    protected String orderText;//текст приказа
    private String status = " ";//статус





    public OrderWork(String name) {
        nambre++;
        nameWorker = name;
        status="СОЗДАН";
        orderText = "текст приказа";


    }


    @Override
    public int getNambre() {
        return nambre;
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

