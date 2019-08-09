public class Test {
    public static void main(String[] args) {
        MyList<Integer>myList=new MyList<Integer>(10,5);

        myList.add(1,1);
        myList.add(4,8);
        myList.add(3,4);
        myList.add(1,6);
        myList.remove(3);
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));
        System.out.println(myList.get(3));
        System.out.println(myList.get(4));
        System.out.println(myList.get(5));
        System.out.println(myList.get(6));
        System.out.println(myList.get(7));
        System.out.println(myList.get(8));








    }
}
