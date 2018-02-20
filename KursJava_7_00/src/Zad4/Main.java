package Zad4;

public class Main {
    public static void main (String args[]){
        IKlik ik = new IKlik() {
            @Override
            public void onRightButtonClick() {
                System.out.println("Prawy");
            }

            @Override
            public void onLeftButtonClick() {
                System.out.println("Lewy");
            }
        };
        ik.onRightButtonClick();
        ik.onLeftButtonClick();
    }
}
