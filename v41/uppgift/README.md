##Skapa ett schackbräde

1. Börja med den minsta beståndsdelen av ett bräde, nämligen en ruta.
    * Skapa en class som får heta Square och som ska ärva Group.
    * Skapa en statisk variabel som ska innehålla storleken på alla rutor.
    * Skapa en konstruktor som tar in en Color och skapar en ny Rectangle med angiven färg och lägger till den i Gruppen.

2. Nu till själva brädet.
    * Skapa en class ChessBoard som också ska ärva Group.
    * Skapa en konstruktor och i den skapa en for-loop i en for-loop som loopar 8*8 gånger. 
    * Skapa nu 64 Squares i rätt färg och transelata dem till rätt position så att det blir ett fint schackbräde.
    
3. Skapa nu en Application som skapar ett ChessBoard och visar det på skärmen.

4. Ytterligare funktionallutet.
    * Gör så att man i ChessBoard kan anropa en metod som ger tillbaka en Square på en viss plats. ```getSquare(int x, int y)```
    * More to come
