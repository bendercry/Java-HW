package bendercry;

import java.util.ArrayList;
import java.util.Scanner;

class Read {
    private ArrayList<String> text;
    public Read(){
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
        for(String s : text){
            System.out.println(s);
        }
    }
}
