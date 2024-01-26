//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Pisin {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Ei parametreja");
        }
        else {
            String pisin = "";
            for(String parametri: args) {
                if(parametri.length() > pisin.length()) {
                    pisin = parametri;
                }
            }
            System.out.println("Pisin parametri: " + pisin);
        }
    }
}