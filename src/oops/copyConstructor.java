package oops;

import java.util.Arrays;

class Person{
    String name;
    int[] scores;

    Person(String name, int[] scores){
        this.name=name;
        this.scores=scores;
    }

    Person(Person otherPerson){
        this.name=otherPerson.name;
        this.scores=otherPerson.scores.clone();

    }

    void display(){
        System.out.println(name);
        System.out.println(Arrays.toString(scores));
    }

}
public class copyConstructor {
    public static void main(String[] args) {
        int[] scores={10,20,30};
        Person gopal=new Person("Gopal",scores);
        Person krishna = new Person(gopal);
        scores[0]=100;
        scores[1]=100;

        System.out.println(Arrays.toString(gopal.scores));
        System.out.println(Arrays.toString(krishna.scores));


    }
}
