class BookDemo {
    Book objBooks[];

    BookDemo() {
        objBooks = new Book[2];
    }

    void createBooks() {
        objBooks[0] = new Book();
        objBooks[0].setName("Gone With the Wind");
        objBooks[0].setPrice(500);

        objBooks[1] = new Book();
        objBooks[1].setName("Java Programming");
        objBooks[1].setPrice(300);
    }

    void showBooks() {
        for (int iIndex = 0; iIndex < objBooks.length; iIndex++) {
            System.out.println(objBooks[iIndex].getName());
            System.out.println(objBooks[iIndex].getPrice());
        }
    }

    public static void main(String a[]) {
        BookDemo objBookDemo = new BookDemo();
        objBookDemo.createBooks();
        objBookDemo.showBooks();
    }
}
