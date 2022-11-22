public class Parent extends Human implements Walking, Running {


    Parent(String name, int age) {
        super(name, age, 3);
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


}
