package HerancaPolimorfismo.Ex3.entities;

public class Employee {

    private String name;
    private Integer hours;
    private Double valuePerHour;

    public static ArrayList<Employee> employees = new ArrayList<>();

    public static void addEmp(Employee emp) {
        employees.add(emp);
    }

    public static void remoEmp(Employee emp) {
        employees.remove(emp);
    }

    public static void listTotal() {
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " " + emp.payment());
        }
    }

    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void payment() {
    }
}
