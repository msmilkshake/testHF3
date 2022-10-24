public class HelloGoodbye {
    public static void main(String[] args) {
        System.out.println("Hello " + args[0] + " and " + args[1] + ".");
        System.out.println("Goodbye " + args[1] + " and " + args[0] + ".");
        
        System.out.print("Insert time in seconds: ");
		int time = Integer.parseInt(scanner.nextLine());
		System.out.print("Insert distance in kilometers: ");
		double distance = Double.parseDouble(scanner.nextLine());
		int minutes = (int)(time / distance / 60);
		int seconds = (int)(((time / distance / 60) - minutes) * 60);
		System.out.printf("%02d:%02d/km", minutes, seconds);
		System.out.print("\nPress ENTER to exit");
		scanner.nextLine();
    }
}
