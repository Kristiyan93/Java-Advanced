package Exercises.F_Animals;

public class Tomcat extends Animal{

    private static final String SOUND = "Give me one million b***h";

    public Tomcat(String name, Integer age, String gender) {
        super(name, age, gender);
    }

    @Override
    protected void setGender(String gender) {
        if (!gender.equals(MALE_GENDER)) {
            throw new IllegalArgumentException(
                    ErrorMessageConstants.INVALID_INPUT_MESSAGE);
        }
        super.setGender(gender);
    }

    public String produceSound() {
        return SOUND;
    }
}
