package bendercry;

public class IOChamber {

    public static void main(String[] args) {
        if(args.length == 0) {
            Console console = new Console();
            console.input();
            console.output();
        }
        else{
            Txt txt = new Txt();
            txt.input(args[0]);
            txt.output();
        }
    }
}
