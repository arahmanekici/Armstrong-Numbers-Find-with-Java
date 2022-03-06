import java.util.Scanner;

public class Main {
    static public void main(String[] args) {


        int result=1;
        int basValue, total;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int number = input.nextInt();


        int coco = number;
        int basSayi= 0;

        while (coco!= 0) {
            coco= coco/10;
            basSayi++;
        }

        System.out.println("Basamak Sayisi: " +basSayi);
        coco=number;
        total= 0;


        while (coco!=0){
            basValue= coco%10;
            System.out.println("Basamak Degeri: "+basValue);
            result=1;
            for (int i =1; i<=basSayi; i++){

                result*=basValue;

            }
            System.out.println("Toplam Sonuc: " +result);
            total+=result;
            coco= coco/10;


        }
        System.out.println("Sonuc: " +total);

        if (total==number) {
            System.out.println(total+ " Sayisi bir Armstrong sayidir");
        }

        else {System.out.println(number+ " Sayisi bir Armstrong sayi DEGILDIR");}


    }
}
