// static
// --> 정적(전역)
// --> 공유 변수
// --> 하나의 클래스로부터 만들어진 여러 개의 객체들이 공유하는 변수
// 클래스 만드는 순서
// 1. 필드 작성
//  1.1 적절한 타입과 이름으로 private 작성
//  1.2 final 멤버 찾기(상수) : setter, 생성자 모양 영향
//  1.3 static 멤버 찾기
// 2. getter/setter
// 3. 생성자
// 4. 메소드

class Marine {


    private static final int MAX_hp = 40; // 최대 체력
    private static final int def = 0; // 방어력
    private static final int att = 6; // 공격력
    private static final int price = 50;
    private static int attup;
    private static int defup;
    private int CUR_hp; // 현재
    private int kills;

    public static int getMAX_hp() {
        return MAX_hp;
    }

    public static int getDef() {
        return def;
    }

    public static int getAtt() {
        return att;
    }

    public static int getPrice() {
        return price;
    }

    public static int getAttup() {
        return attup;
    }

    public static int getDefup() {
        return defup;
    }

    public int getCUR_hp() {
        return CUR_hp;
    }

    public int getKills() {
        return kills;
    }

    public static void setAttup(int attup) {
        Marine.attup = attup;
    }

    public static void setDefup(int defup) {
        Marine.defup = defup;
    }

    public void setCUR_hp(int CUR_hp) {
        this.CUR_hp = CUR_hp;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    // 생성자는 리턴이 없다
    // 정적 생성자 : static 멤버 초기화 !!
    static
    {
        System.out.println("static { } 호출 ");
        attup = 0;
        defup = 0;
    }

    // 인스턴스 생성자 : 객체당 한번만 호출돼서 객체 초기화
    public Marine()
    {
        System.out.println("Mairne() 호출 ");
        this.kills = 0;
        this.CUR_hp = 40;
    }
}

public class OOP2 {
    public static void main(String[] args)
    {
        Marine m1 = new Marine();
        Marine m2 = new Marine();
        Marine m3 = new Marine();


    }
}
