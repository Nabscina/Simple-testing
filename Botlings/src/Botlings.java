
public class Botlings {

    private String botName;
    private int botAge;
    private String botPhrase;
    private final boolean passesTuring;

    public Botlings(String name, int age, String phrase) {

        this.botName = name;
        this.botAge = age;
        this.botPhrase = phrase;

        passesTuring = true;
    }

    public void grow(int i) {

        if (this.botAge + i <= 2499) {
            this.botAge += i;
        }
    }

    public void setAge(int age) {

        if (age >= 0 && age <= 2499) {
            this.botAge = age;
        }
    }

    public void setName(String name) {

        if (name.length() > 0) {
            if (name.length() < 20) {
                this.botName = name;
            }
        }
    }

    @Override
    public String toString() {

        if (this.botAge == 1) {
            return this.botName + ", age: " + this.botAge + " month, \"" + this.botPhrase + "\"";
        }
        return this.botName + ", age: " + this.botAge + " months, \"" + this.botPhrase + "\"";
    }

    public String name() {

        return this.botName;
    }

    public int age() {

        return this.botAge;
    }

    public String phrase() {

        return this.botPhrase;
    }

    public String passOrNot() {

        if (this.passesTuring) {
            return "The bot passes the Turing test.";
        } else {
            return "The bot does not pass the Turing test.";
        }
    }

}
