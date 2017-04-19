package app.service;

import app.model.Stats;
import app.model.Value;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.scene.chart.PieChart;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Created by Matts on 19.04.2017.
 */
@Service
public class StatsService implements IStatsService {


    private ObjectMapper mapper = new ObjectMapper();

    public Stats getStats() {
        return stats;
    }

    public List<Value> getValues() {
        return values;
    }

    public String getStatsJSON() {
        try {
            return mapper.writeValueAsString(stats);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "error";
    }

    public synchronized void updateStats(Value value) {
        double sum = 0;
        double avg;
        if (value.getValue() > stats.getMax()) {
            stats.setMax(value.getValue());
        } if (value.getValue() < stats.getMin() || (stats.getMin() == 0 && values.size() == 0)) {
            stats.setMin(value.getValue());
        }
        values.add(value);
        for (Value v : values) {
            sum += v.getValue();
        }
        avg = sum / values.size();
        stats.setAvg(avg);
        stats.setTimeEnd(DateTime.now().toDateTime().toString());
    }

    public synchronized void updateStatsJson(String json) {
        try {
            Value value = mapper.readValue(json, Value.class);
            updateStats(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
