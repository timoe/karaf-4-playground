package karafplayground.consumer2;

import karafplayground.interface1.ResponderService;
import java.util.Map;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferencePolicyOption;

@Component
public class ConsumerTwo {

  @Reference(target = "(type=world)")
  private ResponderService responder;

  @Activate
  public void activate(final Map<String, Object> props) {
    System.out.println("activate");
  }
}
