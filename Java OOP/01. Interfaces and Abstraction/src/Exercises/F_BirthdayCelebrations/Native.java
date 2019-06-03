package Exercises.F_BirthdayCelebrations;

public abstract class Native implements Birthdayable {
    private String id;

    protected Native(String id) {
        this.setId(id);
    }

    private void setId(String id) {
        this.id = id;
    }
}
