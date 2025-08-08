package askedquestions;
import java.util.HashSet;
import java.util.Objects;

class Employee2 {
    private int empid;
    private String name;

    public Employee2(int empid) {
        this.empid = empid;
    }

    public Employee2() {}

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ✅ Override equals and hashCode so HashSet can detect duplicates
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee2)) return false;
        Employee2 employee = (Employee2) o;
        return empid == employee.empid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empid);
    }
}

public class DeutscheBank {
    public static void main(String[] args) {
        Employee2 e1 = new Employee2(101);
        Employee2 e2 = new Employee2(101);

        HashSet<Employee2> hs = new HashSet<>();
        hs.add(e1);
        hs.add(e2);

        System.out.println("hs size --> " + hs.size()); // ✅ Output will be 1
    }
}
