public class Plane implements Flyable,Speakable{
    @Override
    public String drive() {
        return "silnik";
    }

    @Override
    public double distance() {
        return 5000;
    }

    @Override
    public String speak() {
        return "sssss";
    }
}
