package karafplayground.interface1.impl;

import karafplayground.interface1.ResponderService;
import java.util.Map;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;

@Component(immediate = true,
    configurationPid = "ResponderService",
    configurationPolicy = ConfigurationPolicy.REQUIRE)
public class ResponderServiceImpl implements ResponderService {
  public String respondToMe() {
    return "Hello World!";
  }

  @Activate
  public void activate(final Map<String, Object> props) {
    System.out.println("activate");
  }
}
