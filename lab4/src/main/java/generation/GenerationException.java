package generation;

public class GenerationException extends RuntimeException {
    public GenerationException(String message) {
        super("Generation error: " + message);
    }
}