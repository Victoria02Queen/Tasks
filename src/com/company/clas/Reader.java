package com.company.clas;

import java.util.Arrays;

public class Reader {

    private String surname;
    private String name;
    private String patronymic;
    private long readTicketId;
    private String faculty;
    private String telephoneNumb;

    public static String libraryName = "Abcs";
    String[] books = new String[10];

    public Reader(String surname, String name, String patronymic ){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }


    public void printBook(){
        System.out.println((Arrays.toString(books)));
    }


    public void takeBook(Book...booksObj){
        /**/
        if (check(booksObj.length)) {
            int counter = 0;
            int current = 0;


            for (int i = 0; i < books.length; i++) {

                if (books[i] == null) {
                    books[i] = booksObj[current].getTitleBook();
                    current++;
                    counter++;
                }

                if (counter == books.length) {
                    break;
                }
            }
            System.out.println(initials() + " взял  " + books.length + " книги");
        }
        else {
            System.out.println("Книги не были взяты ");
        }
    }

    public void takeBook(String...booksNames){

        if (check(booksNames.length)) {
            int counter = 0;
            int current = 0;

            for (int i = 0; i < books.length; i++) {

                if (books[i] == null) {
                    books[i] = booksNames[current];
                    current++;
                    counter++;
                }
                if (counter == booksNames.length) {
                    break;
                }

            }
            System.out.println(initials() + " взял  " + booksNames.length + " книги");
        }
        else {
            System.out.println("Книги не были взяты ");
        }
    }
    private boolean check(int count){
        /*Метод возвращает результат возможность положить книги в массив */
        return getCountOfAvailableBooks() >= count;
//        if (getCountOfAvailableBooks() >= count){
//            return true;
//        }
//        return false;
    }
    /**
     *  Метод предназначен для проверки получения свободных мест. Метод возвращает результат количество доступных книг
     */
    private int getCountOfAvailableBooks(){

        int count = 0;
        for (String i : books){
            if (i == null){
                count++;
            }
        }
        return count;
    }
    /**
     *  Метод закрепляет за человеком выбранные книги. Выводит на экран количество взятых книг
     * @param count - количество книг, которые берет читатель
     */
    public void takeBook(int count) {
        if (check(count)) {
            int counter = 0;
            int createId = 0;

            for (int i = 0; i < books.length; i++){

                if (books[i] == null){
                    books[i] = "B-N";
                    counter++;

                }
                if (counter == count){
                    break;
                }
            }
            System.out.println(initials() + " взял  " + count + " книги");
        }
        else {
            System.out.println("Книги не были взяты");
        }
    }
    public String initials(){
        /*Метод предназначен для выбора инициалов из Имени и Отчества*/
        return surname + " " + name.charAt(0) + ". " + patronymic.charAt(0) +".";

    }

    public void setReadTicketId(long readTicketId) {
        this.readTicketId = readTicketId;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setTelephoneNumb(String telephoneNumb) {
        this.telephoneNumb = telephoneNumb;
    }

    public void returnBook(String titleBook){

    }


}

