package org.example.OutraParte.src.Categories;

public class Test {
    public static void main(String[] args) {
        Category category = new Category(37462,"MOVEIS");
        CategoryService service = new CategoryService(category);
       // service.register();
       // for (Category mostra:service.consult()){System.out.println(mostra);}
        service.delete(37462);
        for (Category mostra:service.consultOrde()){
            System.out.println(mostra);

        }
    }
}
