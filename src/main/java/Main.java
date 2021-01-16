public class Main {
    public static void main(String[] arguments) {
        City Davilon = new City("Davilon");
        Davilon.firstSkill();
        People dwellers = new People("Dwellers");
        dwellers.firstMove();
        dwellers.secondMove();
        dwellers.thirdMove();
        dwellers.changeLocation(Location.HOTEL);
        dwellers.firstCondition();
        Davilon.secondSkill();
        tourists tourists = new tourists("Tourists");
        tourists.firstMove();
        tourists.changeLocation(Location.HOTEL);
        tourists.secondMove();
        tourists.thirdMove();
        Owner Haps = new Owner("Haps");
        Haps.firstSkill();
        Astronauts MigJulNez = new Astronauts("Migo, Julio and Neznayka");
        MigJulNez.firstSkill();
        Haps.firstCondition();
        Haps.secondSkill();
        MigJulNez.secondSkill();




    }
}
