public class GrandParent extends Human implements Walking{


    GrandParent(String name, int age) {
        super(name, age, 1);
    }

    @Override
    public void walking() {
        System.out.println(this.name + " 걷습니다!");
        this.x = 1;
        this.y = 1;
        whoAmI();
        getWhere();

    }
}
