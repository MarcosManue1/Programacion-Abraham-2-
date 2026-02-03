package practica;

public class RoadBicycle extends Bicycle {
	
	// Atributos específicos
    private boolean electronicShifting;
    private String brakeType; // "disc" o "rim"
    
    // Constructor con todos los datos
    public RoadBicycle(String brand, int year, float price, int numberOfGears, 
                       boolean electronicShifting, String brakeType) {
        super(brand, year, price, numberOfGears);
        this.electronicShifting = electronicShifting;
        this.brakeType = brakeType;
    }
    
    // Constructor solo con marca y temporada
    public RoadBicycle(String brand, int year, boolean electronicShifting, String brakeType) {
        super(brand, year);
        this.electronicShifting = electronicShifting;
        this.brakeType = brakeType;
    }
    
    // Getters
    public boolean isElectronicShifting() {
        return electronicShifting;
    }
    
    public String getBrakeType() {
        return brakeType;
    }
    
    // Setters
    public void setElectronicShifting(boolean electronicShifting) {
        this.electronicShifting = electronicShifting;
    }
    
    public void setBrakeType(String brakeType) {
        this.brakeType = brakeType;
    }
    

}
