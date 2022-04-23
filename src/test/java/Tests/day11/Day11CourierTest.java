package Tests.day11;

import Tests.AbstractTest;
import day11.task1.Courier;
import day11.task1.Warehouse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.laughingpanda.beaninject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day11CourierTest extends AbstractTest {

    Warehouse w;
    Courier courier;

    @BeforeEach
    public void init() {
        w = new Warehouse();
        courier = new Courier(w);
    }

    @Test
    void doWorkOnceCourier() {
        courier.doWork();
        assertEquals(100, courier.getSalary(),
                "Однократный вызов метода doWork() на новом объекте Courier. Проверка поля salary");
    }

    @Test
    void doWorkOnceCheckWarehouseBalance() {
        courier.doWork();
        assertEquals(1000, w.getBalance(),
                "Однократный вызов метода doWork() на новом объекте Courier. Проверка поля balance" +
                        " у Warehouse");
    }

    @Test
    void doWorkTwiceCourier() {
        courier.doWork();
        courier.doWork();
        assertEquals(200, courier.getSalary(),
                "Двукратный вызов метода doWork() на новом объекте Courier. Проверка поля salary");
    }

    @Test
    void doWorkTwiceCheckWarehouseBalance() {
        courier.doWork();
        courier.doWork();
        assertEquals(2000, w.getBalance(),
                "Двукратный вызов метода doWork() на новом объекте Courier. Проверка поля balance" +
                        " у Warehouse");
    }

    @Test
    void bonusYes() {
        Inject.field("balance").of(w).with(1_000_000);
        assertEquals(2, courier.bonus(),
                "Расчет бонуса курьера при 1_000_000_000 balance Warehouse");
    }

    @Test
    void bonusNo() {
        Inject.field("balance").of(w).with(8_000);
        assertEquals(1, courier.bonus(),
                "Расчет бонуса курьера при 8_000 balance Warehouse");
    }
}