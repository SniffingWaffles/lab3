public final class tourists extends Human implements rPhys{
    public tourists(String name) {
        super(name);
    }
    public void firstMove(){
        System.out.println(getName() + " don't want to live in " + Location.anotherHotel + "s except " + Location.HOTEL);
    }
    public void secondMove(){
        System.out.println(getName() + " could meet shortys ");
    }
    public void thirdMove(){
        System.out.println(getName() + " could look closer at shortys ");
    }

}
