package View.Menu.SimpleMenu;

import View.Console;

import java.util.ArrayList;
import java.util.List;

public class SimpleMenu {
    private List<MainSimple> itemList;
    public SimpleMenu(Console console) {
        itemList = new ArrayList<>();
        itemList.add(new GetToy(console));
        itemList.add(new Finish((console)));

    }
    public String menu(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < itemList.size(); i++) {
            stringBuilder.append(i+1);
            stringBuilder.append(". ");
            stringBuilder.append(itemList.get(i).getDescription());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void execute(int option){
        MainSimple mainItem = itemList.get(option-1);
        mainItem.execute();
    }
}
