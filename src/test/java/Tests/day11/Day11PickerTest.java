package Tests.day11;

import Tests.AbstractTest;
import day11.task1.Picker;
import day11.task1.Warehouse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.laughingpanda.beaninject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day11PickerTest extends AbstractTest {

    Warehouse w;
    Picker picker;

    @BeforeEach
    public void init() {
        w = new Warehouse();
        picker = new Picker(w);
    }

    @Test
    void doWorkOncePicker() {
        picker.doWork();
        assertEquals(80, picker.getSalary(),
                "Однократный вызов метода doWork() на новом объекте Picker. Проверка поля salary");
    }

    @Test
    void doWorkOnceWarehouse() {
        picker.doWork();
        assertEquals(1, w.getCountOrder(),
                "Однократный вызов метода doWork() на новом объекте Picker. Проверка поля countPickedOrders" +
                        " у Warehouse");
    }

    @Test
    void doWorkTwice() {
        picker.doWork();
        picker.doWork();
        assertEquals(160, picker.getSalary(),
                "Двукратный вызов метода doWork() на новом объекте Picker. Проверка поля salary");
    }

    @Test
    void doWorkTwiceWarehouse() {
        picker.doWork();
        picker.doWork();
        assertEquals(2, w.getCountOrder(),
                "Двукратный вызов метода doWork() на новом объекте Picker. Проверка поля countPickedOrders " +
                        "у Warehouse");
    }

    @Test
    void bonusYes() {
        Inject.field("countOrder").of(w).with(1500);
        assertEquals(3, picker.bonus(),
                "Расчет бонуса сборщика при countOrder = 1 500 (Warehouse)");
    }

    @Test
    void bonusNo() {
    	Inject.field("countOrder").of(w).with(1000);
        assertEquals(1, picker.bonus(),
                "Расчет бонуса сборщика при countOrder = 1 000 (Warehouse)");
    }
}