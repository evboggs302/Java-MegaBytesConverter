public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }

        int mega = kiloBytes / 1024;
        int kilo = kiloBytes % 1024;

        System.out.println(kiloBytes + " KB = " + mega + " MB and " + kilo + " KB ");
    }
}
