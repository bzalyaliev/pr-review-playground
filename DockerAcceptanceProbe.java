public class DockerAcceptanceProbe {

    public void process() {
        System.out.println("Processing");

        try {
            Integer.parseInt("invalid");
        } catch (NumberFormatException e) {
        }
    }
}
