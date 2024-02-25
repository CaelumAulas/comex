package org.example.OutraParte.src.Products;

import org.example.OutraParte.src.DataBase.FactoryConnection;

import java.util.List;

public class ProductService {
    private FactoryConnection connection;
    private Product product;

    public ProductService(Product product){
        this.product = product;
        this.connection = new FactoryConnection();


    }
    public void register(){
        ProductDAO dao = new ProductDAO(connection.recoveringConnection());
        dao.registerProduct(this.product);

    }
    public List<Product> Products(){
        ProductDAO dao = new ProductDAO(connection.recoveringConnection());
        return dao.listProducts();

    }
    public List<Product> ProductsOrder(){
        ProductDAO dao = new ProductDAO(connection.recoveringConnection());
        return dao.listProductsOrder();

    }
    public void update(String name, int id){
        ProductDAO dao = new ProductDAO(connection.recoveringConnection());
        dao.updateProduct(name,id);
    }
    public void delete(int id){
        ProductDAO dao = new ProductDAO(connection.recoveringConnection());
        dao.deleteProduct(id);
    }


}
