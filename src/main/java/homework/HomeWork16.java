package homework;

public class HomeWork16 {
    /*
    경찰은 권총과 수갑을 가지고 있음
    경찰이 권총쏘기를 하면 권총에 있는 쏜다가 호출
    경찰이 수갑채우기를 하면 수갑에 있는 채운다가 호출
     */

    public static class Cop{
        Gun gun = new Gun();
        Handcuff handcuff = new Handcuff();

        public void shoot(){
            gun.action();
        }

        public void putOn(){
            handcuff.action();
        }
    }

    public interface Action{
        void action();
    }

    public static class Gun implements Action{
        public void action() {
            System.out.println("빵야빵야");
        }
    }

    public static class Handcuff implements Action{
        public void action() {
            System.out.println("철컹철컹");
        }
    }

    public static void main(String[] args) {
        Cop tom = new Cop();
        tom.shoot();

        Cop tim = new Cop();
        tim.putOn();
    }
}
