package practica;

public class BicycleShop {

	// Método para imprimir todas las bicicletas
	
    public static void printAllBicycles(Bicycle[] bicycles) {
        System.out.println("\n========== LISTADO DE BICICLETAS EN STOCK ==========");
        System.out.println("Temporada actual: 26\n");
        
        for (int i = 0; i < bicycles.length; i++) {
            if (bicycles[i] != null) {
                System.out.println((i + 1) + ". " + bicycles[i]);
            }
        }
        System.out.println("====================================================\n");
    } 
    
    // Método opcional: mostrar bicicletas por marca
    
    public static void printBicyclesByBrand(Bicycle[] bicycles, String brand) {
        System.out.println("\n========== BICICLETAS DE LA MARCA: " + brand.toUpperCase() + " ==========");
        
        boolean found = false;
        int count = 1;
        
        for (Bicycle bicycle : bicycles) {
            if (bicycle != null && bicycle.getBrand().equalsIgnoreCase(brand)) {
                System.out.println(count + ". " + bicycle);
                found = true;
                count++;
            }
        }
        
        if (!found) {
            System.out.println("No se encontraron bicicletas de la marca: " + brand);
        }
        
        System.out.println("====================================================\n");
    }
    
    // Método principal
    
    public static void main(String[] args) {
    	
        // Array de bicicletas de carretera
        RoadBicycle[] roadBicycles = new RoadBicycle[5];
        
        roadBicycles[0] = new RoadBicycle("Trek", 26, 2500.00f, 22, true, "disc");
        roadBicycles[1] = new RoadBicycle("Specialized", 25, 2200.00f, 20, false, "rim");
        roadBicycles[2] = new RoadBicycle("Canyon", 24, 1800.00f, 18, false, "disc");
        roadBicycles[3] = new RoadBicycle("Pinarello", 26, 4500.00f, 24, true, "disc");
        roadBicycles[4] = new RoadBicycle("Giant", 23, 1500.00f, 16, false, "rim");
        
        // Array de bicicletas de montaña
        MountainBicycle[] mountainBicycles = new MountainBicycle[5];
        
        mountainBicycles[0] = new MountainBicycle("Scott", 26, 1800.00f, 12, 29, 120, 0);
        mountainBicycles[1] = new MountainBicycle("Trek", 25, 3200.00f, 12, 29, 150, 140);
        mountainBicycles[2] = new MountainBicycle("Giant", 26, 2100.00f, 11, 27, 100, 0);
        mountainBicycles[3] = new MountainBicycle("Specialized", 24, 2800.00f, 12, 29, 160, 150);
        mountainBicycles[4] = new MountainBicycle("Cannondale", 25, 2400.00f, 12, 27, 130, 120);
        
        // Crear array combinado con todas las bicicletas
        Bicycle[] allBicycles = new Bicycle[10];
        
        // Copiar bicicletas de carretera
        for (int i = 0; i < roadBicycles.length; i++) {
            allBicycles[i] = roadBicycles[i];
        }
        
        // Copiar bicicletas de montaña
        for (int i = 0; i < mountainBicycles.length; i++) {
            allBicycles[i + 5] = mountainBicycles[i];
        }
       
        printAllBicycles(allBicycles);
        
        printBicyclesByBrand(allBicycles, "Trek");
        printBicyclesByBrand(allBicycles, "Giant");
        printBicyclesByBrand(allBicycles, "Orbea");
        
        // Ejemplo de bicicleta con solo marca y temporada
        System.out.println("\n========== EJEMPLO DE MODELO NUEVO ==========");
        RoadBicycle newModel = new RoadBicycle("BMC", 26, true, "disc");
        System.out.println("Modelo nuevo (sin precio definido): " + newModel);
        System.out.println("=============================================\n");
    }

}
