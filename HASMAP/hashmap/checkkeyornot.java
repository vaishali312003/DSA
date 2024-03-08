import java.util.HashMap;

public class checkkeyornot{
    public static void main(String[] args) {
        HashMap<String,Integer> var=new HashMap<>();
        var.put("INDIA",10);
        var.put("CHINA",10);
        if(var.containsKey("IN")){
            System.out.println("YES");
        }
        else{
             System.out.println("NO");
        }
    }
}
