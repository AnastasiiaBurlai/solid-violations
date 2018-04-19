package incorrect.isp;

//for smartphone it is ok - it can do both
public class SmartPhone implements HasCamera {
    @Override
    public void takePicture() {
        System.out.println("I am a smartphone and I can take a picture");
    }

    @Override
    public void recordVideo() {
        System.out.println("I am a smartphone and I can record a video");
    }
}
