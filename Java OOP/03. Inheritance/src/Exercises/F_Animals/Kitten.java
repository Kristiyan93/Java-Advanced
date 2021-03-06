package Exercises.F_Animals;

public class Kitten extends Animal {

    private static final String SOUND = "Miau";

    public Kitten(String name, Integer age, String gender) {
        super(name, age, gender);
    }

    @Override
    protected void setGender(String gender) {
        if (!gender.equals(FEMALE_GENDER)) {
            throw new IllegalArgumentException(
                    ErrorMessageConstants.INVALID_INPUT_MESSAGE);
        }
        super.setGender(gender);
    }

    public String produceSound() {
        return SOUND;
    }
}
