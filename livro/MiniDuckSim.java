package livro;

public class MiniDuckSim {
    public static void main(String[] args){
        /*Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();


        System.out.println("----------------------\n ----------------------------------");


        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        System.out.println("----------------------\n ----------------------------------");*/

        Duck rubberDuck = new RubberDuck();
        rubberDuck.performFly();
        rubberDuck.performQuack();

    }
    
}
