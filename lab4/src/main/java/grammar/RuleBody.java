package grammar;

import java.util.List;
import java.util.stream.Collectors;

public record RuleBody(List<Sequence> sequences) {
    public List<String> elementsNames() {
        return sequences.stream()
                .flatMap(p -> p.elements()
                        .stream()
                        .map(Element::name))
                .collect(Collectors.toList());
    }
}
