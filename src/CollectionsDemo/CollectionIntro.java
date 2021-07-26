package CollectionsDemo;

public class CollectionIntro {
    public static void main(String[] args) {
       /* String[] s1=new String[4];

        Object[] obj = new Object[4];
        obj[0] =new String("Sadasiva");
        obj[1]=2;
        obj[3]= 'C';
       */

       Student[] students=new Student[5];
       students[0]=new Student(1,"sadasiva");
        students[1]=new Student(1,"sadasiva1");
        students[2]=new Student(1,"sadasiva2");
        students[3]=new Student(1,"sadasiva3");
        students[4]=new Student(1,"sadasiva4");
        students=new Student[100];

    }
}
class Student implements Comparable{
    int rollNumber;
    String name;
    public Student(int rollNumber,String name){
        this.rollNumber=rollNumber;
        this.name=name;

    }

    @Override
    public int compareTo(Object o) {
        if(rollNumber>((Student)o).rollNumber)
            return 1;
        if(rollNumber<((Student)o).rollNumber)
            return -1;
        return 0;

    }

    @Override
    public String toString() {
        return rollNumber+":"+name;
    }
}
