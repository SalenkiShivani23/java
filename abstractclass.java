abstract class Animals {
    // Abstract methods
    abstract void cats();
    abstract void dogs();
}

class Cats extends Animals {
    void cats() {
        System.out.println("Cats meow");
    }
    void dogs() {
        // No implementation needed for dogs in Cats
    }
}

class Dogs extends Animals {
    void cats() {
        // No implementation needed for cats in Dogs
    }
    void dogs() {
        System.out.println("Dogs bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Cats catObj = new Cats();
        Dogs dogObj = new Dogs();
        catObj.cats();  
        dogObj.dogs(); 
    }
}