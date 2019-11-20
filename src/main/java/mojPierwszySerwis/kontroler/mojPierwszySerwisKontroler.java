package mojPierwszySerwis.kontroler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mojPierwszySerwisKontroler {

	@RequestMapping(value="/")
	public String hello() {
	return "<html><body><b>sie odpalilem<p>druga linia</p></b></body></html>";
}
	@RequestMapping(value="/pozyczka")
	public String hello2() {
	return "<html><body><b>a tu pozyczka2<p>druga linia</p></b></body></html>";
}
}
