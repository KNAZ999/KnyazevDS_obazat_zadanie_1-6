//Напишите класс Book, предоставляющий информацию о названии
//книги методом getTitle(), о его авторе методом getAuthor() и о
//количестве экземпляров методом getNumber(). Напишите метод
//setNumber(int number), который может изменять количество
//экземпляров. Все поля класса должны быть объявлены как private.
package p;

public class Books {
    public class Book {

        public int pages;
        public String publisher;
        public int year;
        protected String title;
        protected String author;

        public Book(String theBook, String famousWriter, int i, String bigBookPublisher, int i1) {
        }

        public Book(Book first) {
        }

        public void main(String[] args) {
            Book first = new Book("The Book", "Famous Writer", 199, "Big Book Publisher", 1984);
            Book second = new Book("The Second Book", "Less F. Writer", 249, "The Book Publishers", 1999);

            System.out.println("First book");
            System.out.println(first + "\n");
            System.out.println("Second book");
            System.out.println(second + "\n");

            System.out.println("Title of the first book: " + first.getTitle() + "\n");


            Book firstCopy = new Book(first);
            System.out.println("Copy of the first book:");
            System.out.println(firstCopy + "\n");

            System.out.println("Copy equals first book: " + firstCopy.equals(first));
            System.out.println("Second book equals first book: " + second.equals(first));
            System.out.println();

            System.out.println("Change writer of the copy to :'Most F. Writer'");
            firstCopy.setAuthor("Most F. Writer");
            System.out.println(firstCopy + "\n");
            System.out.println("Copy equals first book: " + firstCopy.equals(first));

        }

        private void setAuthor(String s) {
        }

        private String getTitle() {
            return "";
        }

    }


    private String title;
    private String author;
    private int pages;
    private String publisher;
    private int year;

    public void Book(String title, String author, int pages, String publisher, int year) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.publisher = publisher;
        this.year = year;
    }

    public void Book(@org.jetbrains.annotations.NotNull Book book) {
        this.title = book.title;
        this.author = book.author;
        this.pages = book.pages;
        this.publisher = book.publisher;
        this.year = book.year;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book)) {
            return false;
        }
        Book other = (Book) o;

        if (this.title.equals(other.title) &&
                this.author.equals(other.author) &&
                this.publisher.equals(other.publisher) &&
                this.pages == other.pages && this.year == other.year) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%-10s %s\n", "Title:", title) +
                String.format("%-10s %s\n", "Author:", author) +
                String.format("%-10s %d\n", "Pages:", pages) +
                String.format("%-10s %s\n", "Publisher:", publisher) +
                String.format("%-10s %d", "Year:", year);
    }

    public void main() {
    }
}




