package karafplayground.consumer1;

import karafplayground.interface1.ResponderService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferencePolicyOption;

@Component
public class ConsumerOne {
  private ResponderService responder;

  @Reference(target = "(type=world)", unbind = "unsetResponder")
  public void setResponder(ResponderService responder) {
    this.responder = responder;
  }

  public void unsetResponder(ResponderService responder) {
    System.out.println("unsetResponder");
  }

  @Activate
  public void activate() {
    System.out.println("activate");
  }
}
