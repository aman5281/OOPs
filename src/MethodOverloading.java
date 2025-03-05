public class MethodOverloading {
    public static void main(String[] args) {

        Greet g1 = new Greet();
        g1.greetings();
        g1.greetings("Aman");
        g1.greetings("Ram", 3);
    }
}

    class Greet{
        void greetings(){
            System.out.println("Hello, Good Morning");
        }

        void greetings(String name){
            System.out.println("Hello,"+name+" Good Morning");
        }

        void greetings(String name, int count){
            for(int i=0; i<count;i++){
                System.out.println("Hello, "+name+" Good Morning");
            }
        }
    }
