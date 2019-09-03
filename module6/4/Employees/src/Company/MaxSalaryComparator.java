package Company;

import java.util.Comparator;

public class MaxSalaryComparator implements Comparator<Employee> {

    Company company;

    public MaxSalaryComparator(Company company) {
        this.company = company;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getMonthSalary(company) > o2.getMonthSalary(company)) {
            return -1;
        }
        if (o1.getMonthSalary(company) < o2.getMonthSalary(company)) {
            return 1;
        }
        return 0;
    }
}