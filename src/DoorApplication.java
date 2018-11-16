// In the DoorApplication class main method, create a Door and a Key, and open the door with the key.

public class DoorApplication {

    public static void main(String[] args) {
       Door door = new Door(317);
       Key key = new Key();
       key.open(door);

    }
}
