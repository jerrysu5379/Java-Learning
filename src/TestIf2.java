public class TestIf2 {
    public static void main(String[] args) {
        int num=(int) (Math.random()*26);
        char cap=(char)('A'+num);
        if(cap=='A'||cap=='E'||cap=='I'||cap=='O'||cap=='U') System.out.println("元音"+cap);
        else System.out.println("辅音"+cap);
    }
}
