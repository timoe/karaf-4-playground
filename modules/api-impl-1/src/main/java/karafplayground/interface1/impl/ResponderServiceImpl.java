package karafplayground.interface1.impl;

import karafplayground.interface1.ResponderService;
import java.util.Map;
import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.ConfigurationPolicy;
import org.apache.felix.scr.annotations.Service;

@Component(immediate = true,
    configurationPid = "ResponderService",
    policy = ConfigurationPolicy.REQUIRE)
@Service
public class ResponderServiceImpl implements ResponderService {
  public String respondToMe() {
    return "Hello World!";
  }

  @Activate
  public void activate(final Map<String, Object> props) {
    System.out.println("activate");
  }
}
