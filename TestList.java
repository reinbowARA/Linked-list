public class TestList {
    public static void main(String[] args) {
        MyList list = new MyList();

        list.endadd(1);
        list.endadd(2);
        list.endadd(3);
        list.endadd(4);
        list.endadd(5);
        list.endadd(6);

        //list.print();

        //list.remove(2);
        //list.remove(1);

        list.print();
        System.out.println("Всего элементов в списке = "+list.getLenght());
        
    }
}
