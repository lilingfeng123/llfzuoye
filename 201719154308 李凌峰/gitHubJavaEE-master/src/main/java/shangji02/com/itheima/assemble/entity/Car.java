package shangji02.com.itheima.assemble.entity;

public class Car {
    private String brand;
    private String color;
    private Integer rank;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", rank=" + rank +
                '}';
    }
}
