package eq.zSanchez.Quest;

public class Quest {
    private String id;
    private String description;
    private int reward; // dinero que dará al completar

    public Quest(String id, String description, int reward) {
        this.id = id;
        this.description = description;
        this.reward = reward;
    }

    public String getId() { return id; }
    public String getDescription() { return description; }
    public int getReward() { return reward; }
}
