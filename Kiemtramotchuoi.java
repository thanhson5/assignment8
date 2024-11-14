public class Kiemtramotchuoi {
    public static boolean laPalindrome(String chuoi){
        int dau = 0;
        int cuoi = chuoi.length() -1;
        
        while (dau < cuoi){
            if (chuoi.charAt(dau) != chuoi.charAt(cuoi)){
                return false;
            }
            dau++;
            cuoi--;
        }
        return true;
    }
    
    public static void main(String[] arges){
        String chuoi1 = "madam";
        String chuoi2 = "Hello";
        
        System.out.println("chuoi' "+chuoi1+ " 'la chuoi doi xung:" + laPalindrome(chuoi1));
        System.out.println("chuoi' "+chuoi2+ " 'la chuoi doi xung:" + laPalindrome(chuoi2));
    }
}
