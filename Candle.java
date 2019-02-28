package Capitulo10.Ejercicios;

public class Candle {
    private String color;
    private Integer height;
    private Double price;

    public Candle() {
        color = "none";
        height = 0000;
        price = 0.00;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public Integer getHeight() {
        return height;
    }

    public Double getPrice() {
        return getHeight()*2.00;
    }


}
