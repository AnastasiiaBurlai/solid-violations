package incorrect.lsp;

import java.awt.*;
import java.io.IOException;
import java.net.URI;

//lets ruin LSP
//OnlineGame could not be launched same way as VideoGame
//and available for any platform
//It should be a separate abstraction
public class OnlineGame extends VideoGame {

    public OnlineGame(String name, String[] platforms, String developer, String publisher,
                      String[] genres, int minNumberOfPlayers, int maxNumberOfPlayers, URI host) {
        super(name, new String[] {"Any"}, developer, publisher, genres, minNumberOfPlayers, maxNumberOfPlayers);
        this.host = host;
    }

    private URI host;

    public URI getHost() {
        return host;
    }

    public void setHost(URI host) {
        this.host = host;
    }

    @Override
    public void setPlatforms(String[] platforms) {
        super.setPlatforms(new String[] {"Any"});
    }

    @Override
    public void play(){
        System.out.println(String.format("I am opening online game '%s' in a browser to play",
                getName()));
    }

    @Override
    public String toString() {
        return "OnlineGame{" +
                "host=" + host +
                "} " + super.toString();
    }
}
