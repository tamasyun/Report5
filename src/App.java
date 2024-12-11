public class App {
    public static void main(String[] args) throws Exception {
        String str = null;
        try{
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("NullPointerExceptionが発生しました");
            System.out.println(e.getMessage());
        }
    }
}