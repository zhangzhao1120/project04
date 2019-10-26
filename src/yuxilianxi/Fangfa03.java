package yuxilianxi;

public class Fangfa03 {
    public static void main(String[] args) {
        int a=20;
        boolean flag=lianXi03(a);
        System.out.println(flag);
    }
    public static boolean lianXi03(int a){
        if(a%2==0){
            return true;
        }else{
            return false;
        }
    }
}
