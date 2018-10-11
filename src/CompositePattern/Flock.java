package CompositePattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable{
    ArrayList quackers = new ArrayList();
    public static int count =0;

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            if(count==0){
                System.out.println("I'm a leader.");
                quacker.quack();
                quacker.quack();
                quacker.quack();
                count++;
            }
            else {
                quacker.quack();
            }
        }
    }
}
