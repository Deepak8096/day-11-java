import java.util.*;
class Main{
    public static void main(String[] args){
        ArrayList<Integer> a=new ArrayList();
        a.add(45);
        a.add(34);
        a.add(43);
        a.add(39);
        Collections.sort(a);
        System.out.println(a);
    }
}