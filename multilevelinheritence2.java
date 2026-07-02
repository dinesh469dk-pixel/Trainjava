interface pet {
    void play();
}
interface animal {
    void sound();
}
 class dog implements animal {
    public void sound() {
        System.out.println("Dog barks");
    }
    public void bark() {
        System.out.println("Dog barks loudly");
    }
    class puppy extends dog implements pet {
        public void play() {
            System.out.println("Puppy plays");
        }
    }
}
public class multilevelinheritence2 {
    public static void main(String[] args) {
        dog d = new dog();
        d.sound();
        d.bark();
        puppy p = d.new puppy();
        p.play();
    }
    
}
