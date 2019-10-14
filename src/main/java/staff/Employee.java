package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNINumber(){
        return this.niNumber;
    }

    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(double increase){
        if (increase >=0) {
            this.salary += increase;
        }
    }

    public double payBonus() {
        return (this.salary / 100);
    }

    public void setName(String name){
        if (name != null && !name.equals("")) {
                this.name = name;
        }
    }

}
