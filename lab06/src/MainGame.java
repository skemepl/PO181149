import java.util.Arrays;
import java.util.Objects;

class ComputerGame {
    private String title;
    private String producer;
    private double[] ratings;

    public ComputerGame(String title, String producer, double[] ratings) {
        this.title = title;
        this.producer = producer;
        this.ratings = ratings;
    }

    public void addRating(double rating) {
        double[] newRatings = Arrays.copyOf(ratings, ratings.length + 1);
        newRatings[ratings.length] = rating;
        ratings = newRatings;
    }

    public void removeRating(int index) {
        if (index < 0 || index >= ratings.length) return;
        double[] newRatings = new double[ratings.length - 1];
        for (int i = 0, k = 0; i < ratings.length; i++) {
            if (i == index) continue;
            newRatings[k++] = ratings[i];
        }
        ratings = newRatings;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getProducer() { return producer; }
    public void setProducer(String producer) { this.producer = producer; }

    @Override
    public String toString() {
        return "Game: " + title + ", Producer: " + producer + ", Ratings: " + Arrays.toString(ratings);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerGame that = (ComputerGame) o;
        return Objects.equals(title, that.title) &&
                Objects.equals(producer, that.producer) &&
                Arrays.equals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(title, producer);
        result = 31 * result + Arrays.hashCode(ratings);
        return result;
    }
}

class RPGGame extends ComputerGame {
    private String gameWorld;

    public RPGGame(String title, String producer, double[] ratings, String gameWorld) {
        super(title, producer, ratings);
        this.gameWorld = gameWorld;
    }

    public String getGameWorld() { return gameWorld; }
    public void setGameWorld(String gameWorld) { this.gameWorld = gameWorld; }

    @Override
    public String toString() {
        return super.toString() + ", World: " + gameWorld;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        RPGGame rpgGame = (RPGGame) o;
        return Objects.equals(gameWorld, rpgGame.gameWorld);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), gameWorld);
    }
}

public class MainGame {
    public static void main(String[] args) {
        double[] initialRatings = {4.5, 3.0};
        RPGGame rpg = new RPGGame("Wiedźmin", "CDPR", initialRatings, "Fantasy");

        rpg.addRating(5.0);
        System.out.println(rpg);
        rpg.removeRating(1);
        System.out.println(rpg);
    }
}