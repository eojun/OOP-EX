// final : 상수화 --> 값의 변경 금지
// 클래스 만드는 순서
// 1. 필드 작성
//  1.1 적절한 타입과 이름으로 private 작성
//  1.2 final 멤버 찾기(상수) : setter, 생성자 모양 영향
// 2. getter/setter
// 3. 생성자
// 4. 메소드

class circle
{

    private static final double PI = 3.14; // 절대로 변경되지 않는 값
    private int left;
    private int top;
    private int right;
    private int bottom;

    public double getPI() {
        return PI;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public circle(int left, int top, int right, int bottom)
    {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public void draw()
    {

    }


}

public class OOP1 {
}
