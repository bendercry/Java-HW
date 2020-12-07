package bendercry;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Txt {
    private ArrayList<String> text;
    public Txt(){
        this.text = new ArrayList<String>();
    }
    public void input(String path){
        try(FileReader reader = new FileReader(path)){
            Scanner scan = new Scanner(reader);

            while(scan.hasNextLine()) {
                text.add(scan.nextLine());
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public void output(){
        int i = 0;
        for(String s : text){
            if(i%2 != 0) System.out.println(s);
            i++;
        }
    }
}
