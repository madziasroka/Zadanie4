public interface Flyable {
    String drive();
    double distance();
    static Flyable hybrid(Flyable a,Flyable b){


        Flyable c = new Flyable() {
            @Override
            public String drive() {
                return a.drive() + b.drive();
            }

            @Override
            public double distance() {
                return a.distance() + b.distance();
            }
        };

      return c;
   }
}
