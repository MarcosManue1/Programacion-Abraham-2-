package practica;

public class MountainBicycle extends Bicycle{

	// Atributos específicos
    private int wheelDiameter;
    private int frontSuspensionTravel;
    private int rearSuspensionTravel;
    
    // Constructor con todos los datos
    public MountainBicycle(String brand, int year, float price, int numberOfGears,
                          int wheelDiameter, int frontSuspensionTravel, int rearSuspensionTravel) {
        super(brand, year, price, numberOfGears);
        this.wheelDiameter = wheelDiameter;
        this.frontSuspensionTravel = frontSuspensionTravel;
        this.rearSuspensionTravel = rearSuspensionTravel;
    }
    
    // Constructor solo con marca y temporada
    public MountainBicycle(String brand, int year, int wheelDiameter, 
                          int frontSuspensionTravel, int rearSuspensionTravel) {
        super(brand, year);
        this.wheelDiameter = wheelDiameter;
        this.frontSuspensionTravel = frontSuspensionTravel;
        this.rearSuspensionTravel = rearSuspensionTravel;
    }
    
    // Getters
    public int getWheelDiameter() {
        return wheelDiameter;
    }
    
    public int getFrontSuspensionTravel() {
        return frontSuspensionTravel;
    }
    
    public int getRearSuspensionTravel() {
        return rearSuspensionTravel;
    }
    
    // Setters
    public void setWheelDiameter(int wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }
    
    public void setFrontSuspensionTravel(int frontSuspensionTravel) {
        this.frontSuspensionTravel = frontSuspensionTravel;
    }
    
    public void setRearSuspensionTravel(int rearSuspensionTravel) {
        this.rearSuspensionTravel = rearSuspensionTravel;
    }
}
