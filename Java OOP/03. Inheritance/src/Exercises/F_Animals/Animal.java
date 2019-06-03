package Exercises.F_Animals;

public class Animal {

    protected static final String MALE_GENDER = "Male";
    protected static final String FEMALE_GENDER = "Female";
    private static final String SOUND = "Not implemented!";

    private String name;
    private Integer age;
    private String gender;

    public Animal(String name, Integer age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(ErrorMessageConstants.INVALID_INPUT_MESSAGE);
        }
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    private void setAge(Integer age) {
        if (age < 0) {
            throw new IllegalArgumentException(ErrorMessageConstants.INVALID_INPUT_MESSAGE);
        }
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    protected void setGender(String gender) {
        if (!gender.equals(MALE_GENDER) && !gender.equals(FEMALE_GENDER)) {
            throw new IllegalArgumentException(ErrorMessageConstants.INVALID_INPUT_MESSAGE);
        }
        this.gender = gender;
    }

    public String produceSound() {
        return SOUND;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.getClass().getSimpleName())
                .append("\n")
                .append(String.format("%s %d %s", this.name
                        ,this.age, this.gender))
                .append("\n")
                .append(produceSound());

        return sb.toString();
    }
}
