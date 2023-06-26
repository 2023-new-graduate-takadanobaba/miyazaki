package mazin;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class buu {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("ナメェを記入してください");
            String name = scanner.nextLine();
            System.out.println("こんにちは、" + name + "さん。");

            System.out.println("ウメェもんを入力してくれ！");
            try (Scanner sc = new Scanner(System.in)) {
                String line = sc.nextLine();
                List<String> ListFoods = Arrays.asList(line.split(","));
                System.out.println(ListFoods);
                System.out.println(ListFoods.size());
                    if (line.length() == 0) {
                    System.out.println();
                } else if (ListFoods.size() == 1) {
                    System.out.println(name + "さんの好きな食べ物は" + ListFoods.get(0) + "ですね");
                } else if (ListFoods.size() > 1) {
                    System.out.print(name + "さんの好きな食べ物は");
                    for (int i = 0; i < ListFoods.size(); i++) {
                        // System.out.println(ListFoods.get(i) + "と、");
                        int size = ListFoods.size();
                        int indexOfLast = size - 1;
                        if (i == indexOfLast) {
                            System.out.print(ListFoods.get(i));
                        }else{
                        System.out.print(ListFoods.get(i) + "と、");
                        }
                    }
                    System.out.print("です");
                }
            }
        }

    }
}
