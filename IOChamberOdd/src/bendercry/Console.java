package bendercry;

import java.util.ArrayList;
import java.util.Scanner;

class Console {
    private ArrayList<String> text;
    public Console(){
        this.text = new ArrayList<String>();
    }
    public void input() {
        System.out.println("Файл не распознан. Введите ваши сообщения:");
        Scanner scan = new Scanner(System.in);
        String line = null;
        while(!(line = scan.nextLine()).isEmpty()) {
            text.add(line);
        }
    }
    public void output(){
        int i = 1;
        for(String s : text){
            if(i%2 != 0) System.out.println(s);
            i++;
        }
    }
}
