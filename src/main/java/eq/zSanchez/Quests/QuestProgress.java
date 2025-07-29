package eq.zSanchez.Quests;

public class QuestProgress {
    private Quest quest;
    private int currentProgress;
    private boolean completed;

    public QuestProgress(Quest quest) {
        this.quest = quest;
        this.currentProgress = 0;
        this.completed = false;
    }

    public Quest getQuest() {
        return quest;
    }

    public int getCurrentProgress() {
        return currentProgress;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void addProgress(int amount) {
        if (completed) return;

        this.currentProgress += amount;

        // Cuando se completa la misión
        if (this.currentProgress >= 10) { // Por ejemplo, 10 bloques rotos
            this.currentProgress = 10;
            this.completed = true;
        }
    }
}
