package yuxilianxi;

public class Fangfa06 {
    public static void main(String[] args) {
        int[]arr={11,22,33,44,55};
        shuzu(arr);
    }
    public static void shuzu(int[]arr2){
        System.out.print("[");
        for (int i = 0; i <5 ; i++)
            if (i < arr2.length - 1) {
                System.out.print(arr2[i] + ",");
            } else {
                System.out.print(arr2[i]);
            }
        System.out.println("]");
    }
}

