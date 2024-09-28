public class SwimmingPool {
    public static void main(String[] args) {
        int volume = 1200; //pool volume
        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute

        int nowVolume = 0;
        int minutes = 0;
        while (nowVolume < volume) {
            nowVolume += fillingSpeed;
            nowVolume -= devastationSpeed;
            minutes++;
        }
        System.out.println("The pool will fill in " + minutes + " minutes.");
    }
}
