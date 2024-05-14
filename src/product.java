public class Product {
    private String name;
    private double price;
    private String productCode;
    private int numPieces;

    public Product(String name, double price, String productCode) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numPieces = 0;
    }

    public Product(String name, double price, String productCode, int numPieces) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numPieces = numPieces;
    }

    public void changePrice(double newPrice) {
        this.price = newPrice;
    }

    public void changeNumPieces(int newNumPieces) {
        if (newNumPieces >= 0) {
            this.numPieces = newNumPieces;
        } else {
            System.out.println("Number of pieces cannot be negative.");
        }
    }
}