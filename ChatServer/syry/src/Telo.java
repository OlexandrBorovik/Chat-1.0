import java.io.Serializable;

public class Telo implements Serializable {

   private int weight = 50;
   @Save
    private String name = "tilo";
    @Save
    private  int age = 999;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Telo{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
