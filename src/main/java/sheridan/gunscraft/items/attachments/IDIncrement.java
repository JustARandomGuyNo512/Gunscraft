package sheridan.gunscraft.items.attachments;

public class IDIncrement {
    private static int ID = 0;
    public static int getID() {
        synchronized (Object.class) {
            return ++ID;
        }
    }
}
