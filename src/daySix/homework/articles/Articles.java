package daySix.homework.articles;

import java.util.Scanner;

public class Articles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] article = scanner.nextLine().split(", ");
        Marticles newArtical = new Marticles(article[0],article[1],article[2]);
        int num = Integer.parseInt(scanner.nextLine());
        String commands  = "";

        for (int i = 0; i < num; i++) {
            commands = scanner.nextLine();
            String[] comm = commands.split(": ");
            if("Edit".equals(comm[0])){
                newArtical.edit(comm[1]);

            }else if ("ChangeAuthor".equals(comm[0])){
                newArtical.changeAuthor(comm[1]);

            }else if ("Rename".equals(comm[0])){
                newArtical.rename(comm[1]);
            }

        }

        newArtical.printer();

    }
}
class Marticles {
    private String title ;
    private String content ;
    private String author ;

    public Marticles(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;

    }
    public void printer(){
        System.out.println(this.title+" - "+this.content+": "+this.author);
    }

    public void edit(String content) {
        this.content = content;
    }
    public void changeAuthor(String author){
        this.author = author;
    }
    public void rename(String title){
        this.title = title;
    }


}
