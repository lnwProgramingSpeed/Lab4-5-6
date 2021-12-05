package School;

public class Student {
    // Student part
    private String stuname;
    private String stumail;
    private int stuid;

    public Student() {
        stuname = "Unassigned";
        stumail = "Unassigned";
        stuid = 123456;
    }

    public String getEmail() {
        return stumail;
    }

    public int getID() {
        return stuid;
    }

    public String getName() {
        return stuname;
    }

    public void setID(int ID) {
        stuid = ID;
    }

    public void setEmail(String address) {
        stumail = address;
    }

    public void setName(String Name) {
            stuname = Name;
    }
}
