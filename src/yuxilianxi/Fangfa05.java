package yuxilianxi;

public class Fangfa05 {
    public static void main(String[] args) {
        System.out.println(campare(10L,20L));

    }
    public static boolean campare(int a,int b){
        System.out.println("int");
        return a==b;
    }
    public static boolean campare(byte a,byte b){
        System.out.println("byte");
        return a==b;
    }
    public static boolean campare(short a,short b){
        System.out.println("short");
        return a==b;
    }
    public static boolean campare(long a,long b){
        System.out.println("long");
        return a==b;
    }
}
