package ir.pt.sakhad.model;

// بخشی از هر entity ای که داخل دیتابیس اضافه میشود را میتوان داخل model به frontend ارسال کرد، لذا لازم نیست همه دیتا ارسال شود
// به عبارت دیگر model بخشی از دیتای entity ار دارد

public class PersonModel {
    private String name;
    private String family;
    private Integer id;
    private Integer salary;

    public PersonModel(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

}
