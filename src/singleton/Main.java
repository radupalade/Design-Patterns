package singleton;

public class Main {

    public static void main(String[] args) {
        //OnlineMusicStore store = new OnlineMusicStore();
        OnlineMusicStore musicStore = OnlineMusicStore.getInstance();
        musicStore.play();

        OnlineMusicStore anotherMusicStore = OnlineMusicStore.getInstance();
        anotherMusicStore.play();

        OnlineMusicStore.getInstance().play();

        OnlineMusicStore2.ANOTHER_INSTANCE.play(); //enumurile sunt singleton by default
        OnlineMusicStore2.INSTANCE.play(); //enumurile sunt singleton by default
    }
}
