import java.util.Random;

public class ServerNameGenerator {

        public static void main(String[] args) {
            String[] adjectives = {"happy", "silly", "blue", "shiny", "bouncy", "fluffy", "spicy", "tiny", "jolly", "witty"};
            String[] nouns = {"cat", "house", "dog", "sun", "book", "cupcake", "flower", "ocean", "rain", "tree"};

            String adjective = getRandomElement(adjectives);
            String noun = getRandomElement(nouns);

            String name = hyphenate(adjective, noun);
            System.out.println(name);
        }

        public static String getRandomElement(String[] array) {
            Random random = new Random();
            int index = random.nextInt(array.length);
            return array[index];
        }

        public static String hyphenate(String adjective, String noun) {
            return adjective + "-" + noun;
        }
    }
