interface camer{
    void click();

}
interface music{
    void play();
}
class smartphone implements camer, music{
    public void click() {
        System.out.println("Clicking photo");
    }
    public void play() {
        System.out.println("Playing music");
    }
}
public class Hpridinheritence {
    public static void main(String[] args) {
        smartphone s = new smartphone();
        s.click();
        s.play();
    }
}