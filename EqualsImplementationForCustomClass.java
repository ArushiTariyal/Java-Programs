public class EqualsImplementationForCustomClass {
    public static void main(String[] args) {
        Student jon1 = new Student("Jon",19,"Denamark");
        Student jon2 = new Student("Jon",19,"Denmark");
        Student Ron = new Student("Ron",19,"Spain");
        System.out.println(jon2.equals(jon1));
        System.out.println(jon1.equals(Ron));
    }
}
class Student {
    private String name;
    private int age;
    private String address;
    Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj){
        if(obj==null || obj.getClass()!=this.getClass()) return false;
        if(this == obj) return true;  //if pointing to same

        Student student = (Student) obj;
        if(!student.name.equals(this.name) ) return false;
        return(student.age == this.age);

    }
}
