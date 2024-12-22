package books;
import java.util.*;

public class History extends Book {
    @Override
    public String genreDescription(){
        return "History genre consists of events of significant change that happened in the past and the discovery, collection, presentation, and organization of the information";
    }

    private HashMap<String, History> historyBooks;

    public History(String author, String bookDescription, String price){
        super(author, bookDescription, price);
        historyBooks= new HashMap<>();
        mapHistory();
    }
    public void mapHistory(){
        historyBooks.put("The Cold War", new History("John Lewis Gaddis", "A comprehensive history of the Cold War, detailing the political and military tensions between the United States and the Soviet Union.", "This book costs 447.72 liras"));
        historyBooks.put("The World: A History", new History("Felipe Fernández-Armesto", "A sweeping narrative that traces the development of human societies from prehistory to modern times, highlighting key events and figures.", "This book costs 391.72 liras"));
        historyBooks.put("The Guns of August", new History("Barbara Tuchman", "A detailed account of the first month of World War I, exploring the causes and early conflicts that led to the war.", "This book costs 335.72 liras"));
        historyBooks.put("A People's History of the United States", new History("Howard Zinn", "A provocative retelling of American history from the perspective of marginalized groups, challenging traditional narratives.", "This book costs 447.72 liras"));
        historyBooks.put("The Rise and Fall of the Third Reich", new History("William L. Shirer", "A thorough history of Nazi Germany, examining its origins, rise to power, and eventual collapse.", "This book costs 559.72 liras"));
        historyBooks.put("The Diary of a Young Girl", new History("Anne Frank", "The poignant and powerful diary of Anne Frank, a Jewish girl hiding from the Nazis during World War II.", "This book costs 223.72 liras"));
        historyBooks.put("The History of the Ancient World", new History("Susan Wise Bauer", "A comprehensive history of the ancient world, covering the rise of major civilizations from Mesopotamia to Rome.", "This book costs 335.72 liras"));
        historyBooks.put("The Silk Roads: A New History of the World", new History("Peter Frankopan", "A reimagining of world history through the lens of the Silk Roads, examining the interconnectedness of civilizations throughout history.", "This book costs 447.72 liras"));
        historyBooks.put("Guns, Germs, and Steel", new History("Jared Diamond", "An exploration of the factors that shaped human history, focusing on the role of geography, biology, and culture in shaping civilizations.", "This book costs 335.72 liras"));
        historyBooks.put("The Age of Revolution", new History("Eric Hobsbawm", "A study of the revolutionary period from the late 18th century to the early 19th century, focusing on political and social upheavals.", "This book costs 391.72 liras"));

    }
    public HashMap<String,History>getInfoHistory(){
        return historyBooks;
    }
}
