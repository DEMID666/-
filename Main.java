import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)throws FileNotFoundException{
        int x = (int)(Math.random() * 100);
        int y = 0;
        int z = 0;
        Scanner sc = new Scanner(System.in);
        while(x != y){
            y = sc.nextInt();
            z ++;
            if(y > x){
                System.out.println("Не ожидал от тебя такого.Загаданное число меньше,брат");
            } else if(y < x) {
                System.out.println("Я сам в шоке,но,загаданное число больше,брат");
            } else {
                System.out.println("Брат ты угадал!!!");
                System.out.println("Количество попыток " + z);
                String separator = File.separator;
                String rast = separator + "Users" + separator + "demid" + separator + "Desktop" + separator + "rast.txt";
                File file = new File(rast);
                try {
                    if(!file.exists()){
                        file.createNewFile();
                        PrintWriter pw = new PrintWriter(file);
                        pw.print("20");
                        pw.close();
                    }
                } catch(IOException e){
                    System.out.println("Error" + e);
                }
                Scanner scanner = new Scanner(file);
                int w = scanner.nextInt();
                if(w > z){
                    System.out.println("Так ты еще новый рекорд поставил!!!");
                    PrintWriter pw = new PrintWriter(file);
                    pw.println(z);
                    pw.close();
                } else {
                    System.out.println("Лучший результат:" + w);
                }


            }
        }
        }
    }
