package org.example;

public abstract class Clothes {
    protected String type;
    protected String category;

    public Clothes(String type, String category) {
        this.type = type;
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Category: " + category;
    }
}
