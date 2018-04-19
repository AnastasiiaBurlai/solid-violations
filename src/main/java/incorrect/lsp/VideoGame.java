package incorrect.lsp;

import java.util.Arrays;

public class VideoGame {

    private String name;
    private String[] platforms;
    private String developer;
    private String publisher;
    private String[] genres;
    private int minNumberOfPlayers;
    private int maxNumberOfPlayers;

    private VideoGame(){}

    public VideoGame(String name, String[] platforms, String developer, String publisher,
                     String[] genres, int minNumberOfPlayers, int maxNumberOfPlayers) {
        this.name = name;
        this.platforms = platforms;
        this.developer = developer;
        this.publisher = publisher;
        this.genres = genres;
        this.minNumberOfPlayers = minNumberOfPlayers;
        this.maxNumberOfPlayers = maxNumberOfPlayers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String[] platforms) {
        this.platforms = platforms;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    public int getMinNumberOfPlayers() {
        return minNumberOfPlayers;
    }

    public void setMinNumberOfPlayers(int minNumberOfPlayers) {
        this.minNumberOfPlayers = minNumberOfPlayers;
    }

    public int getMaxNumberOfPlayers() {
        return maxNumberOfPlayers;
    }

    public void setMaxNumberOfPlayers(int maxNumberOfPlayers) {
        this.maxNumberOfPlayers = maxNumberOfPlayers;
    }

    public void play(){
        System.out.println(String.format("I am launching '%s' game to play", name));
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "name='" + name + '\'' +
                ", platforms=" + Arrays.toString(platforms) +
                ", developer='" + developer + '\'' +
                ", publisher='" + publisher + '\'' +
                ", genres=" + Arrays.toString(genres) +
                ", minNumberOfPlayers=" + minNumberOfPlayers +
                ", maxNumberOfPlayers=" + maxNumberOfPlayers +
                '}';
    }
}
