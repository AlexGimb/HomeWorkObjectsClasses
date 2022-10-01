public class Main {

    public static void main(String[] args) {
        task1();
    }

    public static void task1() {

        Library library = new Library();

        //добавляем 4 книги
        library.addBook("Зеленная миля", new Author("Stephen", "King"), 1996);
        library.addBook("Властелин колец", new Author("John", "Tolkien"), 1954);
        library.addBook("Ведьмак", new Author("Andrzej", "Sapkowski"), 1986);
        library.addBook("Игра престолов", new Author("George Raymond", "Richard Martin"), 1996);
        //смотрим все книги что есть в библиотеке
        library.printAllBook();
        //смотрим количество книг
        library.getCurrentSize();
        //ищем книгу
        library.findBook("Зеленная миля");
        //удаляем книгу
        library.removeBook("Ведьмак");
        //Ищем книгу
        library.findBook("Ведьмак");
        //проверяем все книги что есть в библиотеке
        library.printAllBook();
        //проверяем количество книг
        library.getCurrentSize();
        //меняем дату публикации книги
        library.setFindBook("Властелин колец", 1922);
        //смотрим на изменения
        library.findBook("Властелин колец");



    }
}