package karafplayground.blueprint.consumer;

import karafplayground.interface1.BlueprintResponderService;
import karafplayground.interface1.ScrResponderService;

public class BluePrintConsumer {
  public BluePrintConsumer(final BlueprintResponderService blueprintResponderService,
      final ScrResponderService scrResponderService) {
    System.out.println("BluePrintConsumer initiated");
    System.out
        .println("blueprintResponderService#respondToMe=" + blueprintResponderService.respondToMe()
            + " scrResponderService#respondToMe" + scrResponderService.respondToMe());
  }
}
