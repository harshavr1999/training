package oracle.services;

import java.util.List;

import javax.ejb.Remote;

import oracle.model.Category;
import oracle.model.Product;

@Remote
public interface SessionEJB08 {
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    Category persistCategory(Category category);

    Category mergeCategory(Category category);

    void removeCategory(Category category);

    List<Category> getCategoryFindAll();

    Product persistProduct(Product product);

    Product mergeProduct(Product product);

    void removeProduct(Product product);

    List<Product> getProductFindAll();
}
