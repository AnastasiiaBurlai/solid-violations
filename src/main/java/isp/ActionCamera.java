package isp;

//action camera can't take pictures
public class ActionCamera implements HasCamera{
    @Override
    public void takePicture() {
        throw new UnsupportedOperationException("I am an action camera and I can't take pictures");
    }

    @Override
    public void recordVideo() {
        System.out.println("I am an action camera and I can record a video");
    }
}
