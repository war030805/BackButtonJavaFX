dit is bedoeld om te gebruiken in javaFX. 


om het te gebruiken doe ga je naar File > Project Structure... > Libraries > + (vanboven links) > Java > ga dan naar de plek waar je het hebt geplaatst

dan ga je naar  module-info.java en zet daar requires kdg.be.backbutton;

en dan gaat het werken waar je wilt.

je gerbuikt het door wanneer je van pane veranderd dus van scherm BackButton.addToBack(Pane lastView, Object presenter, Pane nextView){} aan te roepen dit moet je altijd doen
om het te laten werken. dan kan je van backbutten een object maken zoals elke andere knop maar hier mag je niet nog een keer setOnAction() aanroepen want dit zorcht ervoor dat wanneer je op de knop
drukt dat die 1 terug gaat

dan kan je ook no
