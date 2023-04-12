package rpg;

import java.util.Random;
public class Bobcat {
    private String name;

    public Bobcat(String name) {
        this.name = name;
    }

    public void makeNoise() {
        String quote = Quote.randomQuote();
        System.out.println(this.name + " says: " + quote);
    }
}
class TestBobcat {
    public static void main(String[] args) {
        Bobcat bobcat = new Bobcat("Lynx rufus");
        bobcat.makeNoise();
    }
}

class Quote {
    private static final String[] QUOTES = {
            "The greatest glory in living lies not in never falling, but in rising every time we fall. -Nelson Mandela",
            "The way to get started is to quit talking and begin doing. -Walt Disney",
            "Your time is limited, don't waste it living someone else's life. -Steve Jobs",
            "If life were predictable it would cease to be life, and be without flavor. -Eleanor Roosevelt"
    };

    public static String randomQuote() {
        Random random = new Random();
        int index = random.nextInt(QUOTES.length);
        return QUOTES[index];
    }
}


