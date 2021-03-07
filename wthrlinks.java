import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.IOException;


public class wthrlinks {
    public static void main(String[] args) throws IOException {


        Document doc = Jsoup.connect("https://www.wthr.com/categories/news/indianapolis-local-news").userAgent("Mozilla").get();
        //  Elements links = doc.select("a[href]");
       for(Element e: doc.select("div.linkList")){
           System.out.println(e.attr("abs:href"));
           System.out.println(e.text());
           System.out.println();
       }
    }
}