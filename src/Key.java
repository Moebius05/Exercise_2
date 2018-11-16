// The Key has no attributes. It has the open method that receives a door and says that it’s opening the door with its door number.

public class Key {

    public void open(Door door){
        System.out.println("I am opening the door number " + door.getNumber());
    }

}
