package com.westminster.classpractise.demo.product;

public class Hello_Controller {
    @GetMapping()
    public String hello(){
        //product1
        Product product1=new Product( 123, "Laptop", 18,  true, 19.99);
        //product2
        Product product2=new Product( 124, "Laptop",  11,  false, 28.99);
        double total1=product1.calculateTotal();
        double total2=product2.calculateTotal();
          return name: "- Total: $" + total;
        return "Product total is :" +total1 + "Product2 total is :" +total2;
    }
}
