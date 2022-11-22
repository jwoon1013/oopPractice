public class main {
    public static void main(String[] args) {
        Human human1 = new GrandParent("할머니", 80);
        Human human2 = new Parent("어머니", 50);
        Human human3 = new Child("딸", 20);

        System.out.println("=== 자기소개 시작 ===");
        Human[] humans = {human1, human2, human3}; // 휴먼을 모두 바구니에 담아서, 모두 자기소개 하게 시킵니다.
        for (int i = 0; i < humans.length; i++) {
            humans[i].whoAmI();
            humans[i].getWhere();
            System.out.println("------------");
        }

        System.out.println("=== 걷기 시작 ==="); // 걸을 수 있는 사람만 걷도록!
        for (int i = 0; i < humans.length; i++) {
            if (humans[i] instanceof Walking) {
                System.out.println(humans[i].name + "은 걷습니다!");
                ((Walking) humans[i]).walking();
                System.out.println("------------");

            } else {
                System.out.println(humans[i].name + "은 걸을 수 없습니다.");
                humans[i].whoAmI();
                humans[i].getWhere();
                System.out.println("------------");
            }
        }

        System.out.println("=== 뛰기 시작 ==="); // 걸을 수 있는 사람만 걷도록!
        for (int i = 0; i < humans.length; i++) {
            if (humans[i] instanceof Running) {
                System.out.println(humans[i].name + "은 뜁니다!");
                ((Running) humans[i]).Running();
                System.out.println("------------");

            } else {
                System.out.println(humans[i].name + "은 뛸 수 없습니다.");
                humans[i].whoAmI();
                humans[i].getWhere();
                System.out.println("------------");
            }


        }

        System.out.println("=== 수영 시작 ==="); // 걸을 수 있는 사람만 걷도록!
        for (int i = 0; i < humans.length; i++) {
            if (humans[i] instanceof Swimming) {
                System.out.println(humans[i].name + "은 수영합니다!");
                ((Swimming) humans[i]).swimming();
                System.out.println("------------");

            } else {
                System.out.println(humans[i].name + "은 수영할 수 없습니다.");
                humans[i].whoAmI();
                humans[i].getWhere();
                System.out.println("------------");
            }


        }



    }
}
