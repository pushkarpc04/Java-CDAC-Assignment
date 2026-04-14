class Student
{
    int sid;
    String name;
    int marks[];

    Student(int id, String n, int m[])
    {
        sid = id;
        name = n;
        marks = m;
    }

    double calAverage()
    {
        int sum = 0;
        for(int i=0;i<marks.length;i++)
        {
            sum = sum + marks[i];
        }
        return (double)sum / marks.length;
    }

    void display()
    {
        System.out.println("ID of student: " + sid);
        System.out.println("Name of student: " + name);
        System.out.print("Marks get : ");
        for(int i=0;i<marks.length;i++)
        {
            System.out.print(marks[i] + " ");
        }
        System.out.println("\nAverage: " + calAverage());
    }
}