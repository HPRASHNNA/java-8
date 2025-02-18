package Question;

public class employee {

    private int id;
    private String name;
    private int age;
    private String departNames;
    private String address;
    private double salary;
    private String gender;

    public employee(int id, String name, int age, String departNames, String address, double salary, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.departNames = departNames;
        this.address = address;
        this.salary = salary;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartNames() {
        return departNames;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public String getGender() {
        return gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartNames(String departNames) {
        this.departNames = departNames;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", departNames='" + departNames + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                '}';
    }
}
