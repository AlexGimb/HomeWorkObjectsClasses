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
        System.out.println();
        System.out.println(tittle + ", автор " + getAuthor().getFirstName() + " " + getAuthor().getLastName() + ", год " + yearPublishing);
        System.out.println("---------------------------------------------------------------------------------------");
    }
}
