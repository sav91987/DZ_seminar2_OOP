package Interfaces;
    /**
     * Интефейс возврата товара
     */
public interface iReturnOrder {
    /**
     * Функция получения id товара
     * @param idOrder - id
     * @return id товара
     */
    void getIdOrder(int idOrder);
    /**
     * Функция подтверждения возврата товара 
     * @param confirmation - по данному значению решается разрешен возврат или нет
     * @return true - возврат возможен, false - возврат невозможен
     */
    boolean returnConfirmation(boolean confirmation);
/**
     * Функция возврата денег 
     * @return возвращает деньги в случае положительного решения по возврату
     */
    void returnMoney();
} 