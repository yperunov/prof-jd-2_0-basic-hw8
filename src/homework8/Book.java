package homework8;

public class Book {
    private final String title;
    private int year;

    public Book(String title, Author bookAuthor, int year) {
        this.title = title;
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }
}
