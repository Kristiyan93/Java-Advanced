package Exercises.D_Teleponyy;

public class Smartphone implements Browsable, Callable {

    @Override
    public String browsing(String url) {
        if (url.matches(".*\\d+.*")) {
            return "Invalid URL!";
        }

        return String.format("Browsing: %s!", url);
    }

    @Override
    public String calling(String numbers) {
        if (!numbers.matches("\\d+")) {
            return "Invalid number!";
        }

        return String.format("Calling... %s", numbers);
    }
}
