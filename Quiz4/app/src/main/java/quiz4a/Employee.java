package quiz4a;


// (1.1) เขียน Java Docs
/**
 * พนักงาน
 * คลาสนี้เป็นคลาสาธารณะ
 */

 public class Employee {

    /**
     * รหัสของพนักงาน
     */
    private int employeeId;

    /**
     * ชื่อของพนักงาน
     */

    private String name;

    /**
     * เงินเดือนของพนักงาน
     */
    private double salary;

    // (1.2)
    /**
     * ตั้งค่ารายละเอียดของพนักงาน
     * 
     * @param ผู้เขียน ผู้เขียนจะตั้งค่ารายละเอียด
     */
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = (salary > 0) ? salary : 0;
    }

    // (1.3)
    /**
     * รับเงินเดือนของพนักงาน
     * 
     * @return เงินเดือน
     */
    public double calculateSalary() {
        return salary;
    }

    // (1.4)
    /**
     * รับรหัสของพนักงาน
     * 
     * @return รหัสพนักงาน
     */
    public int getEmployeeId() {
        return employeeId;
    }

    // (1.5)
    /**
     * รับชื่อของพนักงาน
     * 
     * @return ชื่อพนักงาน
     */
    public String getName() {
        return name;
    }
}