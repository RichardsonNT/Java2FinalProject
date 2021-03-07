import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.IOException;


public class onionlinks {
    public static void main(String[] args) throws IOException {

        Document doc = Jsoup.connect("https://local.theonion.com/").get();
        for(Element e: doc.select("a.local")){
            System.out.println(e.attr("abs:href"));
            System.out.println(e.text());
            System.out.println();
        }
    }
}