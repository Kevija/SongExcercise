//1. Song class
  //create  a class Song
  //
  //The class constructor needs to have three additional 3 parameters
  //
  //title defaults to empty string
  //
  //author defaults to empty string
  //
  //lyrics by default empty Seq of strings
  //
  //inside constructor method:
  //
  // print on the screen "New Song made" - (try also printing here author and title!)
  //
  //Minimum:
  //
  //Write a method sing that prints the song line by line on the screen, first printing the author and title, if any.
  //
  //Write a method yell that prints the song in capital letters line by line on the screen, first printing the author and title, if any.
  //you can write private helper methods if you think code is too similar..

  //Bonus: create an additional parameter maxLines that prints only a certain number of lines for both sing and yell. Better do with some default value e.g. -1, at which all rows are then printed.
  //
  //Create multiple songs with lyrics
  //
  //Example:
  //
  //
  //ziemelmeita = Song("Ziemeļmeita", "Jumprava", Array("Gāju meklēt ziemeļmeitu","Garu, tālu ceļu veicu"))
  //
  //ziemelmeita.sing(1)
  //
  // Outputs:
  //
  //Ziemeļmeita - Jumprava
  //
  //Gāju meklēt ziemeļmeitu //just one line since I specified sing(1)
  //ziemelmeita.sing() //would print all lyrics

  //
  //
  //2. Rap class
  //For those feeling comfortable with class syntax, create a Rap class that inherits from Song
  //
  // add a new method breakIt with two default parameters max_lines=-1 and drop equal to "yeah",
  // this breakIt which is similar to sing, but adds a drop after each word .
  //
  //Example:
  //
  //
  //
  //zrap = Rap("Ziemeļmeita", "Jumprava", Array("Gāju meklēt ziemeļmeitu"," Garu, tālu ceļu veicu"))
  //
  //
  //
  //zrap.breakIt(1, "yah")
  //
  //Ziemeļmeita - Jumprava
  //
  //Gāju YAH meklēt YAH ziemeļmeitu YAH

  class Song(title: String = "", author: String= "", lyrics:Seq[String]) {
    println(s" Enjoy - $author -  song: $title!")

    def sing(): Unit = {
      println(s"$author - $title")
      println(lyrics.mkString(","))
    }
  }

  object SongExercise extends App {
    println("New Song made!")
    val lambada = new Song("Lambada",
      "Kaoma",
      Seq("Chorando se foi quem um dia só me fez chorar",
        "Chorando se foi quem um dia só me fez chorar",
        "Chorando estara ao lembrar de um amor",
        "Que um dia não soube cuidar",
        "Chorando estará ao lembrar de um amor",
        "Que um dia não soube cuidar",
        "A recordação vai estar com ele aonde for",
        "A recordação vai estar pra sempre aonde for"))

    val jingleBells = new Song("Jingle Bells",
      "James Pierpont",
      Array("Jingle bells, jingle bells",
        "Jingle all the way",
        "Oh what fun it is to ride",
        "In a one-horse open sleigh, hey!"))

    val journey = new Song("Don't Stop Believin'", "Journey",
      Seq("Just a small town girl",
        "Livin' in a lonely world",
        "She took the midnight train goin' anywhere",
        "Just a city boy",
        "Born and raised in south Detroit",
        "He took the midnight train goin' anywhere", "..."))


    jingleBells.sing()

    lambada.sing()

    journey.sing()


}

