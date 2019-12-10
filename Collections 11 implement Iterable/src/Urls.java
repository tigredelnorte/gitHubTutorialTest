import java.util.Iterator;
import java.util.LinkedList;

public class Urls implements Iterable<String> {
	private LinkedList<String>urllinks = new LinkedList<String>();
	public Urls() {
	urllinks.add("http://www.gazeta.pl");
	urllinks.add("http://www.onet.pl");
	urllinks.add("http://www.laskizklaski.pl");
	}
	@Override
	public Iterator<String> iterator() {

		return urllinks.iterator();
	}
}
