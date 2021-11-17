public class HumanAdapter implements Dog{

    Human human;
    public HumanAdapter(Human human){
        this.human = human;
    }

    public void bark() {
        human.speak();
    }
}
