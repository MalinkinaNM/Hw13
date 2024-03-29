package ru.netology.hm13;

public class Epic extends Task {
    protected String[] subtask;

    public Epic(int id, String[] subtask) {
        super(id);
        this.subtask = subtask;
    }

    public String[] getSubtask() {
        return subtask;
    }

    @Override
    public boolean matches(String query) {
        for (String subtasks : subtask)
            if (subtasks.contains(query)) {
                return true;
            }
        return false;
    }

}