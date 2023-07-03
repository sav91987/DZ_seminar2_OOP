package Classes;

/**
 * Класс клиента с акцией, наследуемый от Actor
 * 
 */
public class PromotionClient extends Actor {

    private int idProm;
    private String nameProm;
    static int numOfPromMembers = 10;

    /**
     * @param name             - имя клиента с акцией
     * @param idProm           - id клиента с акцией
     * @param nameProm         - название акции
     * @param numOfPromMembers - масимальное число участников
     */
    public PromotionClient(String name, int idProm, String nameProm, int numOfPromMembers) {
        super(name + " (prom)");
        this.idProm = idProm;
        this.nameProm = nameProm;

    }

    @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOder) {
        super.isMakeOrder = makeOder;
    }

    public void setMakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
    }

    public Actor getActor() {
        return this;
    }

    public void getIdOrder(int idOrder) {
        super.idOrder = idOrder;
    }

    public boolean returnConfirmation(boolean confirmation) {
        super.resultConfirmation = confirmation;
        return false;
    }

    public void returnMoney() {
    }

}
