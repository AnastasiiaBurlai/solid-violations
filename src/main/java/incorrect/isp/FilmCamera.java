package incorrect.isp;

//film camera can't record videos
public class FilmCamera implements HasCamera {
    @Override
    public void takePicture() {
        System.out.println("I am a film camera and I can take a picture");
    }

    @Override
    public void recordVideo() {
        throw new UnsupportedOperationException("I am a film camera and I can't record videos");
    }
}
