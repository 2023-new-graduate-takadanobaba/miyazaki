package mazin;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class buu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ナメェを記入してください");
        String name = scanner.nextLine();
        System.out.println("こんにちは、"+name+"さん。");
        
        System.out.println("ウメェもんを入力してくれ！");
        Scanner foods = new Scanner(System.in);
        String line = foods.nextLine();
        String[] tmpList = line.split(",",0);
        //tmpListは食べ物のこと
        //下のlistは数値型のlistの箱
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<tmpList.length;i++)list.add(Integer.parseInt(tmpList[i]));
            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i));
                
            if(i != tmpList.length - 1)System.out.print(",");
        }
    }
}
