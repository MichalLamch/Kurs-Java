public class UkladWsp {
    private Point[] tab_point = new Point[50];
    private Point3d[] tab_point3d = new Point3d[50];
    public void Stworz_point(){
        for( int i=0; i<tab_point.length; i++){
            tab_point[i]=new Point(i,i*2);
        }
    }
    public void Stworz_point3d(){
        for( int i=0; i<tab_point3d.length; i++){
            tab_point3d[i]=new Point3d(i-10, i*4, (i-20)*2);
        }
    }
    public void Print(){
        for(int i=0; i<tab_point.length; i++){
            System.out.println(tab_point[i].Get_x()+ " " + tab_point[i].Get_y());
        }
    }
}
