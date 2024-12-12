import java.util.*;
class Main{
    public static void main(String[] args){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(45);
        a.add(34);
        a.add(43);
        a.add(39);
        System.out.println(a);
        a.addFirst(23);
        System.out.println(a);
        a.addLast(50);
        System.out.println(a);
    }
}
