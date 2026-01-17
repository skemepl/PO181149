public class Television {
    private String brand;
    private double screenDiagonal;
    private String resolution;
    private boolean isSmartTv;
    private double price;

    public Television(String brand, double screenDiagonal, String resolution, boolean isSmartTv, double price) {
        this.brand = brand;
        this.screenDiagonal = screenDiagonal;
        this.resolution = resolution;
        this.isSmartTv = isSmartTv;
        this.price = price;
    }

    // Gettery
    public String getBrand() {
        return brand;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public String getResolution() {
        return resolution;
    }

    public boolean isSmartTv() {
        return isSmartTv;
    }

    public double getPrice() {
        return price;
    }

    // Settery
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setSmartTv(boolean isSmartTv) {
        this.isSmartTv = isSmartTv;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void showInformation() {
        System.out.println("Brand: " + brand);
        System.out.println("Screen diagonal: " + screenDiagonal);
        System.out.println("Resolution: " + resolution);
        System.out.println("SmartTv: " + isSmartTv);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Television tv = new Television("Samsung", 55.0, "4K QLED", true, 2499.99);
        tv.showInformation();
    }

}
