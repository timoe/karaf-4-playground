package karafplayground.consumer1;

import karafplayground.interface1.ResponderService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component
public class ConsumerOne {
  @Reference(target = "(type=world)")
  private ResponderService responder;

  @Activate
  public void activate() {
    System.out.println("activate");
  }
}
