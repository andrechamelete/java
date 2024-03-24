class Bicycle {

    //field
    int gear = 5;

    //method
    void applyBrake() {
        System.out.println("Applying brake.");
    }

    //the main method
    public static void main(String[]args) {

        //create object of Bicycle
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        //changing value of a field for a object
        bike2.gear = 6;

        // acess fields and methods
        System.out.println("No of gears: " + bike1.gear);
        System.out.println("No of gears: " + bike2.gear);
        bike1.applyBrake();
    }
}