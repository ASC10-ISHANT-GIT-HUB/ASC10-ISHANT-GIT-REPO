public class QuizLastQ {
    public static void main(String[] args) {
        Employee.companyName = "Ascendion";
        Employee emp=new Employee();
        emp.emoployeeName="john";
        Employee emp2=new Employee();
        emp2.emoployeeName="Rambo";

        System.out.println(Employee.companyName);
        System.out.println(Employee.companyName);
        System.out.println(Employee.companyName);
        System.out.println(emp.emoployeeName);
        System.out.println(emp2.emoployeeName);
        emp.companyName="Ascendion Eng";
        System.out.println(Employee.companyName);
        System.out.println(Employee.companyName);
        System.out.println(Employee.companyName);

    }
}
class Employee{
    static  String companyName;
    String emoployeeName;
}
