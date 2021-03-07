import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.IOException;


public class kokomolinks {
    public static void main(String[] args) throws IOException {


        Document doc = Jsoup.connect("https://www.kokomotribune.com/news/local_news/").get();
        for(Element e: doc.select("a.tnt-asset-link")){
            System.out.println(e.attr("abs:href"));
            System.out.println(e.text());
            System.out.println();
        }
    }
}