public final class Owner extends Human implements rMental, Phys {
    public Owner(String name) {
        super(name);
    }


    public void firstSkill() {
        System.out.println(getName() + " increase room fees and his " + Income.RICH);
    }

    public void secondSkill() {
        System.out.println(getName() + " allows to live for free ");
    }

    public void firstCondition(){
        System.out.println(getName() + Condition.SCARE);
    }
}
