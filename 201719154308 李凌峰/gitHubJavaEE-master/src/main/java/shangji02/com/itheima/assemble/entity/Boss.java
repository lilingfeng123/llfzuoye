package shangji02.com.itheima.assemble.entity;

public class Boss {
    private String name;
    private String company;
    private Car car;
    private String hobby;


    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }


    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", car=" + car +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
