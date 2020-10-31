package learningJava;

public class ForEach {

    public static void main (String[] args){
        String[] vector = new String[] {"Tyler", "Sophia", "Tales"};
        for (String loop: vector) {
            System.out.println(loop);
        }
    }
}
