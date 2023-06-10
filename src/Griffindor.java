public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Griffindor(String name, int powerOfMagic, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    @Override
    public String toString() {
        return "Гриффиндор{" +
                "Благородство = " + nobility +
                ", честь = " + honor +
                ", храбрость = " + courage +
                '}' + " " + super.toString();
    }

    @Override
    int calculateSpecificScore() {
        return this.nobility + this.honor + this.courage;

    }

    @Override
    void printCompareOfStudents(Hogwarts best, Hogwarts worst) {
        System.out.println(String.format("%s лучший Гриффиндорец, чем %s",best.getName(),worst.getName()));
    }
}
