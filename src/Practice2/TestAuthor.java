package Practice2;

public class TestAuthor {
    public static void main(String[] args) {
        Author freed = new Author("faridtchak@gmail.com", "Farid Freed", 'm');
        System.out.println(freed);
        freed.setEmail("freedtchak@gmail.com");
        System.out.println(freed);
        System.out.println("name is: " + freed.getName());
    }
}