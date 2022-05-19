package homework9;

import java.util.Objects;

public class Book {
    private final String title;
    private final String bookAuthor;
    private int year;

    public Book(String title, Author bookAuthor, int year) {
        this.title = title;
        this.year = year;
        this.bookAuthor = bookAuthor.getAuthor();
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

    public String getBookAuthor() {
        return this.bookAuthor;
    }


    @Override
    public String toString() {
        return "Book" + hashCode() +"'" + title + "'{"+
                "author='" + getBookAuthor() + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year);
    }
}
