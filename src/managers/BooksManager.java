package managers;

import books.*;

import java.util.ArrayList;
import java.util.HashMap;

public class BooksManager {

    private HashMap<String, Book> books;

    public BooksManager(){
        books = new HashMap<>();
        preloadBooks();
    }

    private void preloadBooks() {
        books.put("Pride and Prejudice", new Classics("Pride and Prejudice","Jane Austen", "A classic romantic novel that explores themes of love, societal expectations, and personal growth in Regency-era England.",279.72,2));
        books.put("1984", new Classics("1984","George Orwell", "A dystopian novel portraying a totalitarian regime where surveillance and propaganda dominate the lives of individuals.",419.72,2));
        books.put("To Kill a Mockingbird", new Classics("To Kill a Mockingbird","Harper Lee", "A poignant tale of racial injustice and moral growth set in the Deep South during the 1930s.",23.72,3));
        books.put("War and Peace", new Classics("War and Peace","Leo Tolstoy", "An epic masterpiece that intertwines the lives of individuals with the historical backdrop of the Napoleonic Wars in Russia.",559.72,4));
        books.put("Crime and Punishment", new Classics("Crime and Punishment","Fyodor Dostoevsky", "A psychological exploration of morality and redemption through the story of a conflicted young man who commits murder.",335.72,5));
        books.put("Little Women", new Classics("Little Women","Louisa May Alcott", "A heartwarming story of four sisters growing up during the American Civil War, facing love, loss, and personal ambitions.",335.72,2));
        books.put("Anna Karenina", new Classics("Anna Karenina","Leo Tolstoy", "A tragic love story that examines the complexities of family, fidelity, and societal norms in Imperial Russia.",447.72, 5));
        books.put("The Picture of Dorian Gray", new Classics("The Picture of Dorian Gray","Oscar Wilde", "A philosophical novel exploring themes of beauty, morality, and the consequences of living a hedonistic lifestyle.",223.72,2));
        books.put("The Brothers Karamazov", new Classics("The Brothers Karamazov","Fyodor Dostoevsky", "A profound narrative delving into faith, doubt, and the moral dilemmas faced by three brothers in 19th-century Russia.",447.72,4));
        books.put("The Adventures of Sherlock Holmes", new Classics("The Adventures of Sherlock Holmes","Arthur Conan Doyle", "A collection of thrilling detective stories featuring the brilliant and eccentric detective Sherlock Holmes and his friend Dr. Watson.",279.72 ,3));
        books.put("The Secret History", new Crime("The Secret History"," Donna Tartt", "A gripping tale of murder, morality, and the psychological unraveling of a group of elite college students.", 447.72 ,6));
        books.put("Gone Girl", new Crime("Gone Girl","Gillian Flynn", "A dark and twisted psychological thriller about marriage, deceit, and revenge.", 391.72,2));
        books.put("In Cold Blood", new Crime("In Cold Blood","Truman Capote", "A chilling true-crime narrative that examines the brutal murder of a Kansas family and its aftermath.", 335.72,4));
        books.put("And Then There Were None", new Crime("And Then There Were None","Agatha Christie", "A masterful whodunit where ten strangers are lured to an isolated island and systematically eliminated.", 223.72 ,6));
        books.put("Murder on the Orient Express", new Crime("Murder on the Orient Express","Agatha Christie", "A classic mystery novel featuring Hercule Poirot solving a murder aboard a luxurious train.", 223.72,6));
        books.put("Rebecca", new Crime("Rebecca","Daphne du Maurier", "A gothic thriller about love, jealousy, and the haunting legacy of the enigmatic Rebecca.", 335.72,7));
        books.put("A Good Girl's Guide to Murder", new Crime("A Good Girl's Guide to Murder","Holly Jackson", "A captivating young adult mystery about a high school student investigating a closed murder case.", 391.72 ,4));
        books.put("Good Girl, Bad Blood", new Crime("Good Girl, Bad Blood","Holly Jackson", "A thrilling sequel that follows a teen detective unraveling another dangerous mystery in her small town.",  391.72 ,2));
        books.put("As Good as Dead", new Crime("As Good as Dead","Holly Jackson", "The gripping finale to the trilogy, exploring the consequences of seeking justice and revenge.",  447.72 ,4));
        books.put("The Girl with the Dragon Tattoo", new Crime("The Girl with the Dragon Tattoo","Stieg Larsson", "A dark and compelling crime novel about a journalist and a hacker unraveling a decades-old mystery.",  391.72 ,2));
        books.put("Death of a Salesman", new Drama("Death of a Salesman","Arthur Miller", "A poignant drama exploring the struggles of an aging salesman grappling with failure and unrealized dreams.",  380.80 ,2));
        books.put("Hamlet", new Drama("Hamlet","William Shakespeare", "A timeless tragedy about revenge, madness, and the moral dilemmas faced by Prince Hamlet of Denmark.", 280.53 ,4));
        books.put("The Sun Also Rises", new Drama("The Sun Also Rises","Ernest Hemingway", "A compelling tale of love, disillusionment, and the Lost Generation's post-World War I experiences.",  300.03 ,1));
        books.put("Brave New World", new Drama("Brave New World","Aldous Huxley", "A dystopian novel envisioning a future society controlled by technology, conditioning, and a lack of individuality.", 280.4,2 ));
        books.put("The Glass Menagerie", new Drama("The Glass Menagerie","Tennessee Williams", "A touching memory play about family, fragility, and the pursuit of happiness.", 300.1,2));
        books.put("Macbeth", new Drama("Macbeth","William Shakespeare", "A dark tragedy about ambition, power, and the destructive consequences of unchecked desire.", 275.8,3));
        books.put("The Seven Husbands of Evelyn Hugo", new Drama("The Seven Husbands of Evelyn Hugo","Taylor Jenkins Reid", "A captivating story of fame, love, and the secrets of a Hollywood icon told through a journalist's eyes.", 298.67,1));
        books.put("The Book Thief", new Drama("The Book Thief","Markus Zusak", "A heart-wrenching story set in Nazi Germany, narrated by Death, about a young girl's love for books and survival.",   306.4 ,6));
        books.put("Me Before You", new Drama("Me Before You","Jojo Moyes", "A deeply emotional tale of love, loss, and the life-changing bond between two unlikely individuals.", 317.3,2));
        books.put("A Little Life", new Drama("A Little Life","Hanya Yanagihara", "A powerful and intense drama following four college friends as they navigate trauma, relationships, and success in New York City.",  399.6 ,1));
        books.put("The Cruel Prince", new Fantasy("The Cruel Prince","Holly Black", "A captivating tale of political intrigue and treachery in the world of Faerie, where a mortal girl vies for power.",  300.4 ,3));
        books.put("The Wicked King", new Fantasy("The Wicked King","Holly Black", "A gripping sequel delving into courtly deception and dangerous alliances in the Faerie realm.", 312.5 ,1));
        books.put("The Queen of Nothing", new Fantasy("The Queen of Nothing", "Holly Black", "The thrilling conclusion to the series, where loyalty, love, and power collide in the Faerie world.",  321.9 ,2));
        books.put("Six of Crows", new Fantasy("Six of Crows","Leigh Bardugo", "A thrilling heist fantasy featuring a band of misfits attempting an impossible mission in a magical world.", 358.5 ,1));
        books.put("Crooked Kingdom", new Fantasy("Crooked Kingdom","Leigh Bardugo", "The high-stakes sequel, packed with danger, cunning plans, and unforgettable characters.", 406.2,1));
        books.put("The Poppy War", new Fantasy("The Poppy War","R.F. Kuang", "A dark and compelling epic inspired by Chinese history, exploring war, power, and the cost of ambition.",  374.66 ,3));
        books.put("The Dragon Republic", new Fantasy("The Dragon Republic","R.F. Kuang", "The intense sequel, delving deeper into rebellion, loyalty, and the aftermath of devastating war.",  493.6 ,4));
        books.put("The Burning God", new Fantasy("The Burning God","R.F. Kuang", "The explosive finale, exploring the consequences of revenge, betrayal, and unyielding power.", 438.1,1));
        books.put("Once Upon a Broken Heart", new Fantasy("Once Upon a Broken Heart","Stephanie Garber", "A whimsical and romantic fantasy about curses, bargains, and the magic of broken hearts.",  402.67 ,3));
        books.put("The Ballad of Never After", new Fantasy("The Ballad of Never After","Stephanie Garber", "A dazzling sequel exploring love, heartbreak, and the choices that shape destinies.",  398.93,3));
        books.put("A Curse for True Love", new Fantasy("A Curse for True Love", "Stephanie Garber", "The enchanting conclusion to the trilogy, weaving together romance, magic, and a quest for true love.", 347.52 ,2));
        books.put("The Cold War", new History("The Cold War","John Lewis Gaddis", "A comprehensive history of the Cold War, detailing the political and military tensions between the United States and the Soviet Union.", 447.72 ,3));
        books.put("The World: A History", new History("The World: A History","Felipe Fernández-Armesto", "A sweeping narrative that traces the development of human societies from prehistory to modern times, highlighting key events and figures.", 391.72,3));
        books.put("The Guns of August", new History("The Guns of August","Barbara Tuchman", "A detailed account of the first month of World War I, exploring the causes and early conflicts that led to the war.",  335.72,2));
        books.put("A People's History of the United States", new History("A People's History of the United States","Howard Zinn", "A provocative retelling of American history from the perspective of marginalized groups, challenging traditional narratives.",  447.72,1));
        books.put("The Rise and Fall of the Third Reich", new History("The Rise and Fall of the Third Reich","William L. Shirer", "A thorough history of Nazi Germany, examining its origins, rise to power, and eventual collapse.",  559.72 ,3));
        books.put("The Diary of a Young Girl", new History("The Diary of a Young Girl","Anne Frank", "The poignant and powerful diary of Anne Frank, a Jewish girl hiding from the Nazis during World War II.",  223.72 ,2));
        books.put("The History of the Ancient World", new History("The History of the Ancient World","Susan Wise Bauer", "A comprehensive history of the ancient world, covering the rise of major civilizations from Mesopotamia to Rome.",  335.72 ,2));
        books.put("Guns, Germs, and Steel", new History("Guns, Germs, and Steel","Jared Diamond", "An exploration of the factors that shaped human history, focusing on the role of geography, biology, and culture in shaping civilizations.", 335.72,2));
        books.put("The Age of Revolution", new History("The Age of Revolution","Eric Hobsbawm", "A study of the revolutionary period from the late 18th century to the early 19th century, focusing on political and social upheavals.",  391.72 ,1));
        books.put("My Hero Academia", new Mangas("My Hero Academia","Kōhei Horikoshi", "A thrilling manga about a world where nearly everyone has superpowers, following a young boy's journey to become the greatest hero.",  300.4 ,3));
        books.put("Demon Slayer: Kimetsu no Yaiba", new Mangas("Demon Slayer: Kimetsu no Yaiba","Koyoharu Gotouge", "A gripping story about a young boy who becomes a demon slayer to avenge his family and cure his sister, who has been turned into a demon.", 312.5 ,4));
        books.put("A Silent Voice", new Mangas("A Silent Voice","Yoshitoki Ōima", "A heartfelt tale about bullying, redemption, and the power of communication, following a young boy's journey to make amends with a deaf girl he once tormented.",  321.9,1));
        books.put("Jujutsu Kaisen", new Mangas("Jujutsu Kaisen","Gege Akutami", "A dark action-packed series about a high school student who joins a secret organization to battle malevolent spirits known as curses.",  358.5,3));
        books.put("Skip Beat!", new Mangas("Skip Beat!","Yoshiki Nakamura", "A comedic and dramatic manga about a girl who enters the entertainment industry to take revenge on the boy who dumped her.",  406.2 ,2));
        books.put("The Promised Neverland", new Mangas("The Promised Neverland","Kaiu Shirai, Posuka Demizu", "A suspenseful story about a group of orphans who uncover dark secrets about their idyllic home and plan a daring escape.",  374.66 ,5));
        books.put("Assassination Classroom", new Mangas("Assassination Classroom","Yūsei Matsui", "A quirky and action-packed series about a group of students tasked with assassinating their super-powered alien teacher.", 493.6,1));
        books.put("Fullmetal Alchemist", new Mangas("Fullmetal Alchemist","Hiromu Arakawa", "A beloved series about two brothers who use alchemy to search for the Philosopher’s Stone to restore their bodies after a failed experiment.",  438.1 ,2));
        books.put("Soul Eater", new Mangas("Soul Eater","Atsushi Ōkubo", "A dark fantasy action series set in a world where students at a special academy fight monsters to become powerful weapons and protect humanity.",  402.67 ,2));
        books.put("Spy x Family", new Mangas("Spy x Family","Tatsuya Endo", "A heartwarming and action-packed manga series about a spy, an assassin, and a telepath who must come together as a fake family to achieve their individual goals while navigating hilarious and touching moments.",  300.4 ,5));
        books.put("Beyond Good and Evil: Prelude to a Philosophy of the Future", new Philosophy("Beyond Good and Evil: Prelude to a Philosophy of the Future","Friedrich Nietzsche", "A philosophical exploration of morality, free will, and the nature of truth, challenging traditional values and ethics.",  447.72 ,4));
        books.put("Nicomachean Ethics", new Philosophy("Nicomachean Ethics","Aristotle", "A foundational text in ethics, examining the nature of virtue, happiness, and the pursuit of the good life.",  391.72 ,2));
        books.put("Republic", new Philosophy("Republic","Plato", "A philosophical dialogue about justice, the ideal state, and the nature of knowledge, featuring Socratic discussions on politics and ethics.", 335.72 ,3));
        books.put("Thus Spoke Zarathustra", new Philosophy("Thus Spoke Zarathustra","Friedrich Nietzsche", "A philosophical work that presents Nietzsche’s ideas on the Übermensch (Superman) and the reevaluation of values, symbolized through the character Zarathustra.",  559.72,2));
        books.put("The Stranger", new Philosophy("The Stranger","Albert Camus", "A novel that explores existentialism and the absurd, focusing on a man’s indifferent reaction to life and his eventual confrontation with death.", 223.72,3));
        books.put("The Boy, the Mole, the Fox and the Horse", new Philosophy("The Boy, the Mole, the Fox and the Horse", "Charlie Mackesy", "A beautifully illustrated story of friendship, love, and kindness, filled with life lessons and simple wisdom.",  335.72 ,2));
        books.put("Apology", new Philosophy("Apology","Plato", "A short dialogue in which Socrates defends his philosophy and way of life against the charges brought against him by the Athenian authorities.",  223.72 ,1));
        books.put("The Symposium", new Philosophy("The Symposium","Plato", "A philosophical dialogue about love, exploring its nature through a series of speeches at a dinner party.",  335.72 ,2));
        books.put("Nausea", new Philosophy("Nausea","Jean-Paul Sartre", "A novel that explores existential themes of alienation, absurdity, and the meaning of life through the experiences of a man in crisis.",  447.72,4));
        books.put("The Art of War", new Philosophy("The Art of War","Sun Tzu", "An ancient Chinese military treatise that offers strategies and wisdom applicable to warfare, leadership, and conflict resolution.",  391.72 ,3));
        books.put("The Song of Achilles", new Romance("The Song of Achilles","Madeline Miller", "A retelling of the Iliad that explores the intense and emotional relationship between Achilles and Patroclus, set against the backdrop of the Trojan War.",  300.4,1));
        books.put("Call Me by Your Name", new Romance("Call Me by Your Name","André Aciman", "A poignant and passionate coming-of-age romance about two young men who fall in love during a summer in Italy.", 312.5 ,3));
        books.put("Divine Rivals", new Romance("Divine Rivals","Rebecca Ross", "A magical romance set in a world torn by war, where two rivals must navigate their complex feelings for each other amid divine intervention.", 321.9,2));
        books.put("Better Than the Movies", new Romance("Better Than the Movies","Lynn Painter", "A fun and heartwarming rom-com about a high school girl who navigates love and friendship while dealing with her favorite movie-inspired fantasies.",  358.5 ,3));
        books.put("The Notebook", new Romance("The Notebook","Nicholas Sparks", "A timeless romance about a couple's enduring love, told through the memories of an elderly man reading their story to his wife.",  406.2 ,4));
        books.put("Powerless", new Romance("Powerless","Tera Lynn Childs", "A young adult fantasy where a teenage girl discovers her hidden power in a world where everyone has abilities, leading her to confront dangers and secrets.", 374.66 ,7));
        books.put("The Bridge Kingdom", new Romance("The Bridge Kingdom","Danielle L. Jensen", "A captivating fantasy about a princess who must navigate political intrigue and war as she is sent to marry a powerful king to secure her kingdom’s future.",  493.6,7));
        books.put("The Fault in Our Stars", new Romance("The Fault in Our Stars","John Green", "A heartbreaking love story between two teenagers who bond over their shared experiences with cancer, learning about love, loss, and living in the face of illness.",  438.1 ,2));
        books.put("Outlander", new Romance("Outlander","Diana Gabaldon", "A historical fiction saga about a woman who is transported back in time to 18th-century Scotland, where she navigates love, adventure, and political intrigue.", 402.67,4));
        books.put("Sense and Sensibility", new Romance("Sense and Sensibility","Jane Austen", "A classic tale of two sisters with contrasting temperaments who navigate love, heartbreak, and family relationships in Regency-era England.", 398.93,3));
        books.put("The Housemaid", new Thriller("The Housemaid","Frieda McFadden", "A psychological thriller about a woman who becomes a housemaid for a wealthy family, only to uncover dark secrets and her own hidden motives.",  300.4 ,3));
        books.put("Five Survive", new Thriller("Five Survive","Holly Jackson", "A suspenseful thriller about five friends trapped in an RV, where secrets unravel and survival becomes a life-or-death struggle.",  312.5 ,5));
        books.put("The Naturals", new Thriller("The Naturals","Jennifer Lynn Barnes", "A series following a group of gifted teens with exceptional skills in profiling and detection as they solve complex criminal cases, facing danger and personal challenges along the way.",  321.9 ,5));
        books.put("Killer Instinct", new Thriller("Killer Instinct","Jennifer Lynn Barnes", "The second book in The Naturals series, continuing the teens’ thrilling investigations and diving deeper into the mysteries of their past.",  358.5 ,2));
        books.put("All In", new Thriller("All In","Jennifer Lynn Barnes", "The third book in The Naturals series, where the team faces new dangers and challenges, testing their skills and relationships to the limit.",  406.2 ,3));
        books.put("Bad Blood", new Thriller("Bad Blood","Jennifer Lynn Barnes", "The fourth book in The Naturals series, where the characters uncover deadly secrets and confront the darkest forces they’ve ever encountered.",  374.66 ,2));
        books.put("We Were Liars", new Thriller("We Were Liars","E. Lockhart", "A captivating, twist-filled mystery about a privileged family whose dark secrets are revealed during a summer spent on their private island.",  493.6 ,1));
        books.put("Jackal", new Thriller("Jackal","Erin E. Adams", "A chilling thriller that follows a group of friends who return to their hometown, only to confront a series of horrific events linked to a long-buried secret.",  438.1 ,2));
        books.put("The Shining", new Thriller("The Shining","Stephen King", "A horror classic that tells the story of a family trapped in an isolated hotel, where supernatural forces prey on their weaknesses and fear.", 402.67 ,2));
        books.put("The Outsider", new Thriller("The Outsider","Stephen King", "A gripping mystery that blends crime, horror, and supernatural elements as a detective investigates a brutal murder with eerie implications.",  398.93 ,3));
        books.put("The Inheritance Games", new YoungAdult("The Inheritance Games","Jennifer Lynn Barnes", "A thrilling mystery about a young woman who unexpectedly inherits a fortune, but must solve a series of puzzles to claim it, uncovering dangerous family secrets along the way.", 300.4 ,2));
        books.put("The Hawthorne Legacy", new YoungAdult("The Hawthorne Legacy","Jennifer Lynn Barnes", "The second book in The Inheritance Games series, continuing the twists and turns as Avery Graham navigates a complex web of family secrets and high-stakes games.", 312.5 ,1));
        books.put("The Final Gambit", new YoungAdult("The Final Gambit","Jennifer Lynn Barnes", "The third book in The Inheritance Games series, where Avery faces her most dangerous challenge yet, as the puzzles become deadlier and the stakes higher.",  321.9 ,3));
        books.put("The Brothers Hawthorne", new YoungAdult("The Brothers Hawthorne","Jennifer Lynn Barnes", "A spin-off series set in the Inheritance Games world, focusing on the Hawthorne brothers and their intertwined fate with Avery.", 358.5 ,6));
        books.put("Lightlark", new YoungAdult("Lightlark","Alex Aster", "A fantasy novel about a cursed island where six rulers must compete in a deadly game to break their respective curses, each vying for ultimate power.",  406.2,1));
        books.put("The Hunger Games", new YoungAdult("The Hunger Games","Suzanne Collins", "A dystopian novel about a brutal competition where children must fight to the death for the entertainment of a totalitarian society, focusing on the survival of Katniss Everdeen.", 374.66 ,2));
        books.put("Aristotle and Dante Discover the Secrets of the Universe", new YoungAdult("Aristotle and Dante Discover the Secrets of the Universe","Benjamin Alire Sáenz", "A heartwarming coming-of-age story about two Mexican-American boys who develop a deep friendship that slowly evolves into something more.", 493.6 ,2));
        books.put("Truly Devious", new YoungAdult("Truly Devious","Maureen Johnson", "A gripping mystery about a teen who tries to solve the historical case of a wealthy family’s disappearance while attending a prestigious school for gifted students.",  438.1,1));
        books.put("Games Untold", new YoungAdult("Games Untold","R. A. Spratt", "A young adult mystery involving a group of teens who unravel a series of clues and riddles to uncover a dangerous conspiracy.", 402.67,4));
        books.put("The Reappearance of Rachel Price", new YoungAdult("The Reappearance of Rachel Price","Louise Candlish", "A psychological thriller about a woman’s return to her hometown after a long absence, only to uncover dark secrets about her past.", 398.93 ,3));

    }

    public static void printBooksByGenre(HashMap<String, Book> books, Class<?> genreClass){
        System.out.println("Books in genre : " + genreClass.getSimpleName() );
        for (Book book: books.values()){
            if(genreClass.isInstance(book)){
                System.out.println("\n" + book.getTitle()+ ",   by: "+ book.getAuthor() + ",  description: " + book.getBookDescription() + "  Price: " + book.getPrice()+"TL");
            }
        }
    }

    public void booksBySection(String section) {
        section = section.toLowerCase();
        switch (section){
            case "1":
            case "classics":
                printBooksByGenre(books,Classics.class);
                break;
            case "2":
            case "crime":
                printBooksByGenre(books,Crime.class);
                break;
            case "3":
            case "drama":
                printBooksByGenre(books,Drama.class);
                break;
            case "4":
            case "fantasy":
                printBooksByGenre(books,Fantasy.class);
                break;
            case "5":
            case "history":
                printBooksByGenre(books,History.class);
                break;
            case "6":
            case "mangas":
                printBooksByGenre(books,Mangas.class);
                break;
            case "7":
            case "philosophy":
                printBooksByGenre(books,Philosophy.class);
                break;
            case "8":
            case "romance":
                printBooksByGenre(books,Romance.class);
                break;
            case "9":
            case "thriller":
                printBooksByGenre(books,Thriller.class);
                break;
            case "10":
            case "young adult":
                printBooksByGenre(books,YoungAdult.class);
                break;
            default:
                System.out.println("invalid input! Please try again");
        }
    }

    public Book getBook(String name){

        return books.get(name);
    }
}
