package fantasyWorldGenerators

import kotlin.random.Random

class FantasyNameGenerator {
    private var fullName: String? = null

    fun printMenu() {
        print("(1) Germanic Name")
        print("(2) Vile and Crude")
    }

    fun getNameMedievalGermanic(): String? {
        return getNameMedievalGermanic(Random.nextBoolean())
    }

    fun getNameMedievalGermanic(nameIsMale: Boolean): String? {

        if(nameIsMale) //Male Firstname
        {
            //TODO: Make this into a file read. MedievalGermanMale.txt
            val nameList: Array<String> = arrayOf("Friedrich","Georg", "Heinrich","Hermann","Johannes","Konrad","Michael",
                "Nikolaus","Peter","Ulrich","Adam","Albert","Albrecht","Andreas","Arnold","Balthasar","Bartusch","Berchtold",
                "Bernhard","Bertold","Bertolf","Bruno","Burgolt","Caspar","Christoff","Clement","Conrad","David","Dietrich",
                "Eberhard","Francze","Frederich","Friderich","Friedrich","Fritsche","Gabriel","Gebehart","Georg","Gerhard",
                "Gisko","Gottfrid","Gregor","Gunczel","Gunther","Hannes","Hans","Hansel","Heinczel","Heinke","Heinrich",
                "Helwig","Hempel","Hentschel","Herbord","Hermann","Hertwig","Jacob","Jekel","Johannes","Jorge","Jost","Jurgen",
                "Konrad","Lamprecht","Lorencz","Ludwig","Luther","Luthold","Lutke","Manfred","Marcus","Martin","Mathis",
                "Michael","Nikolaus","Örtel","Ortolf","Oswald","Otto","Paul","Peczold","Peter","Reinfrid","Reinhard","Rudel",
                "Rudger","Rudolf","Ruprecht","Sander","Siegfrid","Sigmund","Steffan","Symon","Thomas","Till","Tristram",
                "Ulrich","Volkmar","Walther","Wenczel","Wernher","Winand","Wiprecht","Wolf","Wolfgang","Wolfhart","Wolfram")

            fullName = nameList[Random.nextInt(0, nameList.size)]

        } else //Female firstname
        {
            //TODO: Make this into a file read. MedievalGermanFemale.txt
            val nameList: Array<String> = arrayOf("Adelheid", "Agnes", "Anna", "Barbara", "Christine", "Elisabeth", "Gerhaus",
                "Katharina", "Kunigunde", "Margarete", "Adelheid", "Agathe", "Agnes", "Alke", "Anna", "Apollonia", "Aythe",
                "Barbara", "Beate", "Benedicta", "Bertha", "Bertrude", "Cecilia", "Christine", "Clare", "Czylle", "Demut",
                "Dorothye", "Elisabeth", "Elze", "Enede", "Engeltrude", "Enneleyn", "Ermegard", "Eufemia", "Femeke", "Gerhaus",
                "Gerke", "Gertrude", "Gerusch", "Grite", "Hedwig", "Helena", "Herburg", "Herlinde", "Hezke", "Hilde",
                "Hildeberg", "Hildegund", "Hilusch", "Ilse", "Irmel", "Irmeltrud", "Jutte", "Katharina", "Katusch",
                "Kethe", "Kirstyn", "Kunigunde", "Kunne", "Lena", "Libeste", "Libusch", "Liphilt", "Lucie", "Lusche",
                "Magdalena", "Maneth", "Margarete", "Marie", "Marusch", "Mechtilde", "Mecze", "Merlyn", "Mute", "Neleke",
                "Osanna", "Osterhild", "Otilge", "Ottilie", "Phye", "Sabine", "Salmey", "Sanne", "Sophie", "Ursula", "Ute",
                "Veronica", "Ysentrude")

            fullName = nameList[Random.nextInt(0, nameList.size)]
        }

        fullName += " " //Space between names

        //TODO: Make this into a file read. GermanFamilyName.txt
        val nameList: Array<String> = arrayOf("Bauer", "Becker", "Fischer", "Hoffmann", "Klein", "Koch", "Meyer", "Muller", "Neumann", "Richter",
            "Schafer", "Schmidt", "Schmitz", "Schneider", "Schröder", "Schulz", "Schwarz", "Wagner", "Weber", "Wolf",
            "Abels", "Achsen", "Adler", "Affler", "Alsberg", "Altaner", "Altmaier", "Altmayer", "Altringer", "Amann",
            "Arendt", "Arenz", "Arndt", "Arweiler", "Aschenbach", "Axmann", "Baader", "Bach", "Bacht", "Backendorf", "Backer",
            "Baecker", "Barth", "Barthelmes", "Bartzen", "Barz", "Basler", "Bauer", "Bauler", "Baumer", "Baur", "Bayerlein",
            "Bechold", "Bechstein", "Beck", "Becker", "Beckmann", "Behm", "Bekker", "Berg", "Berger", "Bergmann", "Bergmuller",
            "Bernstein", "Berweiler", "Bierhoff", "Billig", "Bischoff", "Bloch", "Blum", "Bock", "Bode", "Böhmer", "Bollendorf",
            "Bonner", "Borens", "Bothe", "Bott", "Braasch", "Brackmann", "Brand", "Braun", "Braune", "Brecht", "Breiling", "Breit",
            "Breitung", "Bremer", "Brendel", "Breuer", "Brinkmann", "Bruck", "Bruckner", "Brunnet", "Bund", "Bur", "Busch", "Buse",
            "Casel", "Caspari", "Clahsen", "Clar", "Corssen", "Creuzfeldt", "Daffner", "Dalberg", "Damaske", "Daum", "Dehmel",
            "Deitert", "Denhart", "Denner", "Denzer", "Derringer", "Dewald", "Diederich", "Diels", "Diendorf", "Dietrich", "Dietz",
            "Dittmar", "Dixen", "Döbert", "Donner", "Dorfmuller", "Dorn", "Dreschler", "Drexel", "Drossen", "Duhr", "Dunker",
            "Duren", "Ecker", "Eckerman", "Ehle", "Ehrhard", "Ehrle", "Eichendorf", "Eisenbarth", "Eisner", "Elsen", "Emmerich",
            "Engler", "Enke", "Erhardt", "Ermert", "Ernst", "Ertl", "Esch", "Essig", "Faber", "Fass", "Faust", "Feiler", "Feiten",
            "Feld", "Felder", "Ferber", "Ferger", "Feynman", "Fisch", "Fischer", "Flicke", "Fogel", "Föhr", "Folz", "Franke",
            "Frasch", "Frechen", "Freund", "Freytag", "Friedel", "Friedlander", "Friedmann", "Friedrich", "Fritzen", "Froebel",
            "Frölich", "Fuchs", "Furst", "Furtwangler", "Gabges", "Gaebler", "Ganz", "Garlesch", "Gartner", "Gebert", "Gehrig",
            "Geisen", "Gellert", "Gelzer", "Gergen", "Gerhardt", "Gerike", "Geyler", "Glaber", "Göbert", "Gödert", "Goettinger",
            "Göhlen", "Görgen", "Graff", "Graus", "Grell", "Griesbach", "Gross", "Grossman", "Groth", "Grubel", "Gruber",
            "Grunen", "Grunwald", "Gruse", "Grutzmuller", "Haase", "Haber", "Haessler", "Haffner", "Hafner", "Hagen", "Hager",
            "Hahn", "Halder", "Hammerich", "Hardt", "Hartmann", "Hasselberg", "Haubert", "Hauch", "Haupt", "Hauptmann", "Hauser",
            "Hechler", "Hecht", "Heimer", "Heimpel", "Heineman", "Heinen", "Heinkel", "Heinrich", "Heinz", "Helbach", "Helfen",
            "Hellner", "Hempel", "Henning", "Herber", "Herbert", "Herget", "Herold", "Herrmann", "Herzl", "Herzog", "Heusler",
            "Hoch", "Hockler", "Hoen", "Hoff", "Hoffman", "Holtzmann", "Horsch", "Huber", "Hubner", "Huschens", "Hutter",
            "Immelmann", "Irmisch", "Irsch", "Jager", "Jakobi", "Jank", "Jegen", "Juncker", "Jung", "Jungelen", "Jungmann",
            "Kaestel", "Kahl", "Kahn", "Kaiser", "Kamp", "Kanzler", "Keiser", "Keitel", "Keller", "Kemner", "Kessler", "Kiefer",
            "Kien", "Kierkegaard", "Kinkel", "Kirchhoff", "Kirsch", "Klas", "Klassen", "Klaus", "Klein", "Kleine",
            "Kleinert", "Klemke", "Klotten", "Kneip", "Knoll", "Koch", "Koehler", "Koenig", "Köhler", "Kohn", "Kolb", "Kollman",
            "Kolz", "König", "Koppe", "Kordel", "Kostner", "Kraatz", "Krabbe", "Kraemer", "Kramer", "Kranz", "Krause",
            "Krautheimer", "Krebs", "Kreischen", "Krenckel", "Kreutzer", "Krieger", "Krohn", "Kröschel", "Krueger", "Kruger",
            "Kruse", "Kuhn", "Kuntz", "Lagemann", "Lahr", "Lamprecht", "Lang", "Lange", "Langer", "Lauer", "Lector", "Lehman",
            "Leiber", "Leitner", "Lenz", "Lesker", "Licht", "Liebermann", "Linn", "Lonsdorfer", "Lörscher", "Löwe",
            "Lustgarten", "Lutz", "Maas", "Mader", "Mahler", "Maier", "Mann", "Mathi", "Mayer", "Mehling", "Meier", "Meinecke",
            "Meisner", "Mendel", "Mendelsohn", "Mergen", "Metterling", "Metzler", "Meyer", "Millen", "Miller", "Moeller", "Mohl",
            "Möhler", "Mohr", "Mohrbach", "Molder", "Möller", "Molz", "Mönch", "Morbach", "Mosbauer", "Moseler", "Mueller",
            "Mulbers", "Muller", "Muth", "Muthig", "Nagel", "Nauert", "Neihs", "Nernst", "Neuerburg", "Neukirch", "Neumann",
            "Niemann", "Nimtz", "Nitze", "Noever", "Nuyen", "Oberkirch", "Obermeyer", "Oligschlager", "Orth", "Oster", "Ostermaier",
            "Ostwald", "Otten", "Otto", "Palzer", "Papst", "Pauli", "Pelzer", "Peters", "Pfaff", "Pfeiffer", "Pfnör",
            "Philipps", "Picht", "Pinger", "Pitsch", "Pletz", "Plucker", "Pohl", "Porten", "Prandtl", "Preis", "Preuss",
            "Prinz", "Probst", "Quirin", "Radermacher", "Ratte", "Rau", "Reber", "Regers", "Reh", "Rehberg", "Reicher", "Reichert",
            "Reinhard", "Reinhardt", "Reinke", "Reiss", "Reiter", "Rettweiler", "Reuter", "Richter", "Richtmann", "Riedel",
            "Riefenstahl", "Rieger", "Ritter", "Röder", "Rohr", "Rosen", "Rosenberg", "Rosenkranz", "Rosskopf", "Rössler", "Roth",
            "Rupp", "Rutzel", "Sabel", "Saebel", "Sander", "Sauer", "Schaar", "Schaefer", "Schafer", "Schawe", "Scheer", "Schenk",
            "Schiff", "Schiller", "Schilling", "Schimmel", "Schlöder", "Schmid", "Schmidt", "Schmitt", "Schmitz",
            "Schneider", "Schnell", "Scholl", "Scholz", "Schönberger", "Schramm", "Schreiber", "Schröder", "Schroeder", "Schubert",
            "Schuhmacher", "Schuler", "Schultz", "Schumann", "Schuster", "Schutz", "Schwartz", "Schwartzer", "Schwarz",
            "Schwarzkopf", "Schweissthal", "Seher", "Seidel", "Siebert", "Siehr", "Sievert", "Singer", "Smidt", "Smitt",
            "Sonnenberg", "Sonntag", "Spaar", "Speicher", "Sperl", "Sprecher", "Springer", "Stahlberg", "Steffens", "Stein",
            "Steinbach", "Steinberger", "Stock", "Stoffel", "Stoltz", "Strauss", "Sturmer", "Tauscher", "Teichmann", "Teischer",
            "Ternes", "Teschendorff", "Teuer", "Thaner", "Theile", "Theissen", "Theobald", "Thiel", "Thielen", "Thiesen", "Thimmel",
            "Thomaser", "Thoms", "Thönes", "Thörnich", "Thull", "Tiegelkamp", "Tillmann", "Tischler", "Tömmel", "Törnich",
            "Traultmann", "Trautvetter", "Trenz", "Trierweiler", "Triesch", "Trumper", "Tummel", "Uhlirz", "Uiberall",
            "Umbach", "Unruh", "Velgart", "Vogt", "Vollner", "Wagener", "Wagner", "Wahner", "Wald", "Walder", "Walker", "Walter",
            "Waltermann", "Walther", "Walthier", "Walz", "Warg", "Warnau", "Waschbusch", "Wasser", "Wassermann", "Wassmuth", "Weber",
            "Wehner", "Weides", "Weiland", "Weiler", "Weimer", "Weins", "Weirich", "Weishoff", "Weiss", "Welter", "Werner",
            "Weyhofen", "Wiemers", "Wiens", "Willems", "Winter", "Winterich", "Wirschim", "Wirth", "Wirtz", "Wissmann", "Witte",
            "Wittek", "Wohler", "Wolf", "Wolff", "Wollenhaupt", "Wurtz", "Zahn", "Zeigen", "Zeiss", "Zenner", "Ziess", "Zimmer",
            "Zimmerman", "Zock", "Zunker")
        fullName += nameList[Random.nextInt(0, nameList.size)]
        return fullName
    }

    /**Generates a vile and crude name based on a random size value. 0 is for small creatures EX: Goblins,
     * 1 is for medium creatures EX: Orcs, 2 is for large creatures EX Ogres, trolls. */
    fun getNameVileAndCruel(): String?
    {
        return getNameVileAndCruel(Random.nextInt(0,2))
    }

    /**Generates a vile and crude name based on the given size value. 0 is for small creatures EX: Goblins,
     * 1 is for medium creatures EX: Orcs, 2 is for large creatures EX Ogres, trolls. */
    fun getNameVileAndCruel(creatureSize: Int): String?
    {
        val nameList: Array<String?>
        when(creatureSize){
            0 -> //TODO: Make this into a file read. VileAndCrudeSmall.txt
                nameList = arrayOf("ach", "adz", "ak", "ark", "az", "balg", "bilg", "blid", "blig", "blok", "blot", "bolg", "bot", "bug", "burk", "dokh",
                "drik", "driz", "duf", "flug", "ga", "gad", "gag", "gah", "gak", "gar", "gat", "gaz", "ghag", "ghak", "git", "glag",
                "glak", "glat", "glig", "gliz", "glok", "gnat", "gog", "grak", "grat", "guk", "hig", "irk", "kak", "khad", "krig",
                "lag", "lak", "lig", "likk", "loz", "luk", "mak", "maz", "miz", "mub", "nad", "nag", "naz", "nig", "nikk", "nogg", "nok",
                "nukk", "rag", "rak", "rat", "rok", "shrig", "shuk", "skrag", "skug", "slai", "slig", "slog", "sna", "snag", "snark",
                "snat", "snig", "snik", "snit", "sog", "spik", "stogg", "tog", "urf", "vark", "yad", "yagg", "yak", "yark", "yarp",
                "yig", "yip", "zat", "zib", "zit", "ziz")

            1 -> //TODO: Make this into a file read. VileAndCrudemED.txt
                nameList = arrayOf("ag", "aug", "bad", "bag", "bakh", "bash", "baz", "blag", "brag", "brog", "bruz",
                    "dag", "dakk", "darg", "dob", "dog", "drab", "dug", "dur", "gash", "ghaz", "glakh", "glaz",
                    "glob", "glol", "gluf", "glur", "gnarl", "gnash", "gnub", "gob", "gokh", "gol", "golk", "gor",
                    "grakh", "grash", "grath", "graz", "grot", "grub", "grud", "gud", "gut", "hag", "hakk", "hrat",
                    "hrog", "hrug", "khag", "khar", "krag", "krud", "lakh", "lash", "lob", "lub", "lud", "luf", "luk",
                    "molk", "muk", "muz", "nar", "ogg", "olg", "rag", "rash", "rogg", "rorg", "rot", "rud", "ruft",
                    "rug", "rut", "shad", "shag", "shak", "shaz", "shog", "skar", "skulg", "slur", "snar", "snorl",
                    "snub", "snurr", "sod", "stulg", "thak", "trog", "ug", "umsh", "ung", "uth", "yakh", "yash", "yob",
                    "zahk", "zog")
            else -> //TODO: Make this into a file read. VileAndCrudeLarge.txt
                nameList = arrayOf("argh", "barsh", "bog", "burz", "dof", "drok", "drub", "drug", "dub", "dug",
                    "dul", "dursh", "dush", "duz", "faug", "fug", "ghakh", "ghar", "ghash", "ghol", "ghor", "ghukk",
                    "ghul", "glub", "glud", "glug", "gluz", "gom", "grad", "grash", "grob", "grogg", "grok", "grol",
                    "gru", "gruf", "gruk", "grul", "grum", "grumf", "grut", "gruz", "guhl", "gulv", "hai", "hrung",
                    "hur", "hurg", "kai", "klob", "krod", "kug", "kulk", "kur", "lorg", "lug", "lukh", "lum", "lurz",
                    "lush", "luz", "makh", "maug", "molg", "mud", "mug", "mul", "murk", "muzd", "nakh", "narg", "obb",
                    "rolb", "rukh", "ruz", "sharg", "shruf", "shud", "shug", "shur", "shuz", "slub", "slud", "slug",
                    "snad", "snog", "thrag", "thulk", "thurk", "trug", "ulg", "ur", "urd", "urgh", "urkh", "uz", "yug",
                    "yur", "zud", "zug")
        }

        fullName = nameList[Random.nextInt(0, nameList.size)]
        fullName += nameList[Random.nextInt(0, nameList.size)]
        return fullName
    }

    fun getNameDoughty(): String?
    {
        return getNameDoughty(Random.nextBoolean())
    }

    fun getNameDoughty(isMale: Boolean): String?
    {
        val nameList: Array<Array<String?>> = arrayOf(
            arrayOf("bal","bord","born","brim","brod","brokk","brom","bru","bur","burl","da","dal","dolg","dor","dorm",
                "dral","drim","drom","dur","durm", "durn","from","fror","fuld","fund","gim","glo","gond","gord","gorm",
                "grad","grim","grod","grom","guld","gund","gur","hord","horn","hra", "na","nor","nord","orm","skand",
                "skond","storn","strom","stur","sturl","sund","thor","thorn","thra","thro","throl","thror","thru",
                "thrur","thund"),
            arrayOf("bor","din","in","in","in","ir","li","li","lin","nir","or","ri","ri","rin","rok","ror","rur","vi","vir","vor"),
            arrayOf("bis","da","dis","dis","dis","dis","ga","hild","is","is","lif","lind","lis","na","nis","ris","rith","run","run","vis"))

        fullName = nameList[0][Random.nextInt(0,nameList[0].size)]

        fullName += if(isMale){
            nameList[1][Random.nextInt(0,nameList[1].size)]
        } else{
            nameList[2][Random.nextInt(0,nameList[2].size)]
        }

        return fullName
    }

    fun getNameHomely() :String?
    {
        return getNameHomely(Random.nextBoolean())
    }

    fun getNameHomely(isMale: Boolean) :String?
    {

        val nameList: Array<Array<String?>> = arrayOf(arrayOf("ad", "blanc", "falc", "mil", "adel", "boff", "ferd",
            "mung", "adr", "bomb", "frob", "od", "ail", "bram", "fulb", "oth", "alb", "bung", "gam", "sab", "alm",
            "droc", "hald", "sam", "amb", "drog", "ham", "seg", "band", "durl", "hasc", "serl", "bard", "emm", "hod",
            "tob", "ben", "erd", "hug", "wan", "biff", "ern", "iv", "wig", "bild", "ever", "mark", "wyd"),
            arrayOf("ald", "ard", "ert", "fast", "o", "o", "o", "o", "o", "old", "win", "wise"),
            arrayOf("a", "a", "a", "a", "a", "ia", "ia", "ice", "ily", "ina", "wina", "wisa"))

        fullName = nameList[0][Random.nextInt(0,nameList[0].size)]

        fullName += if(isMale){
            nameList[1][Random.nextInt(0,nameList[1].size)]
        } else{
            nameList[2][Random.nextInt(0,nameList[2].size)]
        }

        return fullName
    }

}

fun main(args: Array<String>){
    val fng: FantasyNameGenerator = FantasyNameGenerator()

    println("Medieval Germanic names")
    for (i in 0..10){
        println(fng.getNameMedievalGermanic())
    }

    println("\nVile and Crude - Small:")
    for (i in 0..10){
        println(fng.getNameVileAndCruel(0))
    }

    println("\nVile and Crude - Medium:")
    for (i in 0..10){
        println(fng.getNameVileAndCruel(1))
    }

    println("\nVile and Crude - Large:")
    for (i in 0..10){
        println(fng.getNameVileAndCruel(2))
    }

    println("\nDoughty - Dwarves: ")
    for (i in 0..10){
        println(fng.getNameDoughty())
    }

    println("\nHomely - Halflings: ")
    for (i in 0..10){
        println(fng.getNameHomely())
    }
}