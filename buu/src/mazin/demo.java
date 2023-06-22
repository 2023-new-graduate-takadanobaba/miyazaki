package mazin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] tmpList = line.split(",", 0);
        List<Integer> list = new ArrayList();
        for(int i = 0; i < tmpList.length; i++) list.add(Integer.parseInt(tmpList[i]));
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if(i != tmpList.length - 1) System.out.print(",");
        }
    }
}
    

