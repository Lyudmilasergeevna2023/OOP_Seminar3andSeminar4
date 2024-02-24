package Domain;

/**
 * Класс описывает структуру для создания объектов типа Teacher
 */
public class Teacher extends Person{
    private String acadDegree;

    public Teacher(String firstName, int age, String acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
    }
}
