package classesonly;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

    private int rollNo;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void display()
    {
        System.out.println("Name of student : "+name);
        System.out.println("Roll no. of student : "+rollNo);
        System.out.println("Address : "+address);
    }


    private Address address;
}
