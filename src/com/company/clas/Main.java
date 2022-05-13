package com.company.clas;


public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("Ivanov", "Ivan","Ivanovich");
//        reader.setSurname("Ivanov");
//        reader.setName("Ivan");
//        reader.setPatronymic("Ivanovich");

        reader.takeBook(7);
        reader.printBook();

        reader.takeBook("BC");
        reader.printBook();


        Book book = new Book();
        book.setTitleBook("Sea");
        book.setAuthor("Pushkin");

        Book book2 = new Book();
        book2.setTitleBook("Wind");
        book2.setAuthor("Push");

        Book book3 = new Book();
        book3.setTitleBook("Winss");
        book3.setAuthor("Pushs");

        System.out.println(book.getId());
        System.out.println(book2.getId());
        System.out.println(book3.getId());

        reader.takeBook(book,book2);
        reader.printBook();
//
//
//
//        System.out.println(book.getTitleBook());


//        Reader reader = new Reader();
//        reader.setSurname("Petrov");
//        reader.setName("Petya");
//        reader.setPatronymic("Petrovich");
//
//
//        Reader reader2 = new Reader();
//        reader2.setSurname("Sidorov");
//        reader2.setName("Iliya");
//        reader2.setPatronymic("Sidorovich");
//
//        reader2.libraryName = "vvv";
//
//        Reader.libraryName = "aaa";
//
//
//        System.out.println(reader.libraryName);
//        System.out.println(reader2.libraryName);

    }
}
