import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductService {
    private List<Product> products = new ArrayList<>();
    private  List<Product> customProductsList = new ArrayList<>();

    ProductDB db = new ProductDB();

    public void addProduct(Product p){
//        products.add(p);

        db.add(p);
    }

    public List<Product> getAllProduct(){
        return products;
    }

    public List<Product> getCustomProductList(String text) {

        String customText = text.toLowerCase();

//        for(Product p : products ){
//            String name = p.getName().toLowerCase();
//            String type = p.getType().toLowerCase();
//            String place =  p.getPlace().toLowerCase();
//
//            if (name.contains(customText) || type.contains(customText) || place.contains(customText)){
//                customProductsList.add(p);
//            }
//        }
//        return customProductsList;


        return products.stream()
                .filter(p -> {
                    String name = p.getName().toLowerCase();
                    String type = p.getType().toLowerCase();
                    String place = p.getPlace().toLowerCase();
                    return name.contains(customText) || type.contains(customText) || place.contains(customText);
                })
                .collect(Collectors.toList());
    }

    public Product getCustomProductDetail(String name){
        String productName = name;

        Optional<Product> customProduct = products.stream().filter(p->p.getName().equals(productName)).findFirst();

        return customProduct.orElse(null);
    }

    public List<Product> getOutOfWarrantyProductList(int warrantyDate) {

        return products.stream()
                .filter(p -> {
                    return p.getWarranty()<warrantyDate;
                })
                .collect(Collectors.toList());
    }
}
