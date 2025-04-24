public class Book {
    private String title;
    private String author;
    private String isbn;
    private int year;
    private boolean isBorrowed; // 대출 여부 (true: 대출 중, false: 대출 가능)

    // 기본 생성자
    public Book() {}

    // 매개변수 생성자
    public Book(String title, String author, String isbn, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.isBorrowed = false; // 책 추가될 때 기본은 '대출 가능'
    }

    // getter & setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrow() {
        isBorrowed = true;
    }

    public void returnBook() {
        isBorrowed = false;
    }

    // 책 정보 출력 메소드
    public void printInfo() {
        System.out.println("제목: " + title 
            + ", 저자: " + author 
            + ", ISBN: " + isbn 
            + ", 출판년도: " + year 
            + ", 대출상태: " + (isBorrowed ? "대출 중" : "대출 가능"));
    }
}