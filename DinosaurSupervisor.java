package Richard;

public class DinosaurSupervisor {

    public static void main(String[] args) {


        Dinosaur t_rex = new Dinosaur();
        Dinosaur velociraptor = new Dinosaur();
        Dinosaur triceratops = new Dinosaur();

        System.out.println("The T-Rex says...");
        t_rex.roar();
        System.out.println("The Velociraptor says...");
        velociraptor.roar();
        System.out.println("The Triceratops says...");
        triceratops.roar();


    }
}

