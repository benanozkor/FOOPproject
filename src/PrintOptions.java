public interface PrintOptions {

    String booksContent = """
                              Welcome to Books section!
                --------------------------------------------------
                1. it       - $3.00
                2. titanic     - $3.50
                3. flowers for el          - $4.00
                4. Drakula            - $2.50
                5. Geometry       - $5.00
                6. fuck you     - $4.50
                -------------------------------------------------
                
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
                1. Coffee          Section
                2. Food            Section
                3. Books           Section   
                ------------------------------------------------------------
                
                """;



    String welcomeFileName = "WelcomeFile.txt";
    String menuFileName = "CafeMenu.txt";
    String booksFileName = "BooksSection.txt";



}
