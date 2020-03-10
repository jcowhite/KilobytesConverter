public class Main {
        public static void main(String[] args) {
                printMegaBytesAndKiloBytes(2500);
        }

        public static void printMegaBytesAndKiloBytes(int kiloBytes){
                int XX = kiloBytes;
                double YY = kiloBytes / 1024;
                double ZZ =  kiloBytes % 1024 ;

                if (kiloBytes < 0){
                        System.out.println("Invalid Value");
                }else{
                        System.out.println(XX + " KB = " + YY + " MB and " + ZZ + " KB");
                }
        }
}
