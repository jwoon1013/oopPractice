public class Child extends Human implements Running, Swimming, Walking {


    Child(String name, int age) {
        super(name, age, 5);
    }

    @Override
    public void walking() {
        System.out.println(this.name + " 걷습니다!");
        this.x = 1;
        this.y = 1;
        whoAmI();
        getWhere();

    }

    @Override
    public void Running() {
        System.out.println(this.name + " 뜁니다!");
        this.x = 2;
        this.y = 2;
        this.speed += 2;
        whoAmI();
        getWhere();
    }

    @Override
    public void swimming() {
        System.out.println(this.name + " 수영합니다!");
        this.x = 3;
        this.y = -1;
        this.speed += 1;
        whoAmI();
        getWhere();

    }


}
