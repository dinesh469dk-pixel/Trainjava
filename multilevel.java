class Grandfather{
    void land(){
        System.out.println("land is mine");
    }
}
class Father extends Grandfather{
    void house(){
        System.out.println("house is mine");
    }
}
class Son extends Father{
    void car(){
        System.out.println("car is mine");
    }
}


public class multilevel {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Son obj1 = new Son();
        obj1.land();
        obj1.house();
        obj1.car();
        
    }
    
}
