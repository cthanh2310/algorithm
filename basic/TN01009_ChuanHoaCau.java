package practice.basic;

import java.util.Scanner;

public class TN01009_ChuanHoaCau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            String s = scanner.nextLine();
            System.out.println(chuanHoa(s));
        }
    }

    private static String chuanHoa(String str) {
        String result = "";
        String s[] = str.trim().toLowerCase().split("\\s+");
        result = s[0].substring(0,1).toUpperCase()+s[0].substring(1);

        for(int i = 1; i < s.length;i++){
            if(check(s[i].charAt(0)))
                result += s[i];
            else result += " "+s[i];
        }

        if(!check(result.charAt(result.length()-1)))
            result +=".";
        return result;
    }

    private static boolean check(char c){ // không cần quan tâm xem dấu câu là gì
        if((c+"").matches("\\w")) // w là từ đại diện cho word[a-zA-Z0-9]
            return false;
        return true;
    }
}
