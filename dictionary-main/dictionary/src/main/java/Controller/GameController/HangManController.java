package Controller.GameController;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HangManController extends GameController<String> {

    private final List<String> questDatabase;
    private String answer;

    public HangManController() {
        questDatabase = new ArrayList<String>();
        try {
            File database = new File("../Config/Wordle.txt");
            Scanner scanner = new Scanner(database);
            while (scanner.hasNextLine()) {
                questDatabase.add(scanner.nextLine());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void setQuest() {

    }

    @Override
    public String getQuest() {
        return "";
    }

    @Override
    public String processQuest(String input) {
        return "";
    }
}
