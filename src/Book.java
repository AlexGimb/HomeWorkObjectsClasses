import java.util.Objects;

public class Book {
    private String tittle;
    private int yearPublishing;
    private Author author;


    public Book(String tittle, Author author, int yearPublishing) {
        this.tittle = tittle;
        this.yearPublishing = yearPublishing;
        this.author = author;
    }


    public String getTittle() {
        return tittle;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public Author getAuthor() {
        return author;
    }

    void BookSeal() {
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublishing == book.yearPublishing && tittle.equals(book.tittle) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tittle, yearPublishing, author);
    }

    @Override
    public String toString() {
        return tittle + ", год издания " + yearPublishing + ", " + author;
    }
}
