public class Point3d extends Point {
    private int z;
    Point3d(int x, int y, int z){
        super(x, y);
        this.z=z;
    }
    public void Set_z(int z){
        this.z =z;
    }
    public int Get_z(){
        return z;
    }
}
