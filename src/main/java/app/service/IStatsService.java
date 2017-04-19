package app.service;

import app.model.Stats;
import app.model.Value;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matts on 19.04.2017.
 */
public interface IStatsService {

    Stats stats = new Stats();
    List<Value> values = new ArrayList<Value>();

    public Stats getStats();
    public List<Value> getValues();
    public String getStatsJSON();
    public void updateStats(Value value);
    public void updateStatsJson(String json);

}
