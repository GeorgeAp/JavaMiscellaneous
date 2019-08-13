class Student{
    public int roll_no;
    public String name;

    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class ArrayOfObject {

    public static void main(String[] args){

        // declaring an Array of integers and allocating memory for 5 objects of type Student
        Student[] arr = new Student[5];
        arr[0] = new Student(1, "George");
        arr[1] = new Student(2, "Kofi");
        arr[2] = new Student(3, "Prince");
        arr[3] = new Student(4, "Martin");
        arr[4] = new Student(5, "Daniel");

        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : " + arr[i].roll_no +" "+ arr[i].name);

    }

}
