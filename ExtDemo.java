package com.example.helloworld;

public class ExtDemo {

    //父类
    public class Animal{
        String name;
        int age;

        public Animal(String name, int age){
            this.name = name;
            this.age = age;
        }

        public void eat(){
            System.out.println(name+" is eating!");

        }
        public void sleep(int seconds) {
            System.out.println(name+"已经睡了"+seconds+"秒了");
        }

    }

    //子类
    public class Dog extends Animal {

        String breed;

        public Dog(String name,int age, String breed) {
            super(name, age);
            this.breed = breed;

        }
        public void bark(){
            System.out.println("wof");
        }

    }

    //子类
    public class Bird extends Animal {

        public Bird(String name, int age){
            super(name, age);
        }

        public void bark(){
            System.out.println("啾啾啾");
        }
        public void lifespan(){
            System.out.println(name+"已经活了"+age+"年");
        }
    }


    public static void main(String[] args){
        ExtDemo extDemo=new ExtDemo();
        Dog dog = extDemo.new Dog("blue",3,"阿拉斯加");
        Bird bird = extDemo.new Bird("grace",2);

        dog.eat();
        dog.sleep(30);
        dog.bark();

        bird.bark();
        bird.lifespan();


    }

}
