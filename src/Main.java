public class Main {
    public static void main(String[] args) {
        Hogwarts harry = new Griffindor("Гарри Поттер", 65, 50, 85, 95, 95);
        Hogwarts ron = new Griffindor("Рон Уизли", 35, 40, 75, 85, 95);
        Hogwarts germiona = new Griffindor("Гермиона Грейнджер", 75, 85, 55, 95, 95);
        Hogwarts draco = new Slytherin("Драко Малфой", 60, 50, 95, 50, 100, 35, 100);
        Hogwarts grahem = new Slytherin("Грэхэм Монтегю", 40, 60, 55, 75, 50, 65, 20);
        Hogwarts greg = new Slytherin("Грегори Гойл", 20, 30, 25, 55, 30, 35, 30);
        Hogwarts zaharia = new Pufflepuff("Захария Смит", 40, 50, 50, 75, 80);
        Hogwarts sedrig = new Pufflepuff("Седрик Диггори", 70, 75, 85, 75, 95);
        Hogwarts jastin = new Pufflepuff("Захария Смит", 35, 45, 55, 45, 40);
        Hogwarts zhou = new Ravenclaw("Джоу Чанг", 65, 65, 65, 60, 95, 95);
        Hogwarts padma = new Ravenclaw("Падма Патил", 45, 55, 75, 80, 95, 95);
        Hogwarts markus = new Ravenclaw("Маркус Белби", 85, 85, 85, 95, 95, 55);

        System.out.println(harry.calculateSpecificScore());
        System.out.println(harry.calculateGeneralScore());
        System.out.println(harry);
        harry.compare(germiona);
        harry.compare(draco);
    }
}