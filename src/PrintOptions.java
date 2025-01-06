public interface PrintOptions {

    String booksContent = """
                              Welcome to Books section! (to go to the genres type section NAME or Number)
                ----------------------------------------------------------------------------------------------------
                1. Classics
                2. Crime
                3. Drama         
                4. Fantasy
                5. History
                6. Manga
                7. Philosophy
                8. Romance
                9. Thriller
                10.Young Adult
                ---------------------------------------------------------------------------------------------------
                
                """;

    String menu = """
                        Welcome to Food Section!   (to add product to basket enter it's NUMBER or NAME!!!)
                -------------------------------------------------------------------------------------------
                                 Dessert                                            Salty
                ----------------------------------------           ----------------------------------------
                Cookies                                            Sandwiches
                ----------------------------------------           ----------------------------------------
                1. Chocolate Cookie             - 70 TL            11. Smoked Chicken Sandwich     - 120 TL
                2. Christmas Cookie             - 70 TL            12. Ham and Cheese Sandwich     - 150 TL
                3. Almond Cookie                - 70 TL            13. Vegetable Sandwich          - 80 TL
                ----------------------------------------           14. Grilled Meat Sandwich       - 150 TL
                Cakes                                              15. Egged Sausage Sandwich      - 120 TL
                ----------------------------------------           ----------------------------------------
                4. Chocolate Layer Cake         - 100 TL           Buns
                5. Red-Velvet Cake              - 100 TL           ----------------------------------------
                6. Strawberry Cake              - 100 TL           16. Cheese Borek                - 70 TL
                7. Cheesecake                   - 100 TL           17. Meat Borek                  - 100 TL
                ----------------------------------------           18. Potato Borek                - 70 TL
                Brownies
                ----------------------------------------
                8. Espresso Brownie              - 80 TL
                9. Triple Chocolate              - 80 TL
                10.Frosted Brownie               - 80 TL
                -------------------------------------------------------------------------------------------
                
                
                """;

    String welcome = """
                     Welcome to BET cafe!  (type section NUMBER or NAME!!!)
                ------------------------------------------------------------
                1. Beverage          Section
                2. Food              Section
                3. Books             Section   
                ------------------------------------------------------------
                
                """;

    String beveragesMenu = """
             Welcome to Beverage Section!   (to add product to basket enter it's NUMBER or NAME!!!)
                -------------------------------------------------------------------------------------------
                                 Hot                                                 Cold
                ----------------------------------------           ----------------------------------------
                Coffees                                            Iced Coffees
                ----------------------------------------           ----------------------------------------
                1. Americano                    - 105 TL           14. Iced Latte                  - 130 TL
                2. Espresso                     - 75 TL            15. Iced Mocha                  - 140 TL
                3. Turkish Coffee               - 90 TL            16. Iced Americano              - 120 TL
                4. Latte                         - 135 TL          17. Caramel Frappuccino         - 160 TL
                5. Cappuccino                    - 120 TL          18. Vanilla Iced Coffee         - 135 TL
                6. Mocha                         - 150 TL           ----------------------------------------
                7. Macchiato                     - 110 TL           Iced Teas
                8. Flat White                    - 140 TL           ----------------------------------------
                ----------------------------------------           19. Lemon Iced Tea              - 80 TL
                Teas                                               20. Peach Iced Tea              - 85 TL
                ----------------------------------------           21. Mint Iced Tea               - 90 TL
                9.  Earl Grey                     - 50 TL          22. Berry Iced Tea              - 95 TL
                10. Green Tea                    - 45 TL           23. Hibiscus Iced Tea           - 100 TL
                11. Chamomile Tea                - 55 TL           ----------------------------------------
                12. Peppermint Tea               - 50 TL           Smoothies
                13. Jasmine Tea                  - 60 TL           ----------------------------------------
                ----------------------------------------           24. Strawberry Smoothie         - 120 TL
                                                                   25. Mango Smoothie              - 130 TL
                                                                   26. Blueberry Smoothie          - 125 TL
                                                                   27. Banana Smoothie             - 110 TL
                                                                   28. Green Smoothie              - 135 TL
           
                -------------------------------------------------------------------------------------------
                """;



    String beveragesMenuName = " BeveragesMenu.txt";
    String welcomeFileName = "WelcomeFile.txt";
    String menuFileName = "CafeMenu.txt";
    String booksFileName = "BooksSection.txt";



}
