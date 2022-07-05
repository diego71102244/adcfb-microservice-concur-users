package am.concur.users.users.response;

public class Companys {
    private String name;
    private String id;
    private String employeId;

    public Companys(String name, String id, String employeId) {
        this.name = name;
        this.id = id;
        this.employeId = employeId;
    }

    public Companys(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployeId() {
        return employeId;
    }

    public void setEmployeId(String employeId) {
        this.employeId = employeId;
    }
}
