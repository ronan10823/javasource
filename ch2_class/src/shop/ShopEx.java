package shop;

public class ShopEx {
    public static void main(String[] args) {
        // TV tv = new TV("삼성TV", 230000, "4K");
        // Cellphone cellphone = new Cellphone("GalaxyZFold", 1230000, "U+")
        // tv.name = "";

        // TV[] tvs = new TV[3];
        // tvs[0] = new TV("SamsungTV", 2300000, "4K");
        // tvs[1] = new TV("SamsungTV", 2300000, "4K");
        // tvs[2] = new TV("SamsungTV", 2300000, "4K");

        // // 예시 
        // Cellphone[] cellphones = new Cellphone[3];
        // cellphones[0] = new Cellphone("Galaxy", 1230000, "U+");
        // cellphones[1] = new Cellphone("Galaxy", 1230000, "U+");
        // cellphones[2] = new Cellphone("Galaxy", 1230000, "U+");


        // Product[] products = new Product[5];
        // products[0] = new TV("SamsungTV", 2300000, "4K");
        // products[1] = new TV("LGUPlusTV", 1800000, "4K");
        // products[2] = new Cellphone("GalaxyS23", 1230000, "U+");
        // products[3] = new Cellphone("IPhone17", 1870000, "KT");
        // products[4] = new Cellphone("GalaxyZFlip", 2300000, "SKT");

        // for (Product product : products) {
        //     product.printDetail();
        // }

        // User user = new User("홍길동", PayType.CARD); 


        MyShop myShop = new MyShop();
        // 이름 지정
        myShop.setTitle("MyShop");
        //사용자 등록
        myShop.genUser();
        //상품 등록
        myShop.genProduct();
        myShop.start();
        

    }
}
