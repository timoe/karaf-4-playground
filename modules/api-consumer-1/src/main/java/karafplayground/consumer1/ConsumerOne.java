package karafplayground.consumer1;

import karafplayground.interface1.ResponderService;
import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;

@Component
public class ConsumerOne {
  @Reference(target = "(type=world)")
  private ResponderService responder;

  @Activate
  public void activate() {
    System.out.println("activate");
  }
}
