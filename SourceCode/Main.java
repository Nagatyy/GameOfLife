import java.awt.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
                GameData data = null;
                try {
                    data = new GameData();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                GameView view = new GameView();
                GameController controller = new GameController(data, view);
            }

        });

    }
}
