public class Library {
    private final Book[] books;
    private int size;

    private int yearPublishing;

    public Library() {
        this.books = new Book[5];
    }

    public void addBook(String tittleId, Author author, int yearPublishing) {
        if (size >= books.length) {
            System.out.println("Библиотека полная!");
        }
        Book newBook = new Book(tittleId, author, yearPublishing);
        books[size++] = newBook;
    }

    public void removeBook(String tittleId) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTittle().equals(tittleId)) {
                System.out.println("Книга " + books[i].getTittle() + " удален(а)");
                System.out.println();
                System.arraycopy(books, i + 1, books, i, size - i - 1);
                books[size - 1] = null;
                size--;
                return;
            }
        }
    }

    public void findBook(String tittleId) {
        for (int i = 0; i < size; i++) {
            Book book = books[i];
            if (book.getTittle().equals(tittleId)) {
                System.out.println("Книга " + book.getTittle() + " найдена:");
                books[i].bookSeal();
                System.out.println();
                return;
            }
        }
        System.out.println("Книга " + tittleId + " не надена.");
        System.out.println();
    }

    public void printAllBook() {
        for (int i = 0; i < size; i++) {
            Book book = books[i];
            books[i].bookSeal();
        }
    }

    public int getCurrentSize() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++ Книг в библиотеке: " + size + " +++++++++");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        return size;
    }

    void setFindBook(String tittleId,int yearPublishing) {
        for (int i = 0; i < size; i++) {
            Book book = books[i];
            if (book.getTittle().equals(tittleId)) {
                books[i].setYearPublishing(this.yearPublishing = yearPublishing);
            }
        }
    }
}
