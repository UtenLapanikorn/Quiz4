package quiz4a;

// 2.1    
/**
 * ผู้จัดการ
 * คลาสนี้เป็นคลาสสืบทอดและฟิลด์สำหรับแผนกและโบนัสในการทำงาน
 */
public class Manager extends Employee {
    /**
     *แผนกของพนักงาน
     */
    private String department;
    /**
     *โบนัสในการทำงาน
     */
    private double bonus;

    // 2.2
    /**
     * ตั้งค่ารายละเอียดของพนักงาน
     * 
     * @param ผู้จัดการ ผู้จัดการจะตั้งค่ารายละเอียด
     */
    public Manager(int employeeId, String name, double salary, String department, double bonus) {
        super(employeeId, name, salary);
        this.department = department;
        this.bonus = bonus;
    }

    // 2.3
    /**
     * แสดงรายละเอียดของพนักงาน
     */
    public void displayDetails() {
        String[] details = {
                "Employee ID: " + getEmployeeId(),
                "Name: " + getName(),
                "Salary: " + calculateSalary(),
                "Department: " + department,
                "Bonus: " + bonus
        };
        for (String detail : details) {
            System.out.println(detail);
        }
    }

    // 2.4
    /** แสดงรายละเอียดของพนักงาน
    * 
    * @param condition พนักที่มีเงื่อนไขที่ต้องเปลี่ยนราละเอียด
    */
    public void displayDetails(String condition) {
        if ("full".equalsIgnoreCase(condition)) {

            String[] details = {
                    "Employee ID: " + getEmployeeId(),
                    "Name: " + getName(),
                    "Salary: " + calculateSalary(),
                    "Department: " + department,
                    "Bonus: " + bonus
            };
            for (String detail : details) {
                System.out.println(detail);
            }
        } else {

            String[] details = {
                    "Employee ID: " + getEmployeeId(),
                    "Name: " + getName()
            };
            for (String detail : details) {
                System.out.println(detail);
            }
        }
    }
}
