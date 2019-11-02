package Animal;

class Bird extends Animal{


    public Bird(String name) {
        //使用super调用父类的构造方法
        super(name);
    }

    public void fly(){
        System.out.println("我是一只小鸟");
        System.out.println(this.name +"正在飞");
    }
}
