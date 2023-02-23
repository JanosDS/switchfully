package advanced.solutions.codelab04.enrichment;

import advanced.solutions.codelab04.input.Performance;
import advanced.solutions.codelab04.input.Play;

import java.util.Arrays;
import java.util.Map;

public class EnrichedPerformanceFactory {

    private Map<String, Play> plays;

    public EnrichedPerformanceFactory(Map<String, Play> plays) {
        this.plays = plays;
    }

    public EnrichedPerformance[] createEnrichedPerformances(Performance[] performances) {
        return Arrays.stream(performances).map(p -> new EnrichedPerformance(getPlay(plays, p).name(), p.audience(), getPlay(plays, p).type())).toArray(EnrichedPerformance[]::new);
    }

    private Play getPlay(Map<String, Play> plays, Performance p) {
        return plays.get(p.playId());
    }
}
