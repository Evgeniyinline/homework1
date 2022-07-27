package guru.qu;

public class Loko {
    int speed;
    String name;

    public Loko(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    public Loko() {
    }

    void goToRoad() {
        if (speed >= 90) {
            System.out.println("Пассажирские поезда ездят со скоростью более 90 км/ч!");
        } else {
            System.out.println("Грузовые поезда ездят со скоростью до 90 км/ч!");
        }
    }
    void sayModel() {
        if (speed >= 90) {
            System.out.println(name + ":ЭП20");
        } else {
            System.out.println(name + ":2ТЭ116");
        }
    }
}