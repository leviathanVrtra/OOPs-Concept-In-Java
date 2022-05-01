public class Main {
    public static void main(String[] args) {
        // -----> Encapsulation Example 1 (Having Problem, accessing fields of other class)
        Player player = new Player();
        player.name = "Sachin";
        player.health = 100;
        player.weapon = "Bat";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining Health " + player.healthRemaining());

        // There are lots of Problem with Player class
        // Anyone can access the fields of the Player class And can manipulate the fields;

        // -----> Encapsulation Example 2
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Sachin",50,"Bat");
        System.out.println("Initial Health is " + enhancedPlayer.getHealth());

        int damage1 = 10;
        enhancedPlayer.loseHealth(damage1);
        System.out.println("Remaining Health " + enhancedPlayer.healthRemaining());

        // Main class does not have access to any field of EnhancedPlayer class (i.e. fields of
        // EnhancedPlayer class are encapsulated).
        // And If we changed any field name in the EnhancedPlayer class it'll not affect the Main class

        // -----> Encapsulation Example 3
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagePrinted());

        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + ", Now new total print count for printer is " + printer.getPagePrinted());

        pagesPrinted = printer.printPages(5);
        System.out.println("Pages printed was " + pagesPrinted + ", Now new total print count for printer is " + printer.getPagePrinted());
    }
}
