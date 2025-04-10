public class PrintNamePyramid {
    public static void printNamePyramid(String name, int len){
        if(len==0) return;
        printNamePyramid(name,--len);
        System.out.println(name.substring(0,len));
    }
    public static void main(String[] args) {
        String name = "arushi";
        printNamePyramid(name,name.length());
    }
}
