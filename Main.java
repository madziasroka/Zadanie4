import java.awt.datatransfer.FlavorEvent;

public class Main {
    public static void main(String[] args) {

        Flyable f1 = new Bird();
        Flyable f2 = new Plane();
        Flyable f3 = new UFO();
        // Flyable.hybrid(f1,f2);


        Flyable[] ftab = new Flyable[]{f1, f2, f3, Flyable.hybrid(f1, f2)};


        Speakable birdSpeak = () -> "CwirCwir";
        Speakable planeSpeak = () -> "szzzzzzzz";
        Speakable ufoSpeak = () -> "jdhushjs";


        Speakable[] stab = new Speakable[]{birdSpeak, planeSpeak, ufoSpeak};

        Flyable shorted = shortestDis(ftab);
        System.out.println("Najkrótszy dystans wynosi: " + shorted.distance());

        Speakable loud = loudest(stab);
        System.out.println("Najglosniejszy dzwiek: " + loud.speak());

    }

    public static Flyable shortestDis(Flyable[] arr) {
        Flyable shortestDistance = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (shortestDistance.distance() >= arr[i].distance()) {
                shortestDistance = arr[i];
            }
        }
        return shortestDistance;
    }

    public static Speakable loudest(Speakable[] arr){
        Speakable loudestSpeak = arr[0];
        for(int i = 0 ;i < arr.length ; i++){
            if(loudestSpeak.speak().length() <= arr[i].speak().length()){
                loudestSpeak = arr[i];
            }
        }
        return loudestSpeak;
    }
}