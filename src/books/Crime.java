package books;

import java.util.HashMap;

public class Crime extends Book {

    @Override
    public String genreDescription() {
        return "The crime genre is largely classified by a story that is centered around the solving of a crime. The story needs a protagonist, usually some type of detective, whether a professional or an amateur or even a private investigator, who is determined to solve the crime.";
    }
    private HashMap<String, Crime> crimeBooks;
    public Crime(String author, String bookDescription, String price) {
        super(author,bookDescription,price);
        crimeBooks = new HashMap<>();
        mapCrime();
    }
    private void mapCrime(){
        crimeBooks.put("The Secret History", new Crime(" Donna Tartt", "A gripping tale of murder, morality, and the psychological unraveling of a group of elite college students.", "This book costs 447.72 liras"));
        crimeBooks.put("Gone Girl", new Crime("Gillian Flynn", "A dark and twisted psychological thriller about marriage, deceit, and revenge.", "This book costs 391.72 liras"));
        crimeBooks.put("In Cold Blood", new Crime("Truman Capote", "A chilling true-crime narrative that examines the brutal murder of a Kansas family and its aftermath.", "This book costs 335.72 liras"));
        crimeBooks.put("And Then There Were None", new Crime("Agatha Christie", "A masterful whodunit where ten strangers are lured to an isolated island and systematically eliminated.", "This book costs 223.72 liras"));
        crimeBooks.put("Murder on the Orient Express", new Crime("Agatha Christie", "A classic mystery novel featuring Hercule Poirot solving a murder aboard a luxurious train.", "This book costs 223.72 liras"));
        crimeBooks.put("Rebecca", new Crime("Daphne du Maurier", "A gothic thriller about love, jealousy, and the haunting legacy of the enigmatic Rebecca.", "This book costs 335.72 liras"));
        crimeBooks.put("A Good Girl's Guide to Murder", new Crime("Holly Jackson", "A captivating young adult mystery about a high school student investigating a closed murder case.", "This book costs 391.72 liras"));
        crimeBooks.put("Good Girl, Bad Blood", new Crime("Holly Jackson", "A thrilling sequel that follows a teen detective unraveling another dangerous mystery in her small town.", "This book costs 391.72 liras"));
        crimeBooks.put("As Good as Dead", new Crime("Holly Jackson", "The gripping finale to the trilogy, exploring the consequences of seeking justice and revenge.", "This book costs 447.72 liras"));
        crimeBooks.put("The Girl with the Dragon Tattoo", new Crime("Stieg Larsson", "A dark and compelling crime novel about a journalist and a hacker unraveling a decades-old mystery.", "This book costs 391.72 liras"));

    }

    public HashMap<String, Crime> getInfoCrime(){
        return crimeBooks;
    }

}
