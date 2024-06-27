public interface MusicPlayer {
    default void playMusic() {
        System.out.println("Music Player calling...");
    }
}
