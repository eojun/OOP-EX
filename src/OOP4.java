// this 개념에 대한 이해
// --> this 객체를 나타내는 참조
// --> 메소드를 호출한 객체
// --> this는 메소드 안에서 객체를 참조하기 위한 기능 !!

class Point
{
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void show()
    {
        System.out.println(x + " : " + y);
    }




}

public class OOP4 {
    public static void main(String[] args)
    {
        Point pt1 = new Point(123,123);
        pt1.show();
        Point pt2 = new Point(123,123);
        pt2.show();
    }
}
