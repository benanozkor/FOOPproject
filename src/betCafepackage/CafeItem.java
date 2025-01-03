package betCafepackage;

    public class CafeItem {
        private String productName;
        private double price;

        // Constructor
        public CafeItem(String productName, double price) {
            this.productName = productName;
            this.price = price;
        }

        public CafeItem(){

        }
        // Getter and Setter methods
        public String getProductName() {
            return productName;
        }

        public void setProductName(String name) {
            this.productName = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }


        // Abstract method for calculating price based on some parameters
        public  double calculatePrice(){

            return 0;
        }
    }




