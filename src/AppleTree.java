
class Tree{ //class 1
    Tree(){  // const 1
        System.out.println("This is an old apple tree.");
    }
    String tr = "Apples"; // variable 1

    void grow(){ //method 1
        System.out.println( tr + " are usually harvested in September.");
    }
}
class Apple extends Tree{  //class 2
    Apple () { //pr2
        System.out.println("Apples grow almost everywhere in the world.");
    }
        int s = 5; // variable 2

        void containsSeeds(){ //method 2
            System.out.println("On average apple has about " + s + " seeds inside.");
    }
}
class Seeds extends Apple{ // class 3
    Seeds(){
        System.out.println("By using apple seeds, you can grow a new apple tree.");
    } //cr 3
    boolean greenApple = true;

    void sourOrSweet(){ // method 3
        if (greenApple)
            System.out.println("Green apples are usually sour.");
        else{
            System.out.println("sweet");
        }

    }
}


public class AppleTree {
    public static void main(String[] args) {
        Seeds sd = new Seeds();
        System.out.println(); //adds space

        sd.grow();
        sd.containsSeeds();
        sd.sourOrSweet();




    }
}
