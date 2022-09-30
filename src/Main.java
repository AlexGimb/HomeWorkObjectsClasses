public class Main {
    public static void task(String number) {
        System.out.println("==============================================");
        System.out.println("Задание " + number);
    }

    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        task("1");

        Book TheGreenMile = new Book("Зеленная миля", new Author("Stephen", "King"), 1996);

        Book TheLordOfTheRings = new Book("Властелин колец", new Author("John", "Tolkien"), 1954);

        TheGreenMile.BookSeal();
        TheLordOfTheRings.BookSeal();

        TheLordOfTheRings.setYearPublishing(1955);
        TheLordOfTheRings.BookSeal();

        }
}