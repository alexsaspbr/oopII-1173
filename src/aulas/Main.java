import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        PilhaImpl<String> p = new PilhaImpl<>();
        PilhaImpl<Integer> p2 = new PilhaImpl<>();
        PilhaImpl<Double>p3=new PilhaImpl<>();
        p.push("Calabreza");
        p.push("Portuguesa");
        p.push("Vegetariana");
        p2.push(2);
        p2.push(5);
        p2.push(10);
        p3.push(1.0);
        p3.push(5.9);


        System.out.println(p.toString());
        p.pop();
        p.push("Marguerita");
        System.out.println(p.toString());
        p.pop();
        System.out.println(p.toString());
        System.out.println(p.peek());
        System.out.println(p.size());
        System.out.println(p.isEmpty());
        System.out.println("----");



    }

}
