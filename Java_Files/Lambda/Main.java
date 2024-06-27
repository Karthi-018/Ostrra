public class Main {
    public static void main(String args[]) {
        // lambda
        MusicPlayer musicPlayer = () -> System.out.println("Playing music from lambda Function");
        musicPlayer.playMusic();

        // MusicPlayer musicPlayer = new MusicPlayer() {
        //     void playMusic() {
        //         System.out.println("Playing music from lambda Function")
        //     }
        // }
    }
}
