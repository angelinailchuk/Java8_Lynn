package homework.functional.intarfaces;

public class User {

    private int age;
    private String name;
    private int weight;
    private boolean sex;
    private String speciality;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean getSex() {
        return sex;
    }

    public String getSpeciality() {
        return speciality;
    }

    public User(int age, String name, int weight, boolean sex, String speciality) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.sex = sex;
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        String sexString;
        if (sex) {
            sexString = "male";
        } else {
            sexString = "female";
        }
        return "Name - " + name + ", Age - " + age + ", Weight - " + weight + ", Sex - " + sexString
                + ", Speciality - " + speciality;
    }
}
