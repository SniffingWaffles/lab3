public final class People extends Human implements rPhys,rMental {
    public People(String name) {
        super(name);
    }
    public void firstMove(){
        System.out.println(getName() + " wake up ");
    }
    public void secondMove(){
        System.out.println(getName() + " grab a newspaper ");
    }
    public void thirdMove(){
        System.out.println(getName() + " hustle outside " + Location.HOTEL + "all days ");
    }
    public void firstCondition(){
        System.out.println(getName() + Condition.HOPE + " to see astronauts");
    }
}
