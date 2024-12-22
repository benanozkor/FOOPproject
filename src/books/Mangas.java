package books;
import java.util.*;

public class Mangas extends Book{
    @Override
    public String genreDescription(){
        return "Manga is an umbrella term for a wide variety of comic books and graphic novels originally produced and published in Japan. Unlike American comic books, which are usually printed in full color, Japanese manga are almost always published in black and white.";
    }
    private HashMap<String,Mangas>manga;

    public Mangas(String author, String bookDescription, String price) {
        super(author, bookDescription, price);
        manga = new HashMap<>();
        mapManga();
    }
    public void mapManga(){
        manga.put("My Hero Academia", new Mangas("Kōhei Horikoshi", "A thrilling manga about a world where nearly everyone has superpowers, following a young boy's journey to become the greatest hero.", "This book costs 300.4 liras"));
        manga.put("Demon Slayer: Kimetsu no Yaiba", new Mangas("Koyoharu Gotouge", "A gripping story about a young boy who becomes a demon slayer to avenge his family and cure his sister, who has been turned into a demon.", "This book costs 312.5 liras"));
        manga.put("A Silent Voice", new Mangas("Yoshitoki Ōima", "A heartfelt tale about bullying, redemption, and the power of communication, following a young boy's journey to make amends with a deaf girl he once tormented.", "This book costs 321.9 liras"));
        manga.put("Jujutsu Kaisen", new Mangas("Gege Akutami", "A dark action-packed series about a high school student who joins a secret organization to battle malevolent spirits known as curses.", "This book costs 358.5 liras"));
        manga.put("Skip Beat!", new Mangas("Yoshiki Nakamura", "A comedic and dramatic manga about a girl who enters the entertainment industry to take revenge on the boy who dumped her.", "This book costs 406.2 liras"));
        manga.put("The Promised Neverland", new Mangas("Kaiu Shirai, Posuka Demizu", "A suspenseful story about a group of orphans who uncover dark secrets about their idyllic home and plan a daring escape.", "This book costs 374.66 liras"));
        manga.put("Assassination Classroom", new Mangas("Yūsei Matsui", "A quirky and action-packed series about a group of students tasked with assassinating their super-powered alien teacher.", "This book costs 493.6 liras"));
        manga.put("Fullmetal Alchemist", new Mangas("Hiromu Arakawa", "A beloved series about two brothers who use alchemy to search for the Philosopher’s Stone to restore their bodies after a failed experiment.", "This book costs 438.1 liras"));
        manga.put("Soul Eater", new Mangas("Atsushi Ōkubo", "A dark fantasy action series set in a world where students at a special academy fight monsters to become powerful weapons and protect humanity.", "This book costs 402.67 liras"));
        manga.put("Spy x Family", new Mangas("Tatsuya Endo", "A heartwarming and action-packed manga series about a spy, an assassin, and a telepath who must come together as a fake family to achieve their individual goals while navigating hilarious and touching moments.", "This book costs 300.4 liras"));
    }
    public HashMap<String,Mangas>getInfoMangas(){
        return manga;
    }
}
