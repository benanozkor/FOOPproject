import books.Book;
import books.Classics;
import books.Crime;
import books.Drama;
import books.Fantasy;
import books.History;
import books.Mangas;
import books.Philosophy;
import books.Romance;
import books.Thriller;
import books.YoungAdult;


public class Main {
    public static void main(String[] args) {
        Classics book1= new Classics("Pride and Prejudice", "Jane Austen", 432, 279.72, 1813);
        Classics book2= new Classics("1984", "George Orwell", 328, 419.72, 1949);
        Classics book3= new Classics("To Kill a Mockingbird", "Harper Lee", 336, 223.72, 1960);
        Classics book4= new Classics("War and Peace", "Leo Tolstoy", 1225, 559.72, 1869);
        Classics book5= new Classics("Crime and Punishment", "Fyodor Dostoevsky", 671, 335.72, 1866);
        Classics book6= new Classics("Little Women", "Louisa May Alcott", 759, 335.72, 1868);
        Classics book7= new Classics("Anna Karenina", "Leo Tolstoy", 864, 447.72, 1877);
        Classics book8= new Classics("The Picture of Dorian Gray", "Oscar Wilde", 254, 223.72, 1890);
        Classics book9= new Classics("The Brothers Karamazov", "Fyodor Dostoevsky", 796, 447.72, 1880);
        Classics book10= new Classics("The Adventures of Sherlock Holmes", "Arthur Conan Doyle", 307, 279.72, 1892);

        Crime book11= new Crime("The Secret History", "Donna Tartt", 559, 447.72, 1992);
        Crime book12 = new Crime("Gone Girl", "Gillian Flynn", 432, 391.72, 2012);
        Crime book13 = new Crime("In Cold Blood", "Truman Capote", 343, 335.72, 1966);
        Crime book14 = new Crime("And Then There Were None", "Agatha Christie", 272, 223.72, 1939);
        Crime book15 = new Crime("Murder on the Orient Express", "Agatha Christie", 256, 223.72, 1934);
        Crime book16 = new Crime("Rebecca", "Daphne du Maurier", 449, 335.72, 1938);
        Crime book17 = new Crime("A Good Girl's Guide to Murder", "Holly Jackson", 432, 391.72, 2019);
        Crime book18 = new Crime("Good Girl, Bad Blood", "Holly Jackson", 448, 391.72, 2020);
        Crime book19 = new Crime("As Good as Dead", "Holly Jackson", 512, 447.72, 2021);


    }
}