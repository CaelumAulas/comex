package org.example.OutraParte.src.Categories;

public class Category {
    private Integer id;
    private String nameCategory;

    public Category(Integer id,String nameCategory){
        this.id = id;
        this.nameCategory = nameCategory;

    }
    public Integer getId(){
        return id;
    }
    public String getNameCategory(){
        return nameCategory;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", nameCategory='" + nameCategory + '\'' +
                '}';
    }
}
