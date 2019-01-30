## Laboration 2

Syftet med denna laboration är att öva på olika verktyg för polymorfism och återanvändning av kod: arv vs delegering, superklasser vs interfaces, och principer för subklasser. <br>
Tanken är att ni ska fortsätta på den lösning ni gjort i laboration 1. Ni ska lära er jobba med extensibilitet och polymorfism.<br>
<br>
Se till att noga läsa igenom instruktionerna och att följa de regler och krav som uppgifterna föreskriver. <br>
Börja med att kolla igenom hela beskrivningen och se vad som krävs för att få godkänt, samt med att ladda ner de filer som behövs.<br>
<br>
Koden ni skriver i denna labb kommer senare att användas i laboration 3.<br>
<br>
Ta fram er lösning från laboration 1 och fortsätta därifrån. Är ni inte klara med laboration 1 bör ni göra detta först.

### Uppgift A
* Skapa en representation av en Scania-lastbil med modellnamn Scania.<br>
  Ge den rimliga startvärden för relevanta fält. Lägg den i filen Scania.java i samma mapp.

* Scania ska införlivas i er arvs-hierarki från tidigare, men ha ytterligare funktionalitet: 
  * Den har ett flak som kan höjas och sänkas.
  * Införliva detta i er design så att vi kan hålla reda på vilken vinkel flaket har för närvarande, samt funktioner för att höja och sänka det.<br>
    Följande förhållanden ska gälla:<br>
    * Vinkeln på flaket kan inte vara lägre än 0 eller högre än 70.
    * Flaket kan enbart ha en annan vinkel än 0 om lastbilen står stilla.
    * Lägg allt i Scania.java och skriv Javadoc för klassen och metoderna.
