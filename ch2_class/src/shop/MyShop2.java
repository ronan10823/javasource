package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyShop2 implements IShop {
    private String title;
    // Product[] products = new Product[5]; 
    List<Product> products = new ArrayList<>();

    // 장바구니 
    // Product[] carts = new Product[5];
    List<Product> carts = new ArrayList<>();

    // 사용자 등록
    // User[] users = new User[2];
    List<User> users = new ArrayList<>();

    // 선택된 사용자 idx 보관
    private int selUser;
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    @Override
    public void start(){
        System.out.println("MyShop : 메인 화면 - 계정 선택");
        System.out.println("==============================");
        
        int i = 0;
        for (User user : users) {
            System.out.printf("[%d]%s(%s)\n", i++, user.getName(), user.getPayType());
        }
        // for (int j = 0; j < users.length; j++) {
        //         System.out.printf("[%d]%s(%s)\n", j, users[j].getName(), users[j].getPayType());
        //     }
            
            System.out.println("[x]종 료");
            System.out.println("선택 : ");
            
            Scanner sc = new Scanner(System.in);
            String sel = sc.nextLine();

            switch (sel) {
                case "x": case "X":
                    System.out.println("** 프로그램 종료 **");
                    System.exit(0);
                    break;
            
                default:
                    selUser = Integer.parseInt(sel);
                    break;
            }

            System.out.printf("## %s 선택 ##\n", sel);
            // sc.close();
            productList();
        }


    // 상품 출력 메소드
    @Override
    public void productList(){
            System.out.println(title + " : 상품 목록 - 상품 선택");
            System.out.println("==============================");
            
            int i = 0;
            for (Product product : products) {
                System.out.printf("[%d]", i);
                product.printDetail();
                i++;
            }
            
            System.out.println("[h] 메인 화면");
            System.out.println("[c] 체크 아웃");
            System.out.println("선택 : ");

            // 상품번호 0 선택 시 > 카트에 담기
            Scanner sc = new Scanner(System.in);
            String sel = sc.nextLine();
            // int no = Integer.parseInt(sc.nextLine());

            switch (sel) {
                case "h":
                    start();
                    break;
                case "c":
                    checkOut();
                    break;
                default:
                    int no = Integer.parseInt(sel);

                    carts.add(products.get(no));
                    // 상품 목록 보여주기
                    productList();
                    break;

                // for (Product product : carts) {
                    //     for (int j = 0; j < carts.size(); j++) {
                        //         if (carts[j] == null) {
                            //             carts[j] = products[no];
                            //             break;
                            //         }
                            //     }
                
                // i = 0;
                // if (product == null) {
                //     carts[i] = products[no]; //카트에 담기
                //     i++;
                //     break;
                // } 
            }
        }

            // sc.close();
            // 상품 목록 보여주기 
            // System.out.printf("## %d 선택 ##\n", menu);
            // Scanner sc = new Scanner(System.in);
            // String str = sc.nextLine();
            // if (str.equals("c")) {
            //     checkOut();
            // } else {
            //     start();
            // }        
        
    @Override
    public void checkOut(){
        System.out.println(title +" : 체크아웃");
        System.out.println("==============================");
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        for (Product product : carts) {
            if (product != null) {
                System.out.printf("[%d]%s(%d)\n", i++, product.getName(), product.getPrice());
                sum += product.getPrice();
            }
        }
        System.out.println("==============================");
        System.out.println("결제 방법 : " + users.get(selUser).getPayType());
        System.out.println("합계 : " + sum);
        System.out.println("[p] 이전, [q] 결제 완료" );

        String sel = sc.nextLine();
        switch (sel) {
            case "q":
                System.out.println("### 결제가 완료되었습니다. 종료합니다. ###");
                break;
            case "p":
                productList();
                break;
            default:
                checkOut();
                break;
        }
    }

    @Override
    public void genUser(){
        // 2명의 사용자 등록
        users.add(new User("홍길동", PayType.CARD));
        users.add(new User("성춘향", PayType.CARD));
    }
    
    @Override
    public void genProduct(){
        products.add(new TV("SamsungTV", 2300000, "4K"));
        products.add(new TV("LGUPlusTV", 1800000, "4K"));
        products.add(new Cellphone("GalaxyS23", 1230000, "U+"));
        products.add(new Cellphone("IPhone17", 1870000, "KT"));
        products.add(new Cellphone("GalaxyZFlip", 2300000, "SKT"));
    }
   
}
