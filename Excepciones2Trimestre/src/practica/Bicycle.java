package practica;

public class Bicycle {

	// Atributos
    private String brand;
    private int year;
    private float price;
    private int numberOfGears;
    
    // Constructor con todos los datos
    public Bicycle(String brand, int year, float price, int numberOfGears) {
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.numberOfGears = numberOfGears;
    }
    
    // Constructor solo con marca y temporada
    public Bicycle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        this.price = 0.0f;
        this.numberOfGears = 0;
    }
    
    // Getters
    public String getBrand() {
        return brand;
    }
    
    public int getYear() {
        return year;
    }
    
    public float getPrice() {
        return price;
    }
    
    public int getNumberOfGears() {
        return numberOfGears;
    }
    
    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public void setPrice(float price) {
        this.price = price;
    }
    
    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }
    
    // Método para calcular el precio con descuento
    public float getPriceWithDiscount() {
        int currentSeason = 26;
        int yearsOld = currentSeason - year;
        
        if (yearsOld < 0) {
            yearsOld = 0;
        }
        
        float discountPercentage = yearsOld * 10.0f;
        
        if (discountPercentage > 100) {
            discountPercentage = 100;
        }
        
        float discount = price * (discountPercentage / 100.0f);
        return price - discount;
    }
    
    // Método toString
    @Override
    public String toString() {
        return String.format("Marca: %s, Temporada: %d, Precio: %.2f€, Marchas: %d, Precio con descuento: %.2f€",
                brand, year, price, numberOfGears, getPriceWithDiscount());
    }
}

