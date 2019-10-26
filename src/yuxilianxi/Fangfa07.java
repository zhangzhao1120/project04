package yuxilianxi;

/*
public class Fangfa07 {
    public static void main(String[] args) {
        int[]arr={112,222,313,484,55};
        zuiDaZhi(arr);
    }
    public static void zuiDaZhi(int[]arr){
        int max=arr[0];
        for (int i = 0; i < 5; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max:"+max);
    }
}
*/
public class Fangfa07 {
    public static void main(String[] args) {
        int[]arr={112,222,313,484,55};
        int num=zuiDaZhi(arr);
        System.out.println("num:"+num);
    }
    public static int zuiDaZhi(int[]arr){
        int max=arr[0];
        for (int i = 1; i < 5; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
