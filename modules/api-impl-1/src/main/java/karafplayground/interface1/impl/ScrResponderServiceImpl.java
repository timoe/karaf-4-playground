package karafplayground.interface1.impl;

import java.util.Map;
import karafplayground.interface1.ScrResponderService;
import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.ConfigurationPolicy;
import org.apache.felix.scr.annotations.Service;

@Component(immediate = true,
    configurationPid = "ScrResponderService",
    policy = ConfigurationPolicy.REQUIRE)
@Service
public class ScrResponderServiceImpl implements ScrResponderService {
  public String respondToMe() {
    return "Hello World!";
  }

  @Activate
  public void activate(final Map<String, Object> props) {
    System.out.println("ScrResponderServiceImpl#activate");
  }
}
