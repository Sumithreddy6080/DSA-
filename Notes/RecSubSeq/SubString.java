public class SubString {

    public static void main(String[] args) {
        String st = "hey";
        printSub(st, "");
    }


    static void printSub(String in,String ot){
        if(in.length()==0){
            System.out.println(ot);
            return;
        }
        char ch = in.charAt(0);
        printSub(in.substring(1), ot+ch);
        printSub(in.substring(1), ot);
    }
    
}