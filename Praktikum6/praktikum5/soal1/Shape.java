package Praktikum6.praktikum5.soal1;
abstract class Shape {
    protected String shapeName;
    public Shape(String name) {
        shapeName = name;
    }
    public abstract double area();
    public String toString() {
        return shapeName;
    }
}

