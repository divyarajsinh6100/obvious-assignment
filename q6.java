import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Student{
   private int id;
   private String firstName;
   private String lastName;
   private String branch;
   private String address;
   private String contactNo;
   private String DOB;

   public Student (int id,String firstName, String lastName, String branch, 
   String address, String contactNo,String DOB){
    this.id=id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.branch = branch;
    this.address = address;
    this.contactNo=contactNo;
    this.DOB=DOB;
   }

   public int getId(){
    return id;
   }

   public void setId(int id){
    this.id=id;
   }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String LastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getBranch(){
        return branch;
    }

    public void setBranch(String branch){
        this.branch = branch;
    }

    public String getAddress(){
        return address;

    }

    public void setAddress(String address){
        this.address=address;

    }

    public String getContactNo(){
        return contactNo;
    }

    public void setContactNo(String contactNo){
        this.contactNo=contactNo;
    }

    public String getbirthDate(){
        return DOB;
    }

    public void setbirthDate(String DOB){
        this.DOB=DOB;
    }

}

class StudentDetails{
    private List<Student> admin = new ArrayList<>();

    public void addStudent(int id, String firstName, String lastName, String contactNo, String branch, String address,
    String DOB){
        if(findId(id)==null){
            admin.add(new Student(id, firstName, lastName, branch, address, contactNo,DOB));
        }else{

            System.out.println("Enter the unique Id"+id+"this id is present is already exits");
        }
    }

    private Student findId(int id){
        for(Student i:admin){
            if(id==i.getId())
            return i;
        }
        return null;
    }

    public boolean printEveryThing(){
        for(Student i:admin){
            System.out.println("Id:"+i.getId()+" "+
            "Name : " + i.getFirstName() + ", " +
            "Contact Number : " + i.getContactNo() + ", " +
            "Branch : " + i.getBranch() + ", " +
            "Address : " + i.getAddress() + ", " +
            "Date Of Birth : " + i.getbirthDate());

        }
        return true;
    }
    public boolean update(int id, int info,String newString) {
        switch (info) {
            case 1:
                findId(id).setFirstName(newString);
                break;
            case 2:
                findId(id).setLastName(newString);
                break;
            case 3:
                findId(id).setContactNo(newString);
                break;
            case 4:
                findId(id).setBranch(newString);
                break;
            case 5:
                findId(id).setAddress(newString);
                break;
            case 6:
                findId(id).setbirthDate(newString);
                break;
        }
        return true;
    }

    public boolean listByBranch(){
        Map<String, List<Student>> map=new HashMap<>();
        for (Student i : admin) {
            if (!map.containsKey(i.getBranch()))
                map.put(i.getBranch(), new ArrayList<>());
            map.get(i.getBranch()).add(i);
        }
        for (String branch : map.keySet()) {
            System.out.println("Branch is " + branch);
            for (Student s : map.get(branch))
                System.out.println("Name : " + s.getFirstName());
        }
        return true;
    }
    public boolean printAllNames() {
        for (Student i : admin)
            System.out.println(i.getFirstName());
        return true;
    }


    public boolean deleteStudent(int id) {
        admin.remove(findId(id));
        return true;
    }
}

public class q6 {
    

    public static void main(String[] args) {

        StudentDetails admin = new StudentDetails();
        admin.addStudent(1, "Divyarajsinh", "Parmar", "123456", "cp"," morbi"," 15/2/2002");

        Scanner sc=new Scanner(System.in);

        boolean flag=true;
        while (flag) {
            System.out.println("--------- welcome to the student management system ------");
            System.out.println("1. Add students");
            System.out.println("2. Delete students");
            System.out.println("3. Modify students");
            System.out.println("4. View all students");
            System.out.println("5. View everything");
            System.out.println("6. List by branch");
            System.out.println("7. Exit");
            System.out.println("please enter your choice :");

            switch (sc.nextLine()) {
                case "1":
                    System.out.println("Add student");
                    System.out.print("Enter id :");
                    int id = sc.nextInt();
                    System.out.print("Enter First Name :");
                    String fName = sc.next();
                    System.out.print("Enter Last Name :");
                    String lName = sc.next();
                    System.out.print("Enter Contact No :");
                    String cNo = sc.next();
                    System.out.print("Enter Branch :");
                    String branch = sc.next();
                    System.out.print("Enter Address :");
                    String address = sc.next();
                    System.out.print("Enter Date Of Birth(dd-mm-yyyy) :");
                    String dob = sc.next();
                    admin.addStudent(id, fName, lName, cNo, branch, address, dob);
                    break;
                case "2":
                    System.out.println("Enter the id :");
                    admin.deleteStudent(sc.nextInt());
                    break;
                case "3":
                    System.out.println("Enter id to update the Details :");
                    int tempInt=sc.nextInt();
                    System.out.println("Enter which field to update : ");
                    System.out.println("Enter 1. to update First name");
                    System.out.println("Enter 2. to update Last name");
                    System.out.println("Enter 3. to update Contact number");
                    System.out.println("Enter 4. to update Branch");
                    System.out.println("Enter 5. to update address");
                    System.out.println("Enter 6. to update Date of Birth");
                    int info = sc.nextInt();
                    System.out.println("Enter the new details");
                    admin.update(tempInt, info,sc.next());
                    break;
                case "4":
                    admin.printAllNames();
                    break;
                case "5":
                    admin.printEveryThing();
                    break;
                case "6":
                    admin.listByBranch();
                    break;
                case "7":
                    flag=false;
                    System.out.println("Thank you");
            }
        }

       
    }
    
}
