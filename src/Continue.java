public class Continue {
    public static void main(String[] args) {
        for(int i = 0; i<=15; i++){
            if (i%2==0){  // % значит подели на это число которое за процентом и посмотри остаток (остаток от деления)//
                continue;
            }
            System.out.println("Это нечетное чило"+i);
        }
    }
}
