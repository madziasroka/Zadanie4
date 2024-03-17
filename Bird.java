public class Bird implements Flyable,Speakable{
    @Override
    public String drive() {
        return "skrzydła";
    }

    @Override
    public double distance() {
        return 100;
    }

    @Override
    public String speak() {
        return null;
    }
}
