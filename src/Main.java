public class Main {
    public static void main(String[] args) {

        Hotel belagio = new Hotel("Belagio", 5);
        Client sara = new Client("Sara");
        Client renan = new Client("Renan");

        belagio.takeRooms(sara,3);
        belagio.takeRooms(renan,3);

        System.out.println(sara.howMany() + sara.confirmation());
        System.out.println(renan.howMany() + renan.confirmation());

        belagio.giveRooms(sara, 4);
        System.out.println(sara.howMany() + sara.confirmation());
        System.out.println(renan.howMany() + renan.confirmation());
    }
}