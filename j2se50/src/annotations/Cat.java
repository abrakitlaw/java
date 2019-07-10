package annotations;

public class Cat {

    private String type;

    private String sound;

    public Cat() {
    }

    public Cat(String type, String sound) {
        this.type = type;
        this.sound = sound;
    }

    public String getType() {
        return type;
    }

    public String getSound() {
        return sound;
    }
}
