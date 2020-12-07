package bendercry;

import java.util.ArrayList;
import java.util.Scanner;

class Console {
    private ArrayList<String> text;
    public Console(){
        this.text = new ArrayList<String>();
    }
    public void input() {
        Scanner scan = new Scanner(System.in);
        String line = null;
        while(!(line = scan.nextLine()).isEmpty()) {
            text.add(line);
        }
    }
    public void output(){
        System.out.println("Файл не распознан. Введите ваши сообщения:");
        for(String s : text){
            System.out.println(s);
        }
    }
}
