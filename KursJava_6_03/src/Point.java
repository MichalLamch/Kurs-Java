public class Point {
    private int x;
    private int y;
    Point(){};
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void Set_x(int x){
        this.x =x;
    }
    public void Set_y(int y){
        this.y =y;
    }
    public int Get_y(){
        return y;
    }
    public int Get_x(){
        return x;
    }
}
