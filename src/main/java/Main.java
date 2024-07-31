import java.util.List;

public class Main {
    public static void main(String[] args) {


        ProductService service = new ProductService();

//        *** Call ADD method from service class: ***

/*
    Created one product object and passed it in the addProduct() method of the service class instance.

        Product product = new Product("LG AC Remote","Remote","White Table",2021);
        service.addProduct(product);
*/

//        service.addProduct(new Product("LG AC Remote","Remote","White Table",2021));
//        service.addProduct(new Product("Type C","Cable","Black Drawer",2024));
//        service.addProduct(new Product("Mac Studio","Computer","White Table",2025));
//        service.addProduct(new Product("Focusrite Mixer","Audio System","White Table",2025));
//        service.addProduct(new Product("Asus Vivobook","Laptop","Brown Drawer",2021));
//        service.addProduct(new Product("Asus Rog","Laptop","Black Table",2021));
//        service.addProduct(new Product("Macbook pro","Laptop","Brown Drawer",2022));
//        service.addProduct(new Product("Wacom Pad","Writing Pad","Black Drawer",2020));
//        service.addProduct(new Product("Apple Keyboard","Keyboard","White Table",2022));
//        service.addProduct(new Product("Logitech Keyboard","Keyboard","Black Table",2024));
//        service.addProduct(new Product("Hdmi cable","Cable","Black Drawer",2024));
//        service.addProduct(new Product("Java Black Book","Cable","Shelf",2024));
//        service.addProduct(new Product("Logi Mouse","Mouse","Black Table",2022));
//        service.addProduct(new Product("Apple Mouse","Mouse","White Table",2022));
//        service.addProduct(new Product("Lenovo Mouse","Mouse","Black Drawer",2022));
//        service.addProduct(new Product("BlackBeast","Computer","White Table",2020));
//        service.addProduct(new Product("Airpods","Earphone","White Table",2022));

//        *** Call GET ALL PRODUCTS method to show all products: ***

//        System.out.println(service.getAllProduct());

        List<Product> productList = service.getAllProduct();

        for (Product products : productList) {
            System.out.println(products);
        }

        //        *** Call GET ALL PRODUCTS search by specifix TEXT method to show all products: ***
        System.out.println("==============================================================================================");

        List<Product> customProductList = service.getCustomProductList("black");

        for (Product products : customProductList) {
            System.out.println(products);
        }

//        *** Call GET CUSTOM PRODUCT DETAILS method ***
        System.out.println("==============================================================================================");
        System.out.println(service.getCustomProductDetail("Logi Mouse"));

//       *** Call OUT OF WARRANTY PRODUCTS ***

        System.out.println("==============================================================================================");
        List<Product> outOFWarrantyProductList = service.getOutOfWarrantyProductList(2024);

        for (Product products : outOFWarrantyProductList) {
            System.out.println(products);
        }


    }
}