package karafplayground.consumer1;

import karafplayground.interface1.ScrResponderService;
import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;

@Component
public class ConsumerOne {
  @Reference(target = "(type=world)")
  private ScrResponderService responder;

  @Activate
  public void activate() {
    System.out.println("ConsumerOne#activate");
  }
}
