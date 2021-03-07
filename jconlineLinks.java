import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;


public class jconlineLinks {

    public String jconlineLinks() throws IOException{
        String url = "";
        Document doc = Jsoup.connect("https://www.jconline.com/").get();
        for(Element e: doc.select("a.flh3m-link")){
            url = e.attr("abs:href");

        }
        return url.toString();
    }
}