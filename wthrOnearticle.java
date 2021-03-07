import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * This class is used for HTML parsing from URL using Jsoup.
 */
public class wthrOnearticle {
    public static void main(String args[]){
        print("running...");
        Document document;
        try {
            //Get Document object after parsing the html from given url.
            document = Jsoup.connect("https://www.wthr.com/article/indy-mini-named-americas-best-half-marathon").get();

            String title = document.title(); //Get title
            print("  Title: " + title); //Print title.

            Elements body = document.getElementsByTag("p"); //gets the body of the article
            Elements time = document.getElementsByClass("timeago published");
            Elements related = document.getElementsByClass( "skos:Concept");
            Elements author = document.getElementsByClass("author_name");


            FileOutputStream fout=new FileOutputStream("wthr.csv");
            PrintStream csv = new PrintStream(fout);
            csv.println("Article Title: "+ title);//Print title in document
            csv.println("Author: "+ author);

            csv.println("Article's Body:");
            csv.print(body);
            csv.println("Date Published: ");
            csv.print(time);

            csv.println("Related links:");
            csv.print(related);



            fout.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void print(String string) {
        System.out.println(string);
    }

}