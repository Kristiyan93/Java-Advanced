package Exercises.E_BorderControl;

public abstract class Native implements Identifiable {
    private String id;

    protected Native(String id) {
        this.setId(id);
    }

    private void setId(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
