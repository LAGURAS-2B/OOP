class activity {
    public static void main(String[] args) {
        
        Dog puppy = new Dog();

        puppy.setName("Mocha");
        
        System.out.println(puppy.showName());
        System.out.println();
        
        puppy.isMale = true;

        System.out.println(puppy.showName() + " is a Male: " + puppy.isMale);
        System.out.println();

        puppy.bark();
        System.out.println();

        puppy.setListofPuppies(new String[] {"jaja", "jeje", "jiji", "jojo", "juju"});

        puppy.setNumberofPuppies(numofPuppy: 5)

        System.out.println("My Dog" + puppy.showName() + " have : " + puppy.showNumberofPuppies());
        puppy.showPuppies();
        System.out.println();
    }
}
