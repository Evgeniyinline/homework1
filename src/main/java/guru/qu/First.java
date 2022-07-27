package guru.qu;

public class First {

    public static void main(String[] args) {
       Loko lokomotiv = new Loko(55,"Тепловоз");
       Loko anotherLokomotiv = new Loko();
       anotherLokomotiv.name = "Электровоз";
       anotherLokomotiv.speed = 98;
       lokomotiv.goToRoad();
       lokomotiv.sayModel();
       anotherLokomotiv.goToRoad();
       anotherLokomotiv.sayModel();

    }
}
