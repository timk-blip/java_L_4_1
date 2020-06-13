import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        BonusMilesService service = new BonusMilesService();
        float price = 0;
        Scanner in = new Scanner(System.in);
        System.out.print ("Введите цену билета \n");
        price = in.nextFloat();
        System.out.print ("Вам начислено бесплатных миль \n" + service.calculate (price));
    }
}
// в следующий раз буду согласно требованиям делать. очень много времени убил) нужно больше опыта)