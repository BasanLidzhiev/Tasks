public class Main {

    public static void main(String[] args) {

        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(14);

        System.out.println(  list.toString());
        //System.out.println(list.remove(7));
        list.reverse();
        System.out.println(list.toString());
        list.remove(2);
        System.out.println(list.toString());
        list.reverse();
        System.out.println(list.toString());




    }
}
