public class animal3in1 {

    class Animal{
        void eat(){System.out.println("eating...");}
    }
    class Dog extends Animal{

        void bark(){System.out.println("barking...");}
    }
    class TestInheritance{
        public void main(String args[]){
            Dog d=new Dog();
            d.bark();
            d.eat();
        }
    }
}
