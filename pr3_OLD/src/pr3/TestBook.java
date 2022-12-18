package pr3;

public class TestBook
{
    public static void main(String[] args) {
        Book b1 = new Book(100,"Война и мир", false);
        Book b2 = new Book(10,"Колобок", true);

        System.out.println(b1);

        System.out.println(b2);
    }
}
