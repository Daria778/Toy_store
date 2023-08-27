package View.Menu.AdminMenu;

import View.Console;
import View.Menu.SimpleMenu.MainSimple;

import java.util.ArrayList;
import java.util.List;

public class AdminMenu {
    private List<MainAdmin> itemList;
    public AdminMenu(Console console) {
        itemList = new ArrayList<>();
        itemList.add(new ShowToys((console)));
        itemList.add(new AddToy(console));
        itemList.add(new Save(console));
        itemList.add(new GetToy((console)));
        itemList.add(new ShowYourToys(console));
        itemList.add(new DeleteToy((console)));
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
        MainAdmin mainItem = itemList.get(option-1);
        mainItem.execute();
    }
}
