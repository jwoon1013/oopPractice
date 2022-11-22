public class Human {
    String name;
    int age;
    int x;
    int y;
    int speed;

//    public Human(String name, int age, int speed, int x, int y) { // 5가지 다 넣는 생성자1호
//        this.name = name;
//        this.age = age;
//        this.speed = speed;
//        this.x = x;
//        this.y =y;
//    }

    public Human(String name, int age, int speed){ // 세가지만 넣고, 위치 xy는 0 으로 두는 생성자2호
        this.name = name;
        this.age = age;
        this.speed = speed;
        this.x = 0;
        this.y = 0;

    }



    public void getWhere(){
        System.out.println("["+this.name +"]의 현재위치는 x: "+this.x +" , y: "+this.y+" 입니다." );
    }

    public void whoAmI(){
        System.out.println("내 이름은 "+this.name+". 나이는 "+this.age+" 현재속도는 : "+this.speed);
    }
}
