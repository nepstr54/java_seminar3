public class Tovar1 {
    private String name;

    private Double price;

    private Integer kind;

    public Tovar1(String name, Double price, Integer kind) {
        this.name = name;
        this.price = price;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getKind() {
        return kind;
    }

    public void setKind(Integer kind) {
        this.kind = kind;
    }
}