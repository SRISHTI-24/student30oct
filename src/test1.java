class Member
{
    String Name;
    int age;
    int phoneno;
    String address;
    int salary;
    void printsalary(int salary)
    {
        System.out.println(salary);
    }
}
class Employee extends Member{
    String specialization;
    String department;
    Employee(String Name, int age, int phoneno, String address)
    {
        this.Name = "Srishti";
        this.age = 19;
        this.phoneno = 798653333;
        this.address = "Uttar pradesh , India";
    }
    void printsalary(int salary)
    {
        System.out.println(salary);
    }
}
class Manager extends Member
{
    Manager()
    {
        this.Name = "Sunita";
        this.age = 19;
        this.phoneno = 748853390;
        this.address = "Madhya pradesh , India";
    }
    void printsalary(int salary)
    {
        System.out.println(salary);
    }
}
public class test1 {
    public static void main(String[] args) {
        Manager m =new Manager();
        Employee e =new Employee();
        Manager m1 = new Manager();

    }
}
