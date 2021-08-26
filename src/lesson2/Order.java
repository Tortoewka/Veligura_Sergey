package lesson2;

public class Order {
    private int nambre = 0;
    private String status;//статус
    protected String orderText;//текст приказа
    protected String nameWorker;//сотрудник

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }


    // изменить статус на "ИСПОЛНЕН"
    public void setExe() {
        setStatus("ИСПОЛНЕН");
    }

    public int getNambre() {
        return nambre;

    }

    public void statrtStatus() {
                  setStatus("ИСПОЛНЕН");

        }
    }




