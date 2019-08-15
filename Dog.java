package module_2_jvm.task_4;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Dog extends Animal {

    Logger log = Logger.getLogger(Cat.class.getName() + " " + Cat.class.getClassLoader());

    public void play() {
        log.log(Level.INFO, "Dog plays");
    }


    public void voice() {
        log.log(Level.INFO, "Barks");
    }
}