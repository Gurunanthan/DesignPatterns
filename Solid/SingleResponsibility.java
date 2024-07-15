class SingleResponsibility {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 40, 25);

        SalaryCalculator.calculateSalary(employee);
        HoursCalculator.calculateHours(employee);
        EmployeeRepository.saveEmpData(employee);
    }
}

class Employee {
    private String name;
    private int hoursWorked;
    private double hourlyRate;
    private double salary;

    public Employee(String name, int hoursWorked, double hourlyRate) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class SalaryCalculator {
    public static void calculateSalary(Employee employee) {
        double salary = employee.getHoursWorked() * employee.getHourlyRate();
        employee.setSalary(salary);
        System.out.println("Salary for " + employee.getName() + " is " + salary);
    }
}

class HoursCalculator {
    public static void calculateHours(Employee employee) {
        System.out.println(employee.getName() + " worked " + employee.getHoursWorked() + " hours.");
    }
}

class EmployeeRepository {
    public static void saveEmpData(Employee employee) {
        System.out.println("Saving data for " + employee.getName() + ": Hours Worked - " + employee.getHoursWorked() + ", Hourly Rate - " + employee.getHourlyRate() + ", Salary - " + employee.getSalary());
    }
}
