public class Main {
    public static void main(String[]args) {
        ecommerce shop;
        shop = new ecommerce();
        shop.setNameProduct("Tom Ford Tobacco vanille");
        shop.setProductamount(350);
        shop.setDescription("product type-perfume\n");
        shop.setDescription("whom suits-unisex\n");
        shop.setDescription("top notes-tobacco leaf and spices\n");
        shop.setDescription("middle notes-tonka bean,tobacco flower,vanilla and cocoa\n");
        shop.setDescription("base notes-dried fruits and woody notes\n");


        shop.setCustomer("The buyer is: Alim/Alima");
        shop.setKolichestvo(2);

        shop.setOrder("article number:26370700007");

        shop.info();
        shop.customer();
        shop.order();

    }
}