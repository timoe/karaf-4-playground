package karafplayground.consumer2;

import java.util.Map;
import karafplayground.interface1.ScrResponderService;
import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;

@Component
public class ConsumerTwo {

  @Reference(target = "(type=world)")
  private ScrResponderService responder;

  @Activate
  public void activate(final Map<String, Object> props) {
    System.out.println("ConsumerTwo#activate");
  }
}
