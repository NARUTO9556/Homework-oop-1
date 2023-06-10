public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Слизерин{" +
                "хитрость = " + cunning +
                ", решительность = " + determination +
                ", амбиции = " + ambition +
                ", находчивость = " + resourcefulness +
                ", жажда власти = " + lustForPower +
                '}' + " " + super.toString();
    }

    @Override
    int calculateSpecificScore() {
        return this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
    }
    @Override
    void printCompareOfStudents(Hogwarts best, Hogwarts worst) {
        System.out.println(String.format("%s лучший Слизеринец, чем %s",best.getName(),worst.getName()));
    }
}
