package daySix.homework.Articles2_0;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<ArticleConstruct> articles =  new ArrayList<>();

        for (int i = 0; i <n ; i++) {

            String[] in  = scanner.nextLine().split(", ");

            articles.add(new ArticleConstruct(in[0],in[1],in[2]));


        }
          String sorter = scanner.nextLine();
            switch (sorter){
                case "title":
                    articles.stream().sorted((p1,p2)->p1.getTitle().compareTo(p2.getTitle())).forEach(e->{
                        System.out.println(String.format("%s - %s: %s",e.getTitle(),e.getContent(),e.getAuthor()));
                    });

                    break;

                case "content":
                    articles.stream().sorted((p1,p2)->p1.getContent().compareTo(p2.getContent())).forEach(e->{
                        System.out.println(String.format("%s - %s: %s",e.getTitle(),e.getContent(),e.getAuthor()));
                    });

                    break;

                case "author":
                    articles.stream().sorted((p1,p2)->p1.getAuthor().compareTo(p2.getAuthor())).forEach(e->{
                        System.out.println(String.format("%s - %s: %s",e.getTitle(),e.getContent(),e.getAuthor()));
                    });

                    break;
            }






    }
}
