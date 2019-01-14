
class Marine2
{
    private int hp;
    private static int range;
    private static int attup;
    private static int defup;

    // 스태틱 생성자
    static
    {
        range = 10;
        attup = 0;
        defup = 0;
    }

    // 인스턴스 생성자
    public Marine2()
    {
        hp=40;
    }

    // 인스턴스 메소드 : 객체의 행동 !!
    public void attack()
    {

    }

    // 정적 메소드 : 클래스의 행동
    public static void rangeUpgrade()
    {
        range++;
    }
}

public class OOP3
{
    public static void main (String args[])
    {
        Marine2 m1 = new Marine2();
        Marine2 m2 = new Marine2();
        Marine2 m3 = new Marine2();

        m1.attack(); // 공격

        Marine2.rangeUpgrade(); // 클래스 이름으로 호출 가능 !!
    }
}
