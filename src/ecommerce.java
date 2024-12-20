
public class ecommerce {
        private String nameProduct;
        private int productamount;
        private String description;
        private String customer;
        private int kolichestvo;

        private String order;

        public String getNameProduct () {
            return nameProduct;
        }

        public void setNameProduct (String newnameProd){
            nameProduct = newnameProd;
        }
        public int getProductamount () {
            return productamount;
        }

        public void setProductamount ( int productamount){
            this.productamount = productamount;
        }

        public String description () {
            return description;
        }
        public void setDescription (String newdescription){
            description = newdescription;
        }
        public String getcustomer () {
            return customer;
        }
        public void setCustomer (String newcustomer){
            customer = newcustomer;
        }
        public int getKolichestvo () {
            return kolichestvo;
        }
        public void setKolichestvo ( int newkolichestvo){
            kolichestvo = newkolichestvo;
        }
        public String getOrder () {
            return order;
        }
        public void setOrder (String neworder){
            order = neworder;
        }
        public void info () {
            System.out.println("name of product is/are: " + nameProduct);
            System.out.println("the amount of bought product: " + productamount);
            System.out.println("about the product: " + description);
        }
        public void customer () {
            System.out.println("Customer's name who ordered a delivery: " + customer);
            System.out.println("amount he/she bought " + kolichestvo);
        }
        public void order () {
            System.out.println("number of order: " + order);
        }
}

