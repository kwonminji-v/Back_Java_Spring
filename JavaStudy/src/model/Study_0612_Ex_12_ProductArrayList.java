package model;

public class Study_0612_Ex_12_ProductArrayList<T> {
	
    private T code;
    private T name;
    private T color;
    private T qty;
    


    public Study_0612_Ex_12_ProductArrayList(T code, T name, T color, T qty) {
        this.code = code;
        this.name = name;
        this.color = color;
        this.qty = qty;
    }

    public T getCode() {
        return code;
    }

    public void setCode(T code) {
        this.code = code;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getColor() {
        return color;
    }

    public void setColor(T color) {
        this.color = color;
    }

    public T getQty() {
        return qty;
    }

    public void setQty(T qty) {
        this.qty = qty;
    }
}
