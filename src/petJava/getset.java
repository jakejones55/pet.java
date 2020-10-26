package petJava;


public class getset {
    public static void main(String[] args){
        pet yorkie = new pet();
        yorkie.setName("tony");
        System.out.println(yorkie.getName());

        pet snake = new pet();
        snake.setAge(5);
        System.out.println(snake.getAge());

        pet fish = new pet();
        fish.setType("gold");
        System.out.println(fish.getType());

        pet tiger = new pet();
        tiger.setLocation("africa");
        System.out.println(tiger.getLocation());


    }
}
