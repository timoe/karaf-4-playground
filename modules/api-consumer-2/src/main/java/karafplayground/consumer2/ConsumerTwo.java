package karafplayground.consumer2;

import karafplayground.interface1.ResponderService;
import java.util.Map;
import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;

@Component
public class ConsumerTwo {

  @Reference(target = "(type=world)")
  private ResponderService responder;

  @Activate
  public void activate(final Map<String, Object> props) {
    System.out.println("activate");
  }
}
